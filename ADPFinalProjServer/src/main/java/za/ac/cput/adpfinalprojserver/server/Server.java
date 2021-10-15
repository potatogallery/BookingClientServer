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
/**
 *
 * @author raeece
 */
public class Server {
    

     // Server socket
    private ServerSocket listener;
    
    // Client connection
    private Socket client;
    
    /** Creates a new instance of ServerApp */
    
    {
        // Create server socket
        try {
            listener = new ServerSocket(1570, 10);
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
          client = listener.accept();  
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
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            out.flush();
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            
            // Step 2: communicate
            String msg = (String)in.readObject();
            System.out.println("From newCustomer>> " + msg);
            out.writeObject("Hello " + msg);
            out.flush();
            
            // Step 3:close down
            out.close();
            in.close();
            client.close();        
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
    public void processClient() {

        try {
            do {
                userRequest = (String) in.readObject();
            
            if (userRequest.equalsIgnoreCase("addUser")) {
                    System.out.println("Requesting to Add User");
                    User user = (User) in.readObject();
                    userDao = new UserDao();
                    boolean response = userDao.addUser(user);
                    System.out.println("User added: " + response);
                    out.writeBoolean(response);
                    out.flush();
            }
    }

  
    public static void main(String[] args)
    {
        
        
        
    }    

}
