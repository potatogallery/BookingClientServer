/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import worker.Clients;
/*
 *
 * @param Users
 *
 */
public class clientDAO {
    ResultSet r;
    private PreparedStatement p;
    private Connection con;
    
    public boolean newAdmin(Clients client) throws SQLException {
        
         
        int key = 0;
        String insertSQL = "INSERT  INTO multilogin (firstname, surname, cell, email, bvenue, rdate) "
                + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')";
        try {
        
        p = con.prepareStatement(insertSQL);
        p.setString(1, client.getFirstname());
        p.setString(2, client.getSurname());
        p.setString(3, client.getCell());
        p.setString(4, client.getEmail());
        p.setString(5, client.getBvenue());
        p.setString(6, client.getRdate());
        
        key = p.executeUpdate();
        }
            catch (SQLException i) {
            
                System.out.println("SQL Exception " + i);
            }
        finally {
            try {
            
                if (p != null) {
                    p.close();
                    con.close();
                }
                
            }
            
            catch (SQLException i) {
            
                System.out.println("SQL Exception" + i);
            }
        
        }
            
    return key == 1;
    }
    
    public ArrayList<Clients> getAllClients(Clients client) {
        ArrayList<Clients> clientList = new ArrayList<>();
        String getAllClientsSQL = "SELECT * FROM newcustomer";
        try {
            p = con.prepareStatement(getAllClientsSQL);
            r = p.executeQuery();
            
            System.out.println(r.getString(client.getFirstname()));
            System.out.println(r.getString(client.getSurname()));
            System.out.println(r.getString(client.getCell()));
            System.out.println(r.getString(client.getEmail()));
            System.out.println(r.getString(client.getBvenue()));
            System.out.println(r.getString(client.getSurname()));
            
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex);
        } finally {
            try {
                if (p != null) {
                    p.close();
                    con.close();
                    r.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQL Exception: " + ex);
            }
        }
        return clientList;
    }
    
    
}
