/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.dao;


import banco.model.Cliente;
import banco.model.Conta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author henry
 */
public class ContaDAO {
    public void inserir(Conta conta) {

    try {

        Connection con = ConexaoDB.conectar();

        String sql = "INSERT INTO contas(numero, agencia, saldo, tipo, cliente_id) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, conta.getNumero());
        ps.setString(2, conta.getAgencia());
        ps.setDouble(3, conta.getSaldo());
        ps.setString(4, conta.getTipo());
        ps.setLong(5, conta.getCliente().getId());

        ps.executeUpdate();

    } catch (Exception e) {
        
    }
}
    public List<Conta> listar() {

    List<Conta> lista = new ArrayList<>();

    try {

        Connection con = ConexaoDB.conectar();

        String sql = """
            SELECT c.*, cl.nome
            FROM contas c
            JOIN clientes cl ON c.cliente_id = cl.id
            ORDER BY c.id
        """;

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Cliente cliente = new Cliente();

            cliente.setId(rs.getLong("cliente_id"));
            cliente.setNome(rs.getString("nome"));

            Conta conta = new Conta();

            conta.setId(rs.getLong("id"));
            conta.setNumero(rs.getString("numero"));
            conta.setAgencia(rs.getString("agencia"));
            conta.setSaldo(rs.getDouble("saldo"));
            conta.setTipo(rs.getString("tipo"));
            conta.setCliente(cliente);

            lista.add(conta);
        }

    } catch (Exception e) {
     
    }

    return lista;
}
    public Conta buscarPorId(long id) {

    try {

        Connection con = ConexaoDB.conectar();

        String sql = """
            SELECT c.*, cl.nome
            FROM contas c
            JOIN clientes cl ON c.cliente_id = cl.id
            WHERE c.id = ?
        """;

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            Cliente cliente = new Cliente();
            cliente.setId(rs.getLong("cliente_id"));
            cliente.setNome(rs.getString("nome"));

            Conta conta = new Conta();

            conta.setId(rs.getLong("id"));
            conta.setNumero(rs.getString("numero"));
            conta.setAgencia(rs.getString("agencia"));
            conta.setSaldo(rs.getDouble("saldo"));
            conta.setTipo(rs.getString("tipo"));
            conta.setCliente(cliente);

            return conta;
        }

    } catch (Exception e) {
       
    }

    return null;
}
    public void atualizar(Conta conta) {

    try {

        Connection con = ConexaoDB.conectar();

        String sql = """
            UPDATE contas
            SET numero = ?, agencia = ?, saldo = ?, tipo = ?, cliente_id = ?
            WHERE id = ?
        """;

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, conta.getNumero());
        ps.setString(2, conta.getAgencia());
        ps.setDouble(3, conta.getSaldo());
        ps.setString(4, conta.getTipo());
        ps.setLong(5, conta.getCliente().getId());
        ps.setLong(6, conta.getId());

        ps.executeUpdate();

    } catch (Exception e) {
        
    }
}
    public void excluir(long id) {

    try {

        Connection con = ConexaoDB.conectar();

        String sql = "DELETE FROM contas WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setLong(1, id);

        ps.executeUpdate();

    } catch (Exception e) {
    }
}
    
}
