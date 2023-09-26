public class Main {
    public static void main(String[] args) {
        createEnquiry();
        respondToEnquiry();
    }

    // Instantiates User class and creates user enquiry
    public static void createEnquiry(){
        // Enquiry enquiry = new Enquiry();
        User newUser = new User();
        newUser.lodgeEnquiry();

    }

    // Instantiates Manager class and responds to enquiry
    public static void respondToEnquiry(){

    }

}