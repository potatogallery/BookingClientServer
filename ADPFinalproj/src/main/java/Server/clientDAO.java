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
import worker.Clients;
/*
 *
 * @param Users
 *
 */
public class clientDAO {
    
    
    public Clients newCustomer(Clients client) throws SQLException {
        String insertSQL="INSERT INTO newcustomer (firstname, surname, cell, email, bvenue, rdate) "
                + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')";
        Connection con = dbConnect.derbyConnection();
        Statement statement = con.createStatement();
        insertSQL = String.format(insertSQL, client.getFirstname(), client.getSurname(), client.getCell(), client.getEmail(), client.getBvenue(), client.getRdate());
        statement.executeUpdate(insertSQL);
        return client;
    }
    
    public Clients displayCustomer(Clients display ) throws SQLException {
        String displaySQL = "SELECT * from newcustomer ";
        Connection con = dbConnect.derbyConnection();
        Statement dis = con.createStatement();
        dis.executeUpdate(displaySQL);
        
        return display;
    }
    
    
    }
    
    
