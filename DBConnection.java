/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class DBConnection {
     public static Connection getConnection()
   {
       Connection con=null;
       try
       {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbs_reminder;user=sa;password=admin123");
    
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    return con;     
        
   }
}
