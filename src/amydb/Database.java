package amydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection getDatabaseConnection(String url, String userName, String password) {
        Connection conn;
        try {
            //Class.forName("com.mysql.jdbc.driver");
            conn = DriverManager.getConnection(url, userName, password);

        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
        return conn;

    }
}
