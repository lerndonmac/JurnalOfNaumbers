package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorToBD {
    public static final String DB_URL ="jdbc:mysql://localhost:3306/oceki_exam?serverTimezone=UTC";
    public static final String DB_DRIVER ="com.mysql.cj.jdbc.Driver";
    public static final String DB_USER ="root";
    public static final String DB_PASWORD ="1234";

    public static Connection getConnect(){
        Connection con = null;
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASWORD);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
}
