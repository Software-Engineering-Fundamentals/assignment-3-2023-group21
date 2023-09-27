
public class Enquiry {
    private int enquiryID; // unique identifier for enquiry
    private String enquiryContents; //contents of enquiries
    private String managerResponse; //stores response to enquiry if addressed by manager class

    Enquiry(int enquiryID, String enquiryContents) { // Constructor for Enquiry class 
        this.enquiryID = enquiryID;
        this.enquiryContents = enquiryContents;
    }

    // Getter method to return unique ID of enquiry
    public int readID(){
        return enquiryID;
    }

    // Getter method to return the value of myString
    public String readEnquiry(){
        return enquiryContents;
    }

    public void setResponse(String managerResponse) {
        this.managerResponse = managerResponse;
    }

} // end of class Enquiry

