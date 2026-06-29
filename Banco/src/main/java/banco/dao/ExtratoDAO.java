/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.dao;
import banco.model.Extrato;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author henry
 */
public class ExtratoDAO {


public void salvar(Extrato e){


String sql =
"INSERT INTO extrato(conta_id,tipo,valor) VALUES(?,?,?)";


try{

Connection con = ConexaoDB.conectar();

PreparedStatement ps =
con.prepareStatement(sql);


ps.setLong(1,e.getContaId());

ps.setString(2,e.getTipo());

ps.setDouble(3,e.getValor());


ps.executeUpdate();


}catch(Exception ex){

ex.printStackTrace();

}

}



public ArrayList<Extrato> listar(long id){


ArrayList<Extrato> lista = new ArrayList<>();


String sql =
"SELECT * FROM extrato WHERE conta_id=?";


try{

Connection con = ConexaoDB.conectar();


PreparedStatement ps =
con.prepareStatement(sql);


ps.setLong(1,id);


ResultSet rs = ps.executeQuery();



while(rs.next()){


Extrato e = new Extrato();


e.setId(rs.getLong("id"));

e.setContaId(rs.getLong("conta_id"));

e.setTipo(rs.getString("tipo"));

e.setValor(rs.getDouble("valor"));

e.setData(
rs.getTimestamp("data").toLocalDateTime()
);


lista.add(e);

}


}catch(Exception ex){

ex.printStackTrace();

}


return lista;

}


}
