/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalprojserver.dao;
import za.ac.cput.adpfinalprojserver.connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import za.ac.cput.adpfinalprojserver.worker.AdminW;
/**
 *adminDAO.java
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 * 
 * GUI APPL
 */
public class adminDAO {
    private Connection con;
    private PreparedStatement ps;
    ResultSet rs;
    
    public boolean newUser(AdminW admin) throws SQLException { 
        int key = 0;
        String insertSQL = "INSERT  INTO multilogin (firstname, passw, utype) "
                + "VALUES ('%s', '%s', '%s')";
        try {   ps = con.prepareStatement(insertSQL);
                ps.setString(1, admin.getFirstname());
                ps.setString(2, admin.getPassword());
                ps.setString(3, admin.getUsertype());
                key = ps.executeUpdate();
            }
            catch (SQLException e) {System.out.println("SQL Exception " + e);} 
            finally {
            try { 
                if (ps != null) 
                {ps.close();con.close();}
                }
            catch (SQLException e) {System.out.println("SQL Exception" + e);}
                }
            return key == 0;
    }
    
    public boolean newVenue(AdminW venue) throws SQLException{
        int key = 0;
        String insertSQL = "INSERT  INTO adminf (nvenue, nvenaddress) "
                + "VALUES ('%s', '%s')";
        try {  ps = con.prepareStatement(insertSQL);
               ps.setString(1, venue.getVenuename());
               ps.setString(2, venue.getVenueaddress());
               key = ps.executeUpdate();
        }
            catch (SQLException e) {System.out.println("SQL Exception " + e);} 
            finally {
            try { 
                if (ps != null) 
                {ps.close();con.close();}
                }
            catch (SQLException e) {System.out.println("SQL Exception" + e);}
                }
            return key == 1;
    }
    
    public boolean valuser(String usern) {
        boolean lambo = false;
        String valuser = "SELECT * FROM multilogin WHERE firstname = ?";
        try { ps = con.prepareStatement(valuser);
              ps.setString(1, usern);
              rs = ps.executeQuery();
              lambo = rs.next();
            } 
        catch (SQLException e) {System.out.println("SQL Exception: " + e);} 
        finally {
            try {
                if (ps != null) 
                {ps.close();con.close();}
                } 
            catch (SQLException e) {
                System.out.println("SQL Exception" + e);
            }
        }
        return lambo;
    }
    
}

