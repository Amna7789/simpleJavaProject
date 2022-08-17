package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public void showStudents() {
//        Connection conn = DBConnection.getDBConnection("jdbc:mysql://localhost:3306/amnadb", "root", "");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amnadb", "root", "");
            Statement stat = conn.createStatement();
            String sql = "select * from user";

            ResultSet rs = stat.executeQuery(sql);

            List<User> users = new ArrayList<>();

            while(rs.next()) {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNo(rs.getInt("phoneNo"));
                user.setCreatedDate(rs.getDate("created_date"));

                users.add(user);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
