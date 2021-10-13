/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;

import DBConnection.dbConnect;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.ListIterator;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import worker.CWorker;
import za.ac.cput.adpfinalproj.clientgui.Admin;
import za.ac.cput.adpfinalproj.clientgui.Users;
import Server.ServerCL;
import static com.sun.tools.sjavac.Util.set;
import static java.lang.reflect.Array.set;
import java.sql.SQLException;
/**
 *CGui.java
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 * 
 * GUI APPL
 */
public class CGui extends JFrame implements ActionListener {
    
Connection con = dbConnect.derbyConnection();
PreparedStatement ps= null;
ResultSet ra = null;
    private JPanel panelsouth;
    /////////////////////////list//////////////////////////
    private JLabel myHeaderSpacing; 
    private JLabel myheaderLabel;
    private JLabel myHeaderSpace1;
    
    private JLabel lblTitle;
    private JComboBox cboTitle;
    private JLabel lblErrorOnTitleSpace;
    
    //////////////////FirstName & password/////////////////
    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblOnFirstNameSpace;
    
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JLabel lblErrorOnPassword;
    

    //////////////////BUTTONS/////////////////////
    private JButton btnEnter;
    private JLabel blank1;
    private JLabel blank2;
    
   public CGui(){
       
       
       dbConnect.derbyConnection();
       ///////////////////////////LOOOOKS OF GUI////////////////////////////////
      myHeaderSpacing = new JLabel();
      ///ICON//
      ImageIcon rog1 = new ImageIcon(new ImageIcon("").getImage().getScaledInstance(120, 90, Image.SCALE_DEFAULT));
      ///ICON//
      myheaderLabel = new JLabel("JK.CO BOOKINGS");
      myheaderLabel.setHorizontalAlignment(JLabel.CENTER);
      myHeaderSpace1 = new JLabel(rog1); 
      
      blank1 = new JLabel ("");
      //blank2 = new JLabel ("");
      lblTitle = new JLabel ("Authenticate: ");
      cboTitle = new JComboBox ();
      lblErrorOnTitleSpace = new JLabel("");
      
      lblFirstName = new JLabel ("First Name:   ");
      txtFirstName = new JTextField (15);
      
       
      lblPassword = new JLabel ("Password:   ");
      txtPassword = new JTextField (15);
      
       
       btnEnter = new JButton ("Enter");
       btnEnter.setBackground(Color.GREEN);
   
    }
   ////////////////////////*SETTTTINGGGG GUUUIIIII////////////////////////////////////////////////// 
   public void setCGUI(){
                              
      this.setLayout(new GridLayout(12, 3));
      
      
      this.add(myHeaderSpace1);
      this.add(myheaderLabel);
      this.add(myHeaderSpacing);
      
      
      this.add(blank1);
      this.add(lblTitle);
      this.add(cboTitle);
      
      cboTitle.addItem("Admin");
      cboTitle.addItem("User");


      ///FIRSTNAME///
      this.add(lblFirstName);
      this.add(txtFirstName);

      ///password////
      this.add(lblPassword);
      this.add(txtPassword);
      //this.add(lblErrorOnPassword);
       
      this.add(btnEnter);
      
      /////BUTTONS ACTIONLISTENERS///
        btnEnter.addActionListener(this);
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
   }

  ///////////////////// BUTTTTTTTTONNNNNN ACTTTTIOOOOOONS///////////////////////////////////////////

    @Override
   public void actionPerformed(ActionEvent e){
       String login= "SELECT * FROM multilogin WHERE firstname=? AND passw=? AND utype=?" ;
       try{
           ps=con.prepareStatement(login);
           ps.setString(1, txtFirstName.getText());
           ps.setString(2, txtPassword.getText());
           ps.setString(3, (String) cboTitle.getSelectedItem());
           ra= ps.executeQuery();         
           
           
           if(ra.next()){
              JOptionPane.showMessageDialog(this, "Welcome  "+ra.getString("utype"));
               if(cboTitle.getSelectedIndex()==0){ 
                   Admin ad = new Admin();
                   dispose();
               }else{ 
                   Users mi = new Users();
                   dispose();
               }
            }else {
               JOptionPane.showMessageDialog(null, "Login Failed!");
           }
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
       }
   }
   public static void main(String[] args) {
        new CGui().setCGUI();
       
    }
}
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// END OF PROGRAM /////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////