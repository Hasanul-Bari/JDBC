package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Hasan
 */
public class JDBC_insert_2 {
    
    public static void main(String[] args) {
        
        
        try {

            String url = "jdbc:mysql://localhost/jdbc";
            String userName = "root";
            String Password = "";
            
            
            Scanner scanner=new Scanner(System.in);
            
            String name=scanner.nextLine();
            int id=scanner.nextInt();
            
                    
            String query = "INSERT INTO student VALUES (?,?)";

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, userName, Password);
            
            PreparedStatement st = con.prepareStatement(query);
            
            st.setString(1, name);
            st.setInt(2, id);

            int  count = st.executeUpdate();
            
            System.out.println(count+" rows affected");

            
            
            

            

            st.close();
            con.close();
            
            
        } catch (Exception e) {
               System.out.println(e);
        }
        
    }
    
}
