/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalprojserver.worker;

import java.io.Serializable;

/**
 *
 * @author raeec
 */
public class AgentW implements Serializable{
    
   private String firstname, surname, cell, email, bvenue, rdate ;

    public AgentW(String firstname, String surname, String cell, String email, String bvenue, String rdate) {
        this.firstname = firstname;
        this.surname = surname;
        this.cell = cell;
        this.email = email;
        this.bvenue = bvenue;
        this.rdate = rdate;
    }
   
   

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBvenue() {
        return bvenue;
    }

    public void setBvenue(String bvenue) {
        this.bvenue = bvenue;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    @Override
    public String toString() {
        return "Clients{" + "firstname=" + firstname + ", surname=" + surname + ", cell=" + cell + ", email=" + email + ", bvenue=" + bvenue + ", rdate=" + rdate + '}';
    }
}
