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
    
   public boolean addVenue(AdminW admin) {
        try {
            out.writeObject("add Venue");
            out.flush();
            out.writeObject(admin);
            out.flush();
            System.out.println("ClientServer addUser method: completed");
            return ois.readBoolean();
        } catch (IOException ioe) {
            System.out.println("ClientServer addUser Method: " + ioe);
            return false;
        }
    }

    
            }






