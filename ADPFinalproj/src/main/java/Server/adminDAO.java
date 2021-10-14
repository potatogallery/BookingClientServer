/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DBConnection.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import worker.AdminW;
/**
 *
 * @author raeec
 */

public class adminDAO {
    private Connection con;
    private PreparedStatement ps;
    ResultSet rs;
    
    public boolean newAdmin(AdminW admin) throws SQLException {
        
         
        int key = 0;
        String insertSQL = "INSERT  INTO multilogin (firstname, passw, utype) "
                + "VALUES ('%s', '%s', '%s')";
        try {
        
        ps = con.prepareStatement(insertSQL);
        ps.setString(1, admin.getFirstname());
        ps.setString(2, admin.getPassword());
        ps.setString(3, admin.getUsertype());
        
        key = ps.executeUpdate();
        }
            catch (SQLException e) {
            
                System.out.println("SQL Exception " + e);
            }
        finally {
            try {
            
                if (ps != null) {
                    ps.close();
                    con.close();
                }
                
            }
            
            catch (SQLException e) {
            
                System.out.println("SQL Exception" + e);
            }
        
        }
            //con = dbConnect.derbyConnection();
            //ps = con.prepareStatement(insertSQL);
            //insertSQL = String.format(insertSQL, admin.getFirstname(), admin.getPassword(), admin.getUsertype());
            //ps.executeUpdate(insertSQL);
        //return admin;
    return key == 1;
    }
    
    public AdminW newVenue(AdminW venue) throws SQLException{
        String venueSQL = "INSERT nvenue, nvenueaddress Into adminf(nvenue, nvenueaddress)" 
                + "VALUES ('%s', '%s')";
            con = dbConnect.derbyConnection();
            ps = con.prepareStatement(venueSQL);
            venueSQL = String.format(venueSQL, venue.getVenuename(), venue.getVenueaddress());
            ps.execute(venueSQL);
            return venue;
    
    }
    
    public AdminW displayresults(AdminW display, AdminW admin, AdminW venue) throws SQLException {
        String displayadminSQL="SELECT firstname from adminf"+ "SELECT nvenue";
        Connection con = dbConnect.derbyConnection();
        Statement dis = con.createStatement();
    displayadminSQL = String.format(displayadminSQL, display.getFirstname(), display.getVenuename(), display.getVenueaddress());
    dis.executeUpdate(displayadminSQL);
    return display;
    
    
    }
}
