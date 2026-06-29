package banco.dao;

import banco.model.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {


public boolean inserir(Cliente cliente){

try{

Connection con = ConexaoDB.conectar();

String sql =
"INSERT INTO clientes(nome,cpf,telefone) VALUES (?,?,?)";


PreparedStatement ps =
con.prepareStatement(sql);


ps.setString(1, cliente.getNome());
ps.setString(2, cliente.getCpf());
ps.setString(3, cliente.getTelefone());


ps.executeUpdate();


return true;


}catch(Exception e){

return false;

}

}



public List<Cliente> listar(){

List<Cliente> lista = new ArrayList<>();


try{


Connection con =
ConexaoDB.conectar();


String sql =
"SELECT * FROM clientes ORDER BY id";


PreparedStatement ps =
con.prepareStatement(sql);


ResultSet rs =
ps.executeQuery();



while(rs.next()){


Cliente c = new Cliente();


c.setId(rs.getLong("id"));
c.setNome(rs.getString("nome"));
c.setCpf(rs.getString("cpf"));
c.setTelefone(rs.getString("telefone"));


lista.add(c);

}



}catch(Exception e){


}


return lista;

}



public Cliente buscarPorId(long id){


try{


Connection con =
ConexaoDB.conectar();


PreparedStatement ps =
con.prepareStatement(
"SELECT * FROM clientes WHERE id=?"
);


ps.setLong(1,id);


ResultSet rs =
ps.executeQuery();



if(rs.next()){


Cliente c = new Cliente();


c.setId(rs.getLong("id"));
c.setNome(rs.getString("nome"));
c.setCpf(rs.getString("cpf"));
c.setTelefone(rs.getString("telefone"));


return c;


}



}catch(Exception e){



}



return null;

}




public void atualizar(Cliente cliente){


try{


Connection con =
ConexaoDB.conectar();



PreparedStatement ps =
con.prepareStatement(
"UPDATE clientes SET nome=?, cpf=?, telefone=? WHERE id=?"
);



ps.setString(1,cliente.getNome());
ps.setString(2,cliente.getCpf());
ps.setString(3,cliente.getTelefone());
ps.setLong(4,cliente.getId());


ps.executeUpdate();



}catch(Exception e){


}


}




public void excluir(long id){


try{


Connection con =
ConexaoDB.conectar();


PreparedStatement ps =
con.prepareStatement(
"DELETE FROM clientes WHERE id=?"
);



ps.setLong(1,id);


ps.executeUpdate();



}catch(Exception e){


}


}


}