/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author POTATOE
 */
public class Admin extends JFrame {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Admin Class Action goes here!");
    
    public Admin(){
        
        welcomeLabel.setBounds(0,0,900,50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void setGUI(){
    
    this.add(welcomeLabel);
    this.add(frame);
    
    
    }
    public static void main(String[] args) {
        new Admin().setGUI();
    }
    
}
