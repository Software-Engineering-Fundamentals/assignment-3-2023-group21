package Group21.src.main.java.model;

import java.sql.Date;
import java.util.ArrayList;

public class User {

    private int accountID;
    private String username;
    private String password;
    private String name;
    private String address;
    private int phone;
    private Date DOB;

    // Getter and setter for accountID
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter for phone
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // Getter and setter for DOB
    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public static void deleteAccount() {
        // Implementation of deleteAccount
    }

    public static void updateDetails() {
        // Implementation of updateDetails
    }

    private ArrayList<Enquiry> userEnquiries = new ArrayList<>();
    // private Manager manager;

    // User(Manager manager) {
    //     this.manager = manager;
    // }

    public ArrayList<Enquiry> lodgeEnquiry(){
        // method to create a new enquiry in the system to be addressed by a manager

        // setting contents and a generated unique identifier for the enquiry
        String userEnquiry = "...This is an enquiry created by a User...";
        int enquiryID = userEnquiries.size() + 1;
        System.out.println("Enquiry Contents Set:" + userEnquiry);

        // creating a new enquiry object based on the contents
        Enquiry newEnquiry = new Enquiry(enquiryID, userEnquiry);
        userEnquiries.add(newEnquiry);
        System.out.println("Enquiry Created");

        return userEnquiries;
        // manager.receiveEnquiries(userEnquiries);
    }

    public int getEnquiryID() {
        return userEnquiries.size() + 1;
    }

    public void enrolCourse(){}

    public void registerCourse(){}

} // end of class User 
