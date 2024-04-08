package conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
        private static final  String URL = "jdbc:mysql://localhost:3306/eles";
        private static final  String USUARIO = "root";
        private static final  String SENHA = "";
        //private static final  String driver = "";
        
        public static Connection conectar() throws SQLException {
        return (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
