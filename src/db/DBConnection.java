package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getDBConnection(String URL, String userName, String pswd) {

        Connection conn;

        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, userName, pswd);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return conn;
    }

    /** first step to connect with DB
    * 1. Register Driver
    * 2. Connect with DB
    * 3. Statement
    * 4. Query Executor
    * 5. ResultSet*/

}
