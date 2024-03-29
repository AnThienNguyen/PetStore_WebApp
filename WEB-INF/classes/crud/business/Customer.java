// save as "<TOMCAT_HOME>\webapps\a4\WEB-INF\classes\crud\business\Customer.java"
package crud.business;

import java.io.Serializable;

public class Customer implements Serializable {
	private String id;
    private String fname;
    private String lname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String balance;
    private String totalSales;
    private String notes;

    public Customer() {
    	id = "";
        fname = "";
        lname = "";
        street = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        email = "";
        balance = "";
        totalSales = "";
        notes = "";
    }

    public Customer(String parId, String parFirstName, String parLastName, String parStreet, String parCity, String parState, String parZip, String parPhone, String parEmail, String parBalance, String parTotalSales, String parNotes)
    {
    	this.id = parId;
        this.fname = parFirstName;
        this.lname = parLastName;
        this.street = parStreet;
        this.city = parCity;
        this.state = parState;
        this.zip = parZip;
        this.phone = parPhone;
        this.email = parEmail;
        this.balance = parBalance;
        this.totalSales = parTotalSales;
        this.notes = parNotes;
    }

    //id
    public String getId() {
        return id;
    }

    public void setId(String parId) {
        this.id = parId;
    }

    //fname
    public String getFname() {
        return fname;
    }

    public void setFname(String parFirstName) {
        this.fname = parFirstName;
    }

    //lname
    public String getLname() {
        return lname;
    }

    public void setLname(String parLastName) {
        this.lname = parLastName;
    }

    //street
    public String getStreet() {
        return street;
    }

    public void setStreet(String parStreet) {
        this.street = parStreet;
    }

    //city
    public String getCity() {
        return city;
    }

    public void setCity(String parCity) {
        this.city = parCity;
    }
        
    //state
    public String getState() {
        return state;
    }

    public void setState(String parState) {
        this.state = parState;
    }
    
    //zip    
    public String getZip() {
        return zip;
    }

    public void setZip(String parZip) {
        this.zip = parZip;
    }
    
    //phone    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String parPhone) {
        this.phone = parPhone;
    }
    
    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String parEmail) {
        this.email = parEmail;
    }

    //balance
    public String getBalance() {
        return balance;
    }

    public void setBalance(String parBalance) {
        this.balance = parBalance;
    }
    
    //totalSales    
    public String getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(String parTotalSales) {
        this.totalSales = parTotalSales;
    }
        
    //notes    
    public String getNotes() {
        return notes;
    }

    public void setNotes(String parNotes) {
        this.notes = parNotes;
    }
    
}
