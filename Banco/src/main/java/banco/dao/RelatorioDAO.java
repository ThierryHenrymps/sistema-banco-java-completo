/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.dao;
import java.sql.*;

/**
 *
 * @author henry
 */
public class RelatorioDAO {


public double totalDepositos(){

String sql =
"SELECT SUM(valor) FROM extrato WHERE tipo='DEPOSITO'";


try{

Connection con = ConexaoDB.conectar();

PreparedStatement ps =
con.prepareStatement(sql);


ResultSet rs = ps.executeQuery();


if(rs.next()){
    return rs.getDouble(1);
}


}catch(Exception e){
    e.printStackTrace();
}


return 0;

}




public double totalSaques(){

String sql =
"SELECT SUM(valor) FROM extrato WHERE tipo='SAQUE'";


try{

Connection con = ConexaoDB.conectar();

PreparedStatement ps =
con.prepareStatement(sql);


ResultSet rs = ps.executeQuery();


if(rs.next()){
    return rs.getDouble(1);
}


}catch(Exception e){
    e.printStackTrace();
}


return 0;

}




public int totalMovimentos(){

String sql =
"SELECT COUNT(*) FROM extrato";


try{

Connection con = ConexaoDB.conectar();

PreparedStatement ps =
con.prepareStatement(sql);


ResultSet rs = ps.executeQuery();


if(rs.next()){
    return rs.getInt(1);
}


}catch(Exception e){
    e.printStackTrace();
}


return 0;

}


}
