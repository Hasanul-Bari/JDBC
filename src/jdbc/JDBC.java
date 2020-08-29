package jdbc;

/**
 *
 * @author Hasan
 */

import java.sql.*;

public class JDBC {

   
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        String url="jdbc:mysql://localhost/jdbc";
        String userName="root";
        String Password="";
        
        String query="SELECT Name from student where Id=1702065";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con=DriverManager.getConnection(url,userName,Password);
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery(query);
        
        rs.next();
        
        String name=rs.getString("Name");
        
        System.out.println(name);
        
        st.close();
        con.close();
        
        
        
        
    }
    
}
