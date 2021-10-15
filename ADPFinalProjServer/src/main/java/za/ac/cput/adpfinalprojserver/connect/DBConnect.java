/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalprojserver.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author raeece
 */
public class DBConnect {
    public static Connection derbyConnection(){
        String url = "jdbc:derby://localhost:1527/DBookings";
        String user = "Admin1";
        String password = "Admin1";
        Connection DBookings = null;
        try {
            DBookings = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.print("Connection Error");
        }
        return DBookings;
    }
}
