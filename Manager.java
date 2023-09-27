import java.util.ArrayList;


public class Manager extends Administrator{
    
    private ArrayList<Enquiry> enquiries;

    public String answerEnquiry(int enquiryID) {
        return "response to enquiry";
    }

    public void receiveEnquiries( ArrayList<Enquiry> userEnquiries){
        this.enquiries = userEnquiries;
    }

    // Returns list of unanswered enquiries 
    // public void searchEnquiries(int ID){

    //     for (Enquiry enquiry: enquiries) {
            
    //         if (enquiry.readID() == ID) {
    //             enquiry.readEnquiry();
    //             String response = "---Manager responds to enquiry---";
    //             enquiry.setResponse(response);
    //         }
    //     }

    //     return 
    // }

    // returns enquiryID of requested enquiry 
    public int selectEnquiry(){
        return 1; // Dummy value REPLACE WITH CODE 
    }

} // end of class Manager 




