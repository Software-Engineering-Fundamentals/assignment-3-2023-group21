package Group21.src.main.java.model;

import java.util.ArrayList;

public class User {
    
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
