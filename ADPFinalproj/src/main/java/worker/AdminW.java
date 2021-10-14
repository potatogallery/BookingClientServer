/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author raeec
 */
public class AdminW {
     
    private String venuename, venueaddress, firstname, password ;

    public String getVenuename() {
        return venuename;
    }

    public void setVenuename(String venuename) {
        this.venuename = venuename;
    }

    public String getVenueaddress() {
        return venueaddress;
    }

    public void setVenueaddress(String venueaddress) {
        this.venueaddress = venueaddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminW{" + "venuename=" + venuename + ", venueaddress=" + venueaddress + ", firstname=" + firstname + ", password=" + password + '}';
    }
    
    
}
