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
    JLabel welcomeLabel = new JLabel("");
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
        welcomeLabel.setBounds(650,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,18));
        ////New Venue
        lblVenue.setBounds(10, 20, 900, 70);
        lblVenue.setFont(new Font(null, Font.PLAIN,18));
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
        lblutype.setBounds(10, 20, 900, 670);
        lblutype.setFont(new Font(null, Font.PLAIN,18));
        cboutype.setBounds(160, 330, 900, 0);
        cboutype.setSize(200 , 50);
        cboutype.setBackground(Color.LIGHT_GRAY);
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
        tblVenues.setBounds(700, 90, 900, 0);
        tblVenues.setSize(500,300);
        tblVenues.setBackground(Color.LIGHT_GRAY);
        ///////iNACTIVE
        lblinactive.setBounds(700, 20, 900, 940);
        lblinactive.setFont(new Font(null, Font.PLAIN,18));
        cboinactive.setBounds(850, 470, 900, 940);
        cboinactive.setSize(200 , 50);
        cboinactive.setBackground(Color.LIGHT_GRAY);
        /////// BUTTONS
        btnUpdate.setBounds(300, 600 , 150, 0);
        btnUpdate.setSize(100, 40);
        btnReset.setBounds(550, 600 , 150, 0);
        btnReset.setSize(100, 40);
        btnExit.setBounds(800, 600 , 150, 0);
        btnExit.setSize(100, 40);
        
        
        
        
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
        cboutype.addItem("-----");
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
        frame.add(btnExit);
        frame.add(blank1);
        frame.add(blank2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1250,700);
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
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Update")){

         
     } else if(e.getActionCommand().equals("Reset")){

         
     } if (e.getActionCommand().equals("Exit")){
         System.exit(0);
     }
   }

    public static void main(String[] args) {
        new Admin().setAdmin();
    }
    
}
