package cellsbook;
import javax.swing.*;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRINCE
 */
public class Connection1{
        
    Connection con = null;
   
    public static Connection ConnectDB(){
            try{
           
          Class.forName("com.mysql.jdbc.Driver");
          Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inmate?","root","");
          return con;
            
          }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
