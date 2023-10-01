import java.util.ArrayList;


public class Manager extends Administrator{
    
    // private ArrayList<Enquiry> enquiries;


    // public void receiveEnquiries( ArrayList<Enquiry> userEnquiries){
    //     this.enquiries = userEnquiries;
    // }

    // Searches for unanswered user enquiries
    public ArrayList<Enquiry> searchForOpenEnquiries(ArrayList<Enquiry> userEnquiries){
        
        ArrayList<Enquiry> openEnquiries = new ArrayList<>();

        for (Enquiry enquiry: userEnquiries) {
            
            if (enquiry.readEnquiry() == null) {
                openEnquiries.add(enquiry);
            }
        }
        return openEnquiries;
    }

    public void getEnquiryContents(ArrayList<Enquiry> openEnquiries){
            
        for (Enquiry enquiry: openEnquiries) {
            enquiry.readEnquiry();
        }

    }

    public void respondToEnquiry(ArrayList<Enquiry> openEnquiries){

        for (Enquiry enquiry: openEnquiries) {
        
            enquiry.readEnquiry();
            String response = "---Manager response to enquiry---";
            enquiry.setResponse(response);
        }
    }


    // returns enquiryID of requested enquiry 
    public int selectEnquiry(){
        return 1; // Dummy value REPLACE WITH CODE 
    }

} // end of class Manager 




