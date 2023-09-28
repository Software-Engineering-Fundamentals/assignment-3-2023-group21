import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        createEnquiry();
    }

    // Instantiates User class and creates user enquiry
    public static void createEnquiry(){
        
        // Create one manager instance 
        Manager manager = new Manager(); 
        
        // User newUser = new User(manager);
        User newUser = new User();
        
        // Creates enquiry instance, saves to list of enquiries in User
        ArrayList<Enquiry> enquiryList = newUser.lodgeEnquiry(); 

        // Searches for user enquiries yet to be addressed by Mananger 
        ArrayList<Enquiry> openEnquiries = manager.searchForOpenEnquiries(enquiryList);

        // Manager retrieves messages of unanswered enquiries
        manager.getEnquiryContents(openEnquiries);

        // Manager responds to enquiries, updates response field for enquiry instance associated with User object
        manager.respondToEnquiry(openEnquiries);


    }


}