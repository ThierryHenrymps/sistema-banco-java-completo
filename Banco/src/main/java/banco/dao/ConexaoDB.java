package banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {

    private static Connection conexao;

    private static final String URL =
            "jdbc:postgresql://localhost:2222/henrybank";

    private static final String USUARIO = "postgres";
    private static final String SENHA = "123456";

    public static Connection conectar() {

        try {

            if (conexao == null || conexao.isClosed()) {

                conexao = DriverManager.getConnection(
                        URL,
                        USUARIO,
                        SENHA
                );
            }

            return conexao;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}