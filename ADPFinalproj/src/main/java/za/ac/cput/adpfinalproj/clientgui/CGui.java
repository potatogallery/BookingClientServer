/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalproj.clientgui;

import java.awt.*;
import java.awt.event.*;
/**
 *CGui.java
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 * 
 * GUI APPL
 */
public class CGui extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;

        public static void main(String[] args) {
                CGui myWindow = new CGui("My first window");
                myWindow.setSize(350,100);
                myWindow.setVisible(true);
        }

        public CGui(String title) {

                super(title);
                setLayout(new FlowLayout());
                addWindowListener(this);
                b = new Button("Click me");
                add(b);
                add(text);
                b.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                numClicks++;
                text.setText("Button Clicked " + numClicks + " times");
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}