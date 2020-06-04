

package bankmanagementsystem;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            c =DriverManager.getConnection("jdbc:derby://localhost:1527/bankm","root","root");       
            s =c.createStatement();  
            
        }catch(Exception e){ 
            System.out.println(e);
           

        }  
    }  
}  