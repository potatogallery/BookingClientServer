/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;

import java.awt.Font;
import javax.swing.*;
import java.sql.Connection;
import DBConnection.dbConnect;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author POTATOE
 */
public class Users extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Users Class Fuctions Goes Here!");
    
    Connection con = dbConnect.derbyConnection();
    PreparedStatement Ps= null;
    ResultSet rs = null;
    
    
    private JPanel panelsouth;

    
    //////////////////FirstName & password/////////////////
    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblOnFirstNameSpace;
    
    private JLabel lblSurname;
    private JTextField txtSurname;
    private JLabel lblErrorSurname;
    
    private JLabel lblCell;
    private JTextField txtCell;
    private JLabel lblErrorCell;
    
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblErrorEmail;

    //////////////////BUTTONS/////////////////////
    private JButton btnExit;
    private JButton btnUpdate;
    private JButton btnRefresh;
    private JButton btnReset;
    
    Users user = new Users();
    
    public Users(){
        
        welcomeLabel.setBounds(0,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        
        frame.add(welcomeLabel);
        frame.add(user);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1420,700);
        frame.setLayout(null);
        frame.setVisible(true);
        dbConnect.derbyConnection();
       ///////////////////////////LOOOOKS OF GUI////////////////////////////////
      
      
      
      lblFirstName = new JLabel ("First Name:   ");
      txtFirstName = new JTextField (15);
      
       
      lblSurname = new JLabel ("Surname:   ");
      txtSurname = new JTextField (15);
      
      
      lblCell = new JLabel ("Cell:   ");
      txtCell = new JTextField (15);
      
      lblEmail = new JLabel ("Email:   ");
      txtEmail = new JTextField (15);
      
       
       btnExit = new JButton ("Exit");
       btnExit.setBackground(Color.BLACK);
       
       btnUpdate = new JButton ("Update");
       btnUpdate.setBackground(Color.YELLOW);
       
       
       btnReset = new JButton ("Reset");
       btnRefresh.setBackground(Color.MAGENTA);
       
       
       btnRefresh = new JButton ("Refresh");
       btnRefresh.setBackground(Color.ORANGE);
    }
    ////////////////////////*SETTTTINGGGG GUUUIIIII////////////////////////////////////////////////// 
   public void setUsers(){
                              
      this.setLayout(new GridLayout(12, 8));


      ///FIRSTNAME///
      this.add(lblFirstName);
      this.add(txtFirstName);

      ///Surname////
      this.add(lblErrorSurname);
      this.add(txtSurname);
      //this.add(lblErrorOnSurname);
      
      
      ///Cell////
      this.add(lblErrorCell);
      this.add(txtCell);
      //this.add(lblErrorOnCell);
       
      
      ///Email////
      this.add(lblErrorEmail);
      this.add(txtEmail);
      //this.add(lblErrorOnEmail);
      
      
      this.add(btnExit);
      this.add(btnUpdate);
      this.add(btnReset);
      this.add(btnRefresh);
      
      /////BUTTONS ACTIONLISTENERS///
        btnExit.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnRefresh.addActionListener(this);
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
   }
     
  ///////////////////// BUTTTTTTTTONNNNNN ACTTTTIOOOOOONS///////////////////////////////////////////
   public void actionPerformed(ActionEvent i){
       
       
   }
    public static void main(String[] args) {
        new Users().setUsers();
    }
    
}

//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// END OF PROGRAM /////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    

