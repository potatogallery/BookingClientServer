/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpfinalprojserver.worker;

/**
 *
 * @author raeec
 */
public class AdminW {
     
    private String venuename, venueaddress, firstname, password, usertype, inactive ;

    public AdminW(String venuename, String venueaddress, String firstname, String password, String usertype, String inactive) {
        this.venuename = venuename;
        this.venueaddress = venueaddress;
        this.firstname = firstname;
        this.password = password;
        this.usertype = usertype;
        this.inactive = inactive;
    }

    
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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    @Override
    public String toString() {
        return "AdminW{" + "venuename=" + venuename + ", venueaddress=" + venueaddress + ", firstname=" + firstname + ", password=" + password + ", usertype=" + usertype + ", inactive=" + inactive + '}';
    }
    


    
    
}
