/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;

import java.awt.Font;
import javax.swing.*;
import worker.CWorker;
import za.ac.cput.adpfinalproj.clientgui.Admin;
import za.ac.cput.adpfinalproj.clientgui.Users;
import Server.ServerCL;
import java.sql.SQLException;
import java.sql.Connection;
import DBConnection.dbConnect;
/**
 *
 * @author POTATOE
 */
public class Users extends JFrame {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Users Class Fuctions Goes Here!");
    
    public Users(){
        
        welcomeLabel.setBounds(0,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1420,700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void setGUI(){
    
    this.add(welcomeLabel);
    this.add(frame);

    }
    public static void main(String[] args) {
        new Users().setGUI();
    }
}
