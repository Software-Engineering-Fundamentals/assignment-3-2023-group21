
public class Enquiry {
    private int enquiryID; // unique identifier for enquiry
    private String enquiryContents; //contents of enquiry

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

    // Returns list of enquiries 
    public int searchEnquiries(){
        return 1; // Dummy value REPLACE WITH CODE 
    }

    // returns enquiryID of requested enquiry 
    public int selectEnquiry(){
        return 1; // Dummy value REPLACE WITH CODE 
    }
        
} // end of class Enquiry

