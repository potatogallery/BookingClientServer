/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DBConnection.dbConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import worker.AdminW;
/**
 *
 * @author raeec
 */
public class adminDAO {
    public AdminW newAdmin(AdminW admin) throws SQLException {
        String insertSQL="INSERT INTO adminf (firstname, password, venuename, venueaddress) "
                + "VALUES ('%s', '%s', '%s', '%s')";
        Connection con = dbConnect.derbyConnection();
        Statement statement = con.createStatement();
        insertSQL = String.format(insertSQL, admin.getFirstname(), admin.getPassword(), admin.getVenuename(), admin.getVenueaddress());
        statement.executeUpdate(insertSQL);
        return admin;
    
    }
    
    public AdminW displayresults(AdminW display) throws SQLException {
    String displaySQL="SELECT firstname, venuename, venueaddress from adminf";
    Connection con = dbConnect.derbyConnection();
    Statement dis = con.createStatement();
    displaySQL = String.format(displaySQL, display.getFirstname(), display.getVenuename(), display.getVenueaddress());
    dis.executeUpdate(displaySQL);
    return display;
    }
}
