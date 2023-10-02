package Group21.src.main.java.model;

import java.util.ArrayList;

public class MainEnquiry {
    public static void main(String[] args) {
        createEnquiry();
    }

    // Instantiates User class and creates user enquiry
    public static void createEnquiry(){

        System.out.println("Scenario: User Lodges Enquiry and Manager Responds");

        // Create one manager instance 
        Manager manager = new Manager(); 
        
        // User newUser = new User(manager);
        User newUser = new User();
        
        // Creates enquiry instance, saves to list of enquiries in User
        ArrayList<Enquiry> enquiryList = newUser.lodgeEnquiry(); 

        // Searches for user enquiries yet to be addressed by manager
        ArrayList<Enquiry> openEnquiries = manager.searchForOpenEnquiries(enquiryList);

        // Manager selects a chosen enquiry amongst the open enquiries
        int enquiryID = manager.selectEnquiry();

        // Manager retrieves contents of an unanswered enquiry
        Enquiry enquiry = manager.getEnquiryContents(openEnquiries, enquiryID);

        // Manager responds to enquiries, updates response field for enquiry instance associated with User object
        manager.respondToEnquiry(enquiry);

    }


}