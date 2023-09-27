import java.util.ArrayList;

public class User {
    
    private ArrayList<Enquiry> userEnquiries = new ArrayList<>();
    private Manager manager;

    User(Manager manager) {
        this.manager = manager;
    }

    public void lodgeEnquiry(){

        String userEnquiry = "...This is an enquiry created by a User...";
        int enquiryID = userEnquiries.size() + 1;
        Enquiry newEnquiry = new Enquiry(enquiryID, userEnquiry);
        userEnquiries.add(newEnquiry);
        manager.receiveEnquiries(userEnquiries);
    }

    public int getEnquiryID() {
        return userEnquiries.size() + 1;
    }

    public void enrolCourse(){}

    public void registerCourse(){}

} // end of class User 
