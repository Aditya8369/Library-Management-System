package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/library_db";
            String username = "root";
            String password = "1705";

            return DriverManager.getConnection(url, username, password);
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
