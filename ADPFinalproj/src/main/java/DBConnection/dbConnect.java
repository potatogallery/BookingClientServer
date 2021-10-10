/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *dbConnect.java
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 * 
 * DATABASE CONNECTION CLASS
 */
public class dbConnect {
    public static Connection derbyConnection() {
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBookings", "Admin1", "Admin1" );
            return con;
        }
        catch(SQLException ex){
            Logger.getLogger(dbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        /*String url="jdbc:derby://localhost:1527/DBookings";
        String user="Admin1";
        String password="Admin1";  
      return DriverManager.getConnection(url, user, password);*/
    } 
}
