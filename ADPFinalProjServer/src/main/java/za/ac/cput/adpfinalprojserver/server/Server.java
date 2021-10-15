/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalprojserver.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import za.ac.cput.adpfinalprojserver.dao.adminDAO;
import za.ac.cput.adpfinalprojserver.dao.agentDAO;
import za.ac.cput.adpfinalprojserver.worker.AdminW;
import za.ac.cput.adpfinalprojserver.worker.AgentW;

/**
 **Server.java
 * @author Raeece Samuels (217283764) & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 * 
 * GUI APPL
 */
public class Server {
         ServerSocket communicate;
         Socket sock;
        private ObjectInputStream ois;
        private ObjectOutputStream out;
    
        agentDAO clientdao;
        adminDAO admindao;
        AdminW admin;
        AgentW client;
        
        String userRequest;
     
    ArrayList<AgentW> clients = new ArrayList<>();
    ArrayList<AdminW> admins = new ArrayList<>();

    public Server() throws SQLException {
        System.out.println("Server is online");
        runserver();
        listen();
        createChannels();
        processClient();
    }
    
    
    public void runserver() {
        // Create server socket
        try {
            communicate = new ServerSocket(1570, 10);
        }
        catch (IOException ioe)
        {
          System.out.println("IO Exception: " + ioe.getMessage());
        }
    }
    
    public void listen()
    {
       try {
            sock = communicate.accept();
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
    
    public void createChannels() {
        try {
            out = new ObjectOutputStream(sock.getOutputStream());
            out.flush();
            ois = new ObjectInputStream(sock.getInputStream());
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    
    
    
    }
    
    public void processClient() throws SQLException
    {
        try { 
            userRequest = (String) ois.readObject();
            // Step 2: communicate
            if (userRequest.equalsIgnoreCase("addVenue")) {
                    System.out.println("Requesting for Adding a New Venue");
                    AdminW ab = (AdminW) ois.readObject();
                    admindao = new adminDAO();
                    boolean a = admindao.newVenue(ab);
                    System.out.println("Venue has been added: " + a);
                    out.writeBoolean(a);
                    out.flush();
                }
            else if(userRequest.equalsIgnoreCase("addUser")){
            System.out.println("Requesting for Adding a New User");
                    AdminW cb = (AdminW) ois.readObject();
                    admindao = new adminDAO();
                    boolean b = admindao.newUser(cb);
                    System.out.println("Inventory added: " + b);
                    out.writeBoolean(b);
                    out.flush();
            }
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println("Class not found: " + cnfe.getMessage());
        }
        
    }
    
}
    