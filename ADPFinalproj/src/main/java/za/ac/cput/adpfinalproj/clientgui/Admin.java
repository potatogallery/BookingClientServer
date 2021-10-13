/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.ListIterator;
import za.ac.cput.adpfinalproj.clientgui.CGui;
/**
 *
 * @author POTATOE
 */
public class Admin extends JFrame implements ActionListener {
    
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
    JButton btnUpdate = new JButton("Update");
    JButton btnReset = new JButton("Reset");
    JButton btnSO = new JButton("Sign Out");
    
    
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    
    public Admin(){
        
        String[] columnNames = {"",""};
        Object[][] var = {{"Groove", "31 East Rd Cape Town"},
                          {"Okahh", "96 Breek St Cape Town"},
                          {"The Goddess", "12 Loft Rd Pretoria"}};
        tblVenues = new JTable(var, columnNames );
         
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
        tblVenues.setBounds(700, 90, 900, 0);
        tblVenues.setSize(500,350);
        ///tblVenues.setBorder();
        tblVenues.setBackground(Color.WHITE);
        ///////iNACTIVE
        lblinactive.setBounds(700, 20, 900, 940);
        lblinactive.setFont(new Font(null, Font.PLAIN,18));
        lblinactive.setForeground(Color.RED);
        cboinactive.setBounds(850, 470, 900, 940);
        cboinactive.setSize(200 , 50);
        cboinactive.setBackground(Color.WHITE);
        /////// BUTTONS
        btnUpdate.setBounds(300, 600 , 150, 0);
        btnUpdate.setSize(100, 40);
        btnReset.setBounds(550, 600 , 150, 0);
        btnReset.setSize(100, 40);
        btnSO.setBounds(800, 600 , 150, 0);
        btnSO.setSize(100, 40);
        
        
        
        
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
        frame.add(btnUpdate);
        frame.add(btnReset);
        frame.add(btnSO);
        frame.add(blank1);
        frame.add(blank2);
        
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnSO.addActionListener(this);
        
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Update")){

         
     } else if(e.getActionCommand().equals("Reset")){
                
         
     } else if(e.getActionCommand().equals("Sign Out")){
         JOptionPane.showMessageDialog(this, "Signing You Out");
         CGui mm = new CGui();
                   dispose();
     }
   }

    public static void main(String[] args) {
        new Admin().setAdmin();
    }
    
}
