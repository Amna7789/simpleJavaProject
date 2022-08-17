package amydb;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    public void displayAdmins(){
        Connection conn = Database.getDatabaseConnection("jdbc:mysql://localhost:3306/amydb", "root", "");
        try{
            Statement s = conn.createStatement();
            String sql = "select * from admins";
            ResultSet r = s.executeQuery(sql);
            List<Admins> admins = new ArrayList<>();

            while (r.next()){

                Admins a = new Admins();
                a.setId(r.getString("id"));
                a.setName(r.getString("name"));
                a.setEmail(r.getString("email"));
                a.setPhoneNo(r.getString("phoneNo"));
                a.setCreatedDate(r.getDate("created_Date"));
                admins.add(a);
                /*System.out.println(r.getString("id"));
                System.out.println(r.getString("name"));
                System.out.println(r.getString("email"));
                System.out.println(r.getString("phoneNo"));*/

        }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
