package taskdb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentMarksService {
    public void displayResult(){
        Connection conn = DatabaseConnect.getDbConnect("jdbc:mysql://localhost:3306/amnadb", "root", "");
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM user INNER JOIN studentMarks ON user.id= studentMarks.id";
            ResultSet r = st.executeQuery(sql);
            while(r.next()){
                System.out.println(r.getString(1));
                System.out.println(r.getString(2));
                System.out.println(r.getString(3));
                System.out.println(r.getString(4));
                System.out.println(r.getString(5));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
