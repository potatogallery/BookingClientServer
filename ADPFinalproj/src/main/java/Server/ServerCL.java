/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import worker.AdminW;

/**
 *ServerCL.java
 * @author Raeece Samuels ('StundentNo') & Keallan Saunders (219169357)
 * ADP262S FINAL PROJECT DD:15 OCT 2021
 * awe other go was here
 * SERVER CLASS
 * 
 * 
 */
public class ServerCL {
    private ObjectOutputStream out;
    private ObjectInputStream ois;
    private Socket sock;
    
    public void ServerCL()
    {
        //SERVER CONNECTION FROM CLIENT.
    
        try {
            sock = new Socket("localhost", 1570);
            out = new ObjectOutputStream(sock.getOutputStream());
            out.flush();
            ois = new ObjectInputStream(sock.getInputStream());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    
   public boolean addVenue(AdminW admin) {
        try {
            out.writeObject("add Venue");
            out.flush();
            out.writeObject(admin);
            out.flush();
            System.out.println("ServerCL Venue ADD: finished");
            return ois.readBoolean();
        } catch (IOException ioe) {
            System.out.println("ServerCL Venue ADD: " + ioe);
            return false;
        }
    }
   public boolean addUser(AdminW admin){
       try {
            out.writeObject("add User");
            out.flush();
            out.writeObject(admin);
            out.flush();
            System.out.println("ServerCL User ADD: finished");
            return ois.readBoolean();
        } catch (IOException ioe) {
            System.out.println("ServerCL User ADD: " + ioe);
            return false;
        }
   }
   
   
   
   
   
  public static void main(String[] args)
    {
        ServerCL ab = new ServerCL();
        ab.ServerCL();
    }  
  
}







