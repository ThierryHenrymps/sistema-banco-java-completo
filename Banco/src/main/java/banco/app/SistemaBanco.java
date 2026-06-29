/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package banco.app;
import java.sql.Connection;
import banco.dao.ConexaoDB;
import ui.TelaLogin;
/**
 * 
 * @author henry
 */
public class SistemaBanco {

    public static void main(String[] args) {
        Connection con = ConexaoDB.conectar();

        if (con != null) {
            System.out.println("Conectado com sucesso!");
        } else {
            System.out.println("Falha na conexao!");
        }
      new TelaLogin().setVisible(true);
      

    }
}
