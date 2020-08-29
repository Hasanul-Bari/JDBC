package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hasan
 */
public class JDBC_get_multiple_fields {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost/jdbc";
            String userName = "root";
            String Password = "";

            String query = "SELECT * FROM student;";

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, userName, Password);
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            
            
            while(rs.next())
            {
                String name = rs.getString("Name");
                int id = rs.getInt("Id");

                System.out.println(name+" "+id);
            }

            

            st.close();
            con.close();
            
            
        } catch (Exception e) {
               System.out.println(e);
        }

    }

}
