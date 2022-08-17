package userInputDb;

import java.sql.*;
import java.util.Scanner;
import java.util.UUID;

public class UserInputService {
    public void getUserInput(){
        Scanner sc = new Scanner(System.in);
        Connection conn = UserDatabaseConnection.getDbConnection("jdbc:mysql://localhost:3306/amnadb", "root", "");
        try {

            System.out.println("Enter userName ");
            String name = sc.next();
            System.out.println("Enter userEmail ");
            String email = sc.next();

            UUID id = UUID.randomUUID();
            int phoneNo = 7685;
            Date d  = new Date(System.currentTimeMillis());
            String query = " insert into user (id, name, email,phoneNo, created_date)"
                    + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, id.toString());
            preparedStmt.setString (2, name);
            preparedStmt.setString (3, email);
            preparedStmt.setInt (4, phoneNo);
            preparedStmt.setDate (5, d);
            preparedStmt.execute();



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
