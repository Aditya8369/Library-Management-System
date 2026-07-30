package operation;

import connection.MySqlConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayOperation {

    public void displayBooks() {

        try {

            Connection con = MySqlConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM books");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("book_id")
                                + " | "
                                + rs.getString("title")
                                + " | "
                                + rs.getString("author")
                                + " | "
                                + rs.getInt("quantity"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayMembers() {

        try {

            Connection con = MySqlConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM members");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("member_id")
                                + " | "
                                + rs.getString("name")
                                + " | "
                                + rs.getString("email"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayIssuedBooks() {

        try {

            Connection con = MySqlConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM issue_book");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("issue_id")
                                + " | "
                                + rs.getInt("book_id")
                                + " | "
                                + rs.getInt("member_id")
                                + " | "
                                + rs.getDate("issue_date")
                                + " | "
                                + rs.getDate("return_date"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}