package operation;

import connection.MySqlConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class IssueBookOperation {
    Scanner sc = new Scanner(System.in);
    public void issueBook(){
        try{
            Connection con = MySqlConnection.getConnection();
            System.out.print("Enter book id: ");
            int bookId = sc.nextInt();

            System.out.print("Enter member id: ");
            int memberId = sc.nextInt();

            Date issueDate = new Date(System.currentTimeMillis());
            String query = "INSERT INTO issue_book(book_id,member_id,issue_date) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,bookId);
            ps.setInt(2,memberId);
            ps.setDate(3,issueDate);
            ps.executeUpdate();

            System.out.println("Book issued successfully!");
            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
