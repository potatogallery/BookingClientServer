/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.net.Socket;
import java.util.ArrayList;
import sun.nio.fs.WindowsUserPrincipals.User;
import worker.AdminW;
import worker.Clients;

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
    
    
    
   public boolean addVenue(Adminw adminw) {
        try {
            out.writeObject("add Venue");
            out.flush();
            out.writeObject(user);
            out.flush();
            System.out.println("ClientServer addUser method: completed");
            return in.readBoolean();
        } catch (IOException ioe) {
            System.out.println("ClientServer addUser Method: " + ioe);
            return false;
        }
    }

    
            }






