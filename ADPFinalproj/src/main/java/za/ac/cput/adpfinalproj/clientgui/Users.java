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
import worker.AgentW;
import Server.ServerCL;
/**
 *
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 */
public class Users extends JFrame implements ActionListener {
    ServerCL yes = new ServerCL();
    AgentW agent;
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("JK.CO (Agent)");
    /////////////////////////Title//////////////////////////
    JLabel myheaderLabel = new JLabel("");
    /*JLabel lblTitle = new JLabel("");
    private JComboBox cboTitle;
    private JLabel lblErrorOnTitleSpace;*/
    
    
    //////////////// New User/////////////////
    JLabel lblNewuser = new JLabel("New Customer");
    JLabel myHeaderSpacing1 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
    JComboBox cboCustomerName = new JComboBox();
    JLabel lbladdVenue = new JLabel(" Venue:");
    JComboBox cboaddVenue = new JComboBox();
    JLabel myHeaderSpace2 = new JLabel("");
    JLabel lblDate = new JLabel(" Date:");
    JTextField txtDate = new JTextField();
    JLabel myHeaderSpace3 = new JLabel("");
    
    ////////////////////Bookings/////////////////
    JLabel lblBookings = new JLabel("Bookings");
    JTable tblVenues = new JTable();
    
    JLabel lblInvoice = new JLabel("Invoice :");
    JComboBox cboInvoice = new JComboBox();
    
    
    //////////////////BUTTONS FOR Update,Reset OR EXIT/////////////////////
    JButton btnShow = new JButton("Print");
    JButton btnUpdate = new JButton("Update");
    JButton btnReset = new JButton("Reset");
    JButton btnSO = new JButton("Sign Out");
    
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    
    public Users(){
        welcomeLabel.setBounds(550,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,18));
        welcomeLabel.setForeground(Color.BLUE);
        myHeaderSpacing1.setBounds(0,10,1230,65);
        myHeaderSpacing1.setForeground(Color.BLUE);
        //// New Customer
        lblNewuser.setBounds(10, 30, 900, 70);
        lblNewuser.setFont(new Font(null, Font.PLAIN,18));
        lblNewuser.setForeground(Color.red);
        lblfname.setBounds(10, 40, 900, 160);
        lblfname.setFont(new Font(null, Font.PLAIN,17));
        txtfname.setBounds(160, 110, 900, 160);
        txtfname.setSize(250 , 30);
        lblSurname.setBounds(10, 50, 900, 250);
        lblSurname.setFont(new Font(null, Font.PLAIN,17));
        txtsurname.setBounds(160, 160, 150, 250);
        txtsurname.setSize(250, 30);
        lblcell.setBounds(10, 60, 900, 340);
        lblcell.setFont(new Font(null, Font.PLAIN,17));
        txtcell.setBounds(160, 218, 150, 340);
        txtcell.setSize(250, 30);
        lblemail.setBounds(10, 70, 900, 430);
        lblemail.setFont(new Font(null, Font.PLAIN,17));
        txtemail.setBounds(160, 270, 150, 430);
        txtemail.setSize(250, 30);
        
        
        ////New Booking
        lblBooking.setBounds(10, 100, 900, 550);
        lblBooking.setFont(new Font(null, Font.PLAIN,18));
        lblBooking.setForeground(Color.red);
        lblCustomerName.setBounds(10, 115, 900, 600);
        lblCustomerName.setFont(new Font(null, Font.PLAIN,17));
        cboCustomerName.setBounds(160, 400, 150, 600);
        cboCustomerName.setSize(250, 30);
        lbladdVenue.setBounds(10, 130, 900, 660);
        lbladdVenue.setFont(new Font(null, Font.PLAIN,17));
        cboaddVenue.setBounds(160, 450, 150, 660);
        cboaddVenue.setSize(250, 30);
        lblDate.setBounds(10, 145, 900, 730);
        lblDate.setFont(new Font(null,Font.PLAIN,17));
        txtDate.setBounds(160, 500, 150, 730);
        txtDate.setSize(250, 30);
        
        ////////Bookings
        lblBookings.setBounds(700, 30, 900, 70);
        lblBookings.setFont(new Font(null, Font.PLAIN,18));
        lblBookings.setForeground(Color.red);
        tblVenues.setBounds(700, 100, 900, 0);
        tblVenues.setSize(500,300);
        tblVenues.setBackground(Color.WHITE);
        lblInvoice.setBounds(700, 270, 900, 390);
        lblInvoice.setFont(new Font(null, Font.PLAIN,18));
        cboInvoice.setBounds(800, 450, 150, 390);
        cboInvoice.setSize(200, 30);
        
        /////// BUTTONS
        btnShow.setBounds(1025, 445 , 150, 0);
        btnShow.setSize(100, 40);
        btnUpdate.setBounds(300, 600 , 150, 0);
        btnUpdate.setSize(100, 40);
        btnReset.setBounds(550, 600 , 150, 0);
        btnReset.setSize(100, 40);
        btnSO.setBounds(800, 600 , 150, 0);
        btnSO.setSize(100, 40);
        
        frame.add(welcomeLabel);
 
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
        frame.add(lblCustomerName);
        frame.add(cboCustomerName);
        frame.add(lbladdVenue);
        frame.add(cboaddVenue);
        frame.add(lblDate);
        frame.add(txtDate);
        
        
        ////Bookings display
        frame.add(lblBookings);
        frame.add(tblVenues);
        frame.add(myHeaderSpace2);
        frame.add(lblInvoice);
        frame.add(cboInvoice);
        
        frame.add(btnUpdate);
        frame.add(btnReset);
        frame.add(btnSO);
        frame.add(btnShow);
        frame.add(blank1);
        frame.add(blank2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1230,700);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
    public void setUser(){
        this.add(frame);
        this.add(welcomeLabel);

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
        frame.add(lblCustomerName);
        frame.add(cboCustomerName);
        frame.add(lbladdVenue);
        frame.add(cboaddVenue);
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
        frame.add(btnSO);
        frame.add(btnShow);
        frame.add(blank1);
        frame.add(blank2);
        this.setVisible(true);
    
    
    
    }
    
    public void actionPerformed(ActionEvent i){
        
        if(i.getActionCommand().equals(btnUpdate)){
        if(txtfname.getText().isEmpty() || txtsurname.getText().isEmpty() || txtcell.getText().isEmpty() || txtemail.getText().isEmpty()  || txtDate.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Please fill all fields");
        
        }else{
            String txtfname = this.txtfname.getText();
            String txtsurname = this.txtsurname.getText();
            String txtcell = this.txtcell.getText();
            String txtemail = this.txtemail.getText();
            String txtdate = this.txtDate.getText();
            boolean result;
            agent.setFirstname(txtfname);
            agent.setSurname(txtsurname);
            agent.setCell(txtcell);
            agent.setEmail(txtemail);
            agent.setRdate(txtdate);
            result = yes.addClient(agent);
            if(result == true){
               JOptionPane.showMessageDialog(null, "New client added");
               this.txtfname.setText(null);
               this.txtsurname.setText(null);
               this.txtcell.setText(null);
               this.txtemail.setText(null);
               this.txtDate.setText(null);
               
            }
        
        
        
        }
    
         if(i.getActionCommand().equals(btnReset)){
              new Users();
             
         
         }
         if(i.getActionCommand().equals(btnShow)){
              
             
         
         }
         
       if (i.getActionCommand().equals(btnSO)){
         System.exit(0);
           System.out.println("Goodbye now");
           
     }
   }

   
      
}
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// END OF PROGRAM /////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    

