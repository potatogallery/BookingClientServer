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
import java.util.ArrayList;
import za.ac.cput.adpfinalprojserver.worker.AdminW;
import za.ac.cput.adpfinalprojserver.worker.Clients;
/**
 *
 * @author raeec
 */
public class Server {
    

    ServerSocket listener;
    Socket user;

    ObjectInputStream in;
    ObjectOutputStream out;

    Clients userDao;
    AdminW adminDao;
    
    
    String userRequest;

    ArrayList<Clients> users = new ArrayList<>();
    ArrayList<AdminW> admins = new ArrayList<>();
    
    
    public Server() {
        System.out.println("Server running");
        startServer();
        listen();
        createStreams();
        processClient();
    }

    public void startServer() {
        try {
            listener = new ServerSocket(9999, 1);
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }

    public void listen() {
        try {
            user = listener.accept();
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }

    public void createStreams() {
        try {
            out = new ObjectOutputStream(user.getOutputStream());
            out.flush();
            in = new ObjectInputStream(user.getInputStream());
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }

    public void processClient() {

        

    }
}
