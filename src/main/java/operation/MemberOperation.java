package operation;

import connection.MySqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MemberOperation {
    Scanner sc = new Scanner(System.in);
    public void addMember(){
        try{
            Connection con = MySqlConnection.getConnection();
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter email: ");
            String email = sc.nextLine();

            String query = "INSERT INTO members(name,email) values(?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1,name);
            ps.setString(2,email);
            ps.executeUpdate();
            System.out.println("Member added successfully!");

            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
