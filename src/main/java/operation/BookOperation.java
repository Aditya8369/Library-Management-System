package operation;

import connection.MySqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookOperation {
    Scanner sc = new Scanner(System.in);
    public void addBook(){
        try{
            Connection con = MySqlConnection.getConnection();
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            String query = "INSERT INTO books(title,author,quantity) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,title);
            ps.setString(2,author);
            ps.setInt(3,quantity);

            ps.executeUpdate();
            System.out.println("Book added successfully!");
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }


}
