package banco.dao;

import banco.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private String nome;
    private String perfil;

    public boolean validarLogin(String login, String senha) {

        try {

            Connection con = ConexaoDB.conectar();

            String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                nome = rs.getString("nome");
                perfil = rs.getString("perfil");
                return true;
            }

            return false;

        } catch (Exception e) {
          
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public List<Usuario> listar() {

        List<Usuario> lista = new ArrayList<>();

        try {

            Connection con = ConexaoDB.conectar();

            String sql = "SELECT * FROM usuarios ORDER BY id";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Usuario u = new Usuario();

                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setPerfil(rs.getString("perfil"));

                lista.add(u);
            }

        } catch (Exception e) {
           
        }

        return lista;
    }

    public void inserir(Usuario usuario) {

        try {

            Connection con = ConexaoDB.conectar();

            String sql = "INSERT INTO usuarios(login, senha, nome, perfil) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.setString(4, usuario.getPerfil());

            ps.executeUpdate();

        } catch(Exception e) {

}
    }

    public void excluir(int id) {

        try {

            Connection con = ConexaoDB.conectar();

            String sql = "DELETE FROM usuarios WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch(Exception e) {

}
    }
    public void atualizar(Usuario usuario) {

    try {

        Connection con = ConexaoDB.conectar();

        String sql = "UPDATE usuarios SET login = ?, senha = ?, nome = ?, perfil = ? WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, usuario.getLogin());
        ps.setString(2, usuario.getSenha());
        ps.setString(3, usuario.getNome());
        ps.setString(4, usuario.getPerfil());
        ps.setInt(5, usuario.getId());

        ps.executeUpdate();

    } catch (Exception e) {
        
    }
}
public Usuario buscarPorId(long id) {

    try {

        Connection con = ConexaoDB.conectar();

        String sql = "SELECT * FROM usuarios WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setLong(1, id);

        ResultSet rs = ps.executeQuery();


        if(rs.next()) {

            Usuario u = new Usuario();

            u.setId(rs.getInt("id"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setNome(rs.getString("nome"));
            u.setPerfil(rs.getString("perfil"));

            return u;
        }


    } catch(Exception e) {

    }


    return null;
}
}