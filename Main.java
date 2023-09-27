public class Main {
    public static void main(String[] args) {
        createEnquiry();
        respondToEnquiry();
    }

    // Instantiates User class and creates user enquiry
    public static void createEnquiry(){
        
        Manager manager = new Manager(); // Create one manager instance 
        
        User newUser = new User(manager);

        newUser.lodgeEnquiry();

        int enquiryID = newUser.getEnquiryID();

        // Pass the enquiryID to the Manager to search for the enquiry
        manager.searchEnquiries(enquiryID);

    }

    // Instantiates Manager class and responds to enquiry
    public static void respondToEnquiry(){

    }

}