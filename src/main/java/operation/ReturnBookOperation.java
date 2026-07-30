package operation;

import connection.MySqlConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ReturnBookOperation {
    Scanner sc = new Scanner(System.in);
    public void returnBook(){
        try{
            Connection con = MySqlConnection.getConnection();
            System.out.print("Enter issue ID: ");
            int issueId = sc.nextInt();
            Date returnDate = new Date(System.currentTimeMillis());
            String query = "UPDATE issue_book SET return_date=? WHERE issue_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1,returnDate);
            ps.setInt(2,issueId);
            ps.executeUpdate();
            System.out.println("Book returned successfully");
            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
