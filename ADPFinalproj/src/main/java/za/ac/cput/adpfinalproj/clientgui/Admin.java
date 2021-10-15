/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.ListIterator;
import za.ac.cput.adpfinalproj.clientgui.CGui;
import Server.ServerCL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import worker.AdminW;
/**
 *
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 */
public class Admin extends JFrame implements ActionListener {
    
    AdminW adminw;
    
    ServerCL eish = new ServerCL();
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("JK.CO (ADMIN)");
    /////////////////////////Title//////////////////////////
    JLabel myheaderLabel = new JLabel("");
    /*JLabel lblTitle = new JLabel("");
    private JComboBox cboTitle;
    private JLabel lblErrorOnTitleSpace;*/
    
    //////////////////New Venue/////////////////
    JLabel lblVenue = new JLabel("New Venue");
    JLabel myHeaderSpace1 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    JLabel lblVenueName = new JLabel("Venue Name:");
    JTextField txtVenueName = new JTextField();
    JLabel lblVenueAdd = new JLabel("Venue Address:");
    JTextField txtVenueAdd = new JTextField();
    JLabel myHeaderSpacing = new JLabel("");
    //////////////// New User/////////////////
    JLabel lblNewuser = new JLabel("New User");
    JLabel myHeaderSpacing1 = new JLabel("");
    JLabel lblutype = new JLabel("UserType:");
    JComboBox cboutype = new JComboBox();
    JLabel myHeaderSpacing2 = new JLabel("");
    JLabel lblfirstName = new JLabel("First Name:");
    JTextField txtfirstName = new JTextField();
    JLabel lblpassword = new JLabel("Password: ");
    JTextField txtpassword = new JTextField();
    JLabel myHeaderSpacing3 = new JLabel("");
    
    ////////////////////Venues/////////////////
    JLabel lblVenues = new JLabel("Venues");
    JTable tblVenues = new JTable();
    
    ///////////////////Inactive////////////////
    JLabel lblinactive = new JLabel("Select Inactive:");
    JComboBox cboinactive = new JComboBox();
    //////////////////BUTTONS FOR Update,Reset OR EXIT/////////////////////
    JButton btnv1 = new JButton("Add Venue");
    JButton btnUs = new JButton("Add User");
    JButton btnUpdate = new JButton("Update");
    JButton btnReset = new JButton("Refresh");
    JButton btnSO = new JButton("Sign Out");
    
    
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    
    public Admin(){
        
        Object[] columnNames = {"Venue","Venue Address"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        tblVenues.setModel(model);
        tblVenues.setBackground(Color.WHITE);
        tblVenues.setRowHeight(500);
        
        
         
        welcomeLabel.setBounds(500,0,900,30);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        welcomeLabel.setForeground(Color.BLUE);
        myHeaderSpace1.setBounds(0,0,1230,65);
        myHeaderSpace1.setForeground(Color.BLUE);
        ////New Venue
        lblVenue.setBounds(10, 20, 900, 70);
        lblVenue.setFont(new Font(null, Font.PLAIN,18));
        lblVenue.setForeground(Color.RED);
        lblVenueName.setBounds(10, 20, 900, 160);
        lblVenueName.setFont(new Font(null, Font.PLAIN,18));
        txtVenueName.setBounds(160, 80, 150, 0);
        txtVenueName.setSize(250, 50);
        lblVenueAdd.setBounds(10, 20, 900, 300);
        lblVenueAdd.setFont(new Font(null, Font.PLAIN,18));
        txtVenueAdd.setBounds(160, 150, 150, 0);
        txtVenueAdd.setSize(250, 50);
        //// New User
        lblNewuser.setBounds(10, 20, 900, 550);
        lblNewuser.setFont(new Font(null, Font.PLAIN,18));
        lblNewuser.setForeground(Color.RED);
        lblutype.setBounds(10, 20, 900, 670);
        lblutype.setFont(new Font(null, Font.PLAIN,18));
        cboutype.setBounds(160, 330, 900, 0);
        cboutype.setSize(200 , 50);
        cboutype.setBackground(Color.WHITE);
        cboutype.setFont(new Font(null, Font.PLAIN,18));
        lblfirstName.setBounds(10, 20, 900, 800);
        lblfirstName.setFont(new Font(null, Font.PLAIN,18));
        txtfirstName.setBounds(160, 400, 150, 0);
        txtfirstName.setSize(250, 50);
        lblpassword.setBounds(10, 20, 900, 940);
        lblpassword.setFont(new Font(null, Font.PLAIN,18));
        txtpassword.setBounds(160, 470, 150, 0);
        txtpassword.setSize(250, 50);
        ////////venues
        lblVenues.setBounds(700, 20, 900, 70);
        lblVenues.setFont(new Font(null, Font.PLAIN,18));
        lblVenues.setForeground(Color.RED);
        /*tblVenues.setBounds(700, 90, 900, 0);
        tblVenues.setSize(500,350);
        ///tblVenues.setBorder();
        tblVenues.setBackground(Color.WHITE);*/
        ///////iNACTIVE
        lblinactive.setBounds(700, 20, 900, 940);
        lblinactive.setFont(new Font(null, Font.PLAIN,18));
        lblinactive.setForeground(Color.RED);
        cboinactive.setBounds(850, 470, 900, 940);
        cboinactive.setSize(200 , 50);
        cboinactive.setBackground(Color.WHITE);
        /////// BUTTONS
        btnv1.setBounds(200, 210 , 150, 0);
        btnv1.setSize(100, 40);
        btnUs.setBounds(200, 530 , 150, 0);
        btnUs.setSize(100, 40);
        btnUpdate.setBounds(1060, 475 , 150, 0);
        btnUpdate.setSize(100, 40);
        btnReset.setBounds(200, 600 , 150, 0);
        btnReset.setSize(400, 40);
        btnSO.setBounds(600, 600 , 150, 0);
        btnSO.setSize(400, 40);
        
        
        
        
        frame.add(welcomeLabel);
        frame.add(myheaderLabel);
        frame.add(lblVenue);
        frame.add(myHeaderSpace1);
        frame.add(lblVenueName);
        frame.add(txtVenueName);
        frame.add(lblVenueAdd);
        frame.add(txtVenueAdd);
        frame.add(myHeaderSpacing);
        frame.add(lblNewuser);
        frame.add(myHeaderSpacing1);
        frame.add(lblutype);
        frame.add(cboutype);
        
        cboutype.addItem("User");
        frame.add(myHeaderSpacing2);
        frame.add(lblfirstName);
        frame.add(txtfirstName);
        frame.add(lblpassword);
        frame.add(txtpassword);
        frame.add(myHeaderSpacing3);
        frame.add(lblVenues);
        frame.add(tblVenues);
        frame.add(lblinactive);
        frame.add(cboinactive);
        frame.add(btnv1);
        frame.add(btnUs);
        frame.add(btnUpdate);
        frame.add(btnReset);
        frame.add(btnSO);
        frame.add(blank1);
        frame.add(blank2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(1230,700);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
    public void setAdmin(){
        this.add(frame);
        this.add(welcomeLabel);
        frame.add(myheaderLabel);
        frame.add(lblVenue);
        frame.add(myHeaderSpace1);
        frame.add(lblVenueName);
        frame.add(txtVenueName);
        frame.add(lblVenueAdd);
        frame.add(txtVenueAdd);
        frame.add(myHeaderSpacing);
        frame.add(lblNewuser);
        frame.add(myHeaderSpacing1);
        frame.add(lblutype);
        frame.add(cboutype);
        frame.add(myHeaderSpacing2);
        frame.add(lblfirstName);
        frame.add(txtfirstName);
        frame.add(lblpassword);
        frame.add(txtpassword);
        frame.add(myHeaderSpacing3);
        frame.add(lblVenues);
        frame.add(tblVenues);
        frame.add(lblinactive);
        frame.add(cboinactive);
        frame.add(btnv1);
        frame.add(btnUs);
        frame.add(btnUpdate);
        frame.add(btnReset);
        frame.add(btnSO);
        frame.add(blank1);
        frame.add(blank2);
        
        
        btnv1.addActionListener(this);
        btnUs.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnSO.addActionListener(this);
        
        this.setVisible(true);

        Object[] var = new Object[2];
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnv1) {
           if (txtVenueName.getText().isEmpty() || txtVenueAdd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Fill in Fields.");
            } else {
                    String venueName = txtVenueName.getText();
                    String venueAdd = txtVenueAdd.getText();   
                    boolean response;
                    adminw = new AdminW(venueName, venueAdd);
                    response = eish.addVenue(adminw);
                    if (response == true) {
                        
                        JOptionPane.showMessageDialog(null, "New Venue Added");
                        txtVenueName.setText(null);
                        txtVenueAdd.setText(null);
                    }}
   
                }
        
           if(e.getSource() == btnUs) {
           if ((cboutype.getSelectedIndex() == 0) || txtfirstName.getText().isEmpty() || txtpassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Fill in Fields.");
            } else {
                    String cbouType = cboutype.getSelectedItem().toString();
                    String firstName = txtfirstName.getText();
                    String password = txtpassword.getText();
                    boolean response;
                    adminw = new AdminW(cbouType, firstName, password);
                    response = eish.addVenue(adminw);
                    if (response == true){  
                        JOptionPane.showMessageDialog(null, "New User Added");
                        cboutype.setSelectedItem(null);
                        txtfirstName.setText(null);
                        txtpassword.setText(null);
                    }}
                    
                }
           if(e.getSource() == btnReset){
               var[0] = txtVenueName.getText();
               var[1] = txtVenueAdd.getText();
               model.addRow(var);
           }
           
           
           
           
           
            }
        
    public static void main(String[] args) {
        new Admin().setAdmin();
    }
    
}
