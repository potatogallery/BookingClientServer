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
/**
 *
 * @author POTATOE
 */
public class Admin extends JFrame implements ActionListener {
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Admin Class Fuctions Goes Here!");
    JPanel panelnorth = new JPanel();
    JPanel panelsouth = new JPanel();
    JPanel paneleast = new JPanel();
    JPanel panelwest = new JPanel();
    /////////////////////////Title//////////////////////////
    JLabel myheaderLabel = new JLabel("");
    /*JLabel lblTitle = new JLabel("");
    private JComboBox cboTitle;
    private JLabel lblErrorOnTitleSpace;*/
    
    //////////////////New Venue/////////////////
    JLabel lblVenue = new JLabel("New Venue");
    JLabel myHeaderSpace1 = new JLabel("");
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
    JButton btnExit = new JButton("Exit");
    
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    
    public Admin(){
        welcomeLabel.setBounds(0,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        lblVenue.setBounds(10, 20, 900, 70);
        lblVenue.setFont(new Font(null, Font.PLAIN,25));
        lblVenueName.setBounds(10, 20, 900, 120);
        lblVenueName.setFont(new Font(null, Font.PLAIN,25));
        txtVenueName.setBounds(180, 70, 150, 120);
        frame.add(welcomeLabel);
        frame.add(panelnorth);
        frame.add(panelsouth);
        frame.add(paneleast);
        frame.add(panelwest);
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
        frame.add(btnExit);
        frame.add(blank1);
        frame.add(blank2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1420,700);
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
    public void setAdmin(){
        this.add(frame);
        this.add(welcomeLabel);
       // frame.add(panelnorth);
       // frame.add(panelsouth);
      //  frame.add(paneleast);
       // frame.add(panelwest);
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
    
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Previous")){

         
     } else if(e.getActionCommand().equals("Next")){

         
     } if (e.getActionCommand().equals("Exit")){
         System.exit(0);
     }
   }

    public static void main(String[] args) {
        new Admin().setAdmin();
    }
    
}
