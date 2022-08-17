package userInputDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDatabaseConnection {

    public static Connection getDbConnection(String url, String userName, String password){
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;

    }

}
