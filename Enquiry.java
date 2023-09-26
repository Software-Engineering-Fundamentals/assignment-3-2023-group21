public class Enquiry {
    private int enquiryID; // unique identifier for enquiry
    private String enquiryContents; //contents of enquiry
    
    public void setEnquiryID(int enquiryID) { // sets identifier for enquiry
        this.enquiryID = enquiryID;
    }

    public void setEnquiryContents(String enquiryContents) { //sets contents of enquiry
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

    // public int searchEnquiry(){}
        
}

