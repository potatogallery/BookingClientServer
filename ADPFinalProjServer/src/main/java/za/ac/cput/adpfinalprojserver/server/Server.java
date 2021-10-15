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
import za.ac.cput.adpfinalprojserver.dao.adminDAO;
import za.ac.cput.adpfinalprojserver.dao.clientDAO;
import za.ac.cput.adpfinalprojserver.worker.AdminW;
import za.ac.cput.adpfinalprojserver.worker.Clients;

/**
 *
 * @author raeece
 */
public class Server {
         ServerSocket communicate;
         Socket sock;
        private ObjectInputStream ois;
        private ObjectOutputStream out;
    
        clientDAO clientdao;
        adminDAO admindao;
        AdminW admin;
        Clients customer;
        
        String userRequest;
     
    
    /** Creates a new instance of ServerApp */
    
    {
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
        // Start listening for client connections
        try {
          System.out.println("Server is listening");
          sock = communicate.accept();  
          System.out.println("Now moving onto processClient");
          
          processClient();
        }
        catch(IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
        }
    }
    
    public void processClient()
    {
        // Communicate with the client
        
        // First step: initiate channels
        try {
            ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream());
            out.flush();
            ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
            
            // Step 2: communicate
            String msg = (String)in.readObject();
            System.out.println("From newCustomer>> " + msg);
            out.writeObject("Hello " + msg);
            out.flush();
            
            // Step 3:close down
            out.close();
            in.close();
            sock.close();        
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
    