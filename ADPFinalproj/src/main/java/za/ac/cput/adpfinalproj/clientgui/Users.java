/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 */
public class Users extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("User Class Functions Goes Here!");
    JPanel panelnorth = new JPanel();
    JPanel panelsouth = new JPanel();
    JPanel paneleast = new JPanel();
    JPanel panelwest = new JPanel();
    /////////////////////////Title//////////////////////////
    JLabel myheaderLabel = new JLabel("");
    /*JLabel lblTitle = new JLabel("");
    private JComboBox cboTitle;
    private JLabel lblErrorOnTitleSpace;*/
    
    
    //////////////// New User/////////////////
    JLabel lblNewuser = new JLabel("New Customer");
    JLabel myHeaderSpacing1 = new JLabel("");
    JLabel myHeaderSpacing2 = new JLabel("");
    JLabel lblfname = new JLabel("First Name:");
    JTextField txtfname = new JTextField();
    JLabel myHeaderSpacing3 = new JLabel("Surname");
    JLabel lblSurname = new JLabel("Surname:");
    JTextField txtsurname = new JTextField();
    JLabel myHeaderSpacing4 = new JLabel("");
    JLabel lblcell = new JLabel("Cell:");
    JTextField txtcell = new JTextField();
    JLabel myHeaderSpacing5 = new JLabel("");
    JLabel lblemail = new JLabel("E-mail:");
    JTextField txtemail = new JTextField();
    
    //////////////////New Booking/////////////////
    JLabel lblBooking = new JLabel("New Booking");
    JLabel myHeaderSpace1 = new JLabel("");
    JLabel lblCustomerName = new JLabel("Customer Name:");
    JTextField txtCustomerName = new JTextField();
    JLabel lbladdVenue = new JLabel(" Venue:");
    JTextField txtaddVenue = new JTextField();
    JLabel myHeaderSpace2 = new JLabel("");
    JLabel lblDate = new JLabel(" Date:");
    JTextField txtDate = new JTextField();
    JLabel myHeaderSpace3 = new JLabel("");
    
    ////////////////////Bookings/////////////////
    JLabel lblBookings = new JLabel("Bookings");
    JTable tblVenues = new JTable();
    
    JLabel lblInvoice = new JLabel("Invoice");
    JComboBox cboInvoice = new JComboBox();
    
    
    //////////////////BUTTONS FOR Update,Reset OR EXIT/////////////////////
    JButton btnUpdate = new JButton("Update");
    JButton btnReset = new JButton("Reset");
    JButton btnExit = new JButton("Exit");
    
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    
    public Users(){
        welcomeLabel.setBounds(650,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,18));
        
        //// New Customer
        lblNewuser.setBounds(10, 20, 900, 70);
        lblNewuser.setFont(new Font(null, Font.PLAIN,17));
        lblfname.setBounds(10, 20, 900, 160);
        lblfname.setFont(new Font(null, Font.PLAIN,17));
        txtfname.setBounds(160, 330, 900, 160);
        txtfname.setSize(250 , 30);
        lblSurname.setBounds(10, 20, 900, 250);
        lblSurname.setFont(new Font(null, Font.PLAIN,17));
        txtsurname.setBounds(160, 400, 150, 250);
        txtsurname.setSize(250, 30);
        lblcell.setBounds(10, 20, 900, 340);
        lblcell.setFont(new Font(null, Font.PLAIN,17));
        txtcell.setBounds(160, 470, 150, 340);
        txtcell.setSize(250, 30);
        lblemail.setBounds(10, 20, 900, 430);
        lblemail.setFont(new Font(null, Font.PLAIN,17));
        txtemail.setBounds(160, 470, 150, 430);
        txtemail.setSize(250, 30);
        
        
        ////New Booking
        lblBooking.setBounds(10, 20, 900, 550);
        lblBooking.setFont(new Font(null, Font.PLAIN,18));
        lblCustomerName.setBounds(10, 20, 900, 600);
        lblCustomerName.setFont(new Font(null, Font.PLAIN,17));
        txtCustomerName.setBounds(160, 80, 150, 600);
        txtCustomerName.setSize(250, 30);
        lbladdVenue.setBounds(10, 20, 900, 660);
        lbladdVenue.setFont(new Font(null, Font.PLAIN,17));
        txtaddVenue.setBounds(160, 150, 150, 660);
        txtaddVenue.setSize(250, 30);
        lblDate.setBounds(10, 20, 900, 730);
        lblDate.setFont(new Font(null,Font.PLAIN,17));
        txtDate.setBounds(160, 210, 150, 730);
        txtDate.setSize(250, 30);
        
        ////////Bookings
        lblBookings.setBounds(700, 20, 900, 70);
        lblBookings.setFont(new Font(null, Font.PLAIN,18));
        tblVenues.setBounds(700, 90, 900, 0);
        tblVenues.setSize(600,300);
        tblVenues.setBackground(Color.GRAY);
        lblInvoice.setBounds(700, 90, 900, 390);
        lblInvoice.setFont(new Font(null, Font.PLAIN,18));
        cboInvoice.setBounds(950, 280, 150, 390);
        cboInvoice.setSize(200, 30);
        
        
        frame.add(welcomeLabel);
        frame.add(panelnorth);
        frame.add(panelsouth);
        frame.add(paneleast);
        frame.add(panelwest);
        
        ////New Customer
        frame.add(myHeaderSpace1);
        frame.add(lblNewuser);
        frame.add(myHeaderSpacing1);
        frame.add(lblfname);
        frame.add(txtfname);
        frame.add(myHeaderSpacing2);
        frame.add(lblSurname);
        frame.add(txtsurname);
        frame.add(myHeaderSpacing3);
        frame.add(lblcell);
        frame.add(txtcell);
        frame.add(myHeaderSpacing4);
        frame.add(lblemail);
        frame.add(txtemail);
        frame.add(myHeaderSpacing5);
        
        
        ////New Booking
        frame.add(lblBooking);
        frame.add(myheaderLabel);
        frame.add(lblBooking);
        frame.add(myHeaderSpace1);
        frame.add(lblCustomerName);
        frame.add(txtCustomerName);
        frame.add(lbladdVenue);
        frame.add(txtaddVenue);
        
        ////Bookings display
        frame.add(lblBookings);
        frame.add(myHeaderSpace2);
        frame.add(lblInvoice);
        frame.add(cboInvoice);
        
        frame.add(btnUpdate);
        frame.add(btnReset);
        frame.add(btnExit);
        frame.add(blank1);
        frame.add(blank2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1420,800);
        frame.setLayout(null);
        frame.setVisible(true);
    /*  
    myHeaderSpacing = new JLabel();
      ///ICON//
      ImageIcon rog1 = new ImageIcon(new ImageIcon("21.png").getImage().getScaledInstance(120, 90, Image.SCALE_DEFAULT));
      ///ICON//
      myheaderLabel = new JLabel("HOSITAL RECORDS");
      myheaderLabel.setHorizontalAlignment(JLabel.CENTER);
      myHeaderSpace1 = new JLabel(rog1); 
      
      blank1 = new JLabel ("");
      lbldisplaycount = new JLabel ("");
      blank2 = new JLabel ("");
      lblTitle = new JLabel ("Title: ");
      cboTitle = new JComboBox ();
      lblErrorOnTitleSpace = new JLabel("");
      
      lblFirstName = new JLabel ("First Name:   ");
      txtFirstName = new JTextField (15);
      lblOnFirstNameSpace = new JLabel("*Required*");
       
      lblLastName = new JLabel ("Last Name:   ");
      txtLastName = new JTextField (15);
      lblErrorOnLastName = new JLabel ("*Required*");
       
      lblGender = new JLabel ("Gender: ");
      radMale = new JRadioButton ("Male");
      radFemale = new JRadioButton ("Female");

      
       
      lblPensioner = new JLabel ("Pensioner: ");
      chkPensioner = new JCheckBox ();
      myspacer2 = new JLabel("");
       
       
       btnPrevious = new JButton ("Previous");
       btnPrevious.setBackground(Color.GREEN);
       btnNext = new JButton ("Next");
       btnNext.setBackground(Color.GREEN);
       
       btnExit = new JButton ("Exit");
       btnExit.setBackground(Color.GREEN);*/
    }
    public void setUser(){
        this.add(frame);
        this.add(welcomeLabel);
       // frame.add(panelnorth);
       // frame.add(panelsouth);
      //  frame.add(paneleast);
       // frame.add(panelwest);
        frame.add(myheaderLabel);
        frame.add(lblNewuser);
        frame.add(myHeaderSpace1);
        frame.add(lblfname);
        frame.add(txtfname);
        frame.add(lblSurname);
        frame.add(txtsurname);
        frame.add(myHeaderSpacing1);
        frame.add(lblcell);
        frame.add(txtcell);
        frame.add(myHeaderSpacing2);
        frame.add(lblemail);
        frame.add(txtemail);
        frame.add(myHeaderSpacing4);
        frame.add(lblBooking);
        frame.add(myHeaderSpace1);
        frame.add(lblCustomerName);
        frame.add(txtCustomerName);
        frame.add(lbladdVenue);
        frame.add(txtaddVenue);
        frame.add(myHeaderSpace2);
        frame.add(lblDate);
        frame.add(txtDate);
        frame.add(myHeaderSpace3);
        frame.add(lblBookings);
        frame.add(myHeaderSpacing5);
        frame.add(tblVenues);
        frame.add(cboInvoice);
        cboInvoice.addItem("---");
        frame.add(btnUpdate);
        frame.add(btnReset);
        frame.add(btnExit);
        frame.add(blank1);
        frame.add(blank2);
        this.setVisible(true);
    /*
    this.setLayout(new GridLayout(9, 3));
      
      this.add(myHeaderSpace1);
      this.add(myheaderLabel);
      this.add(myHeaderSpacing);
      
      
      this.add(blank1);
      this.add(lbldisplaycount);
      this.add(blank2);
      this.add(lblTitle);
      this.add(cboTitle);
      
      cboTitle.addItem("Miss");
      cboTitle.addItem("Mr");
      cboTitle.addItem("Mrs");
     
      this.add(lblErrorOnTitleSpace);
      ///FIRSTNAME///
      this.add(lblFirstName);
      this.add(txtFirstName);
      this.add(lblOnFirstNameSpace);
      ///LASTNAME////
      this.add(lblLastName);
      this.add(txtLastName);
      this.add(lblErrorOnLastName);
       ////GENDER///
      this.add(lblGender);
      this.add(radMale);
      this.add(radFemale);
      ////PENSIONER///
      this.add(lblPensioner);
      this.add(chkPensioner);
      ///BUTTONS///
      this.add(myspacer2);
      this.add(btnPrevious);
      this.add(btnNext);
      this.add(btnExit);
      
      /////BUTTONS ACTIONLISTENERS///
        btnPrevious.addActionListener(this);
        btnNext.addActionListener(this);
        btnExit.addActionListener(this);
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    */
    
    
    }
    
    public void actionPerformed(ActionEvent i){
        if (i.getActionCommand().equals("Previous")){

         
     } else if(i.getActionCommand().equals("Next")){

         
     } if (i.getActionCommand().equals("Exit")){
         System.exit(0);
     }
   }

    public static void main(String[] args) {
        new Users().setUser();
    }
      
}
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// END OF PROGRAM /////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    

