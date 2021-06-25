/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
 
/**
 *
 * @author Shanger
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vegetables","root","Shangershang");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static Connection getcon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
