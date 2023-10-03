package Group21.src.main.java.model;

import java.util.ArrayList;


public class Manager extends Administrator{
    
    // private ArrayList<Enquiry> enquiries;


    // public void receiveEnquiries( ArrayList<Enquiry> userEnquiries){
    //     this.enquiries = userEnquiries;
    // }

    // Searches for unanswered user enquiries
    public ArrayList<Enquiry> searchForOpenEnquiries(ArrayList<Enquiry> userEnquiries){
        // manager method to search the unaddressed enquiries made by users

        // initialising the new array to store enquiries that are yet to be resolved
        ArrayList<Enquiry> openEnquiries = new ArrayList<>();

        System.out.println("Manager Searching Enquiries");
        // iterate over each enquiry of the input array, to simplify, we will assume
        // all enquiries have not been seen yet
        for (Enquiry enquiry: userEnquiries) {

            openEnquiries.add(enquiry);

        }

        return openEnquiries;
    }

    public Enquiry getEnquiryContents(ArrayList<Enquiry> openEnquiries, int enquiryID){
        // manager method for getting the string contents of the user enquiry that is selected

        System.out.println("Reading Unresolved Enquiry, ID number: " + enquiryID);

        // extracting the enquiry contents based on the enquiry ID selected
        Enquiry enquiry = openEnquiries.get(enquiryID - 1);

        return enquiry;
    }

    public void answerEnquiry(Enquiry enquiry){
        // manager method to respond to a chosen enquiry

        System.out.println("Responding to Enquiry: " + enquiry);

        String response = "---Manager response to enquiry---";
        System.out.println("Response Contents Set: " + response);

        enquiry.setResponse(response);
        System.out.println("Response Successful");

    }


    // returns enquiryID of requested enquiry 
    public int selectEnquiry(){
        return 1; // Dummy value REPLACE WITH CODE 
    }

} // end of class Manager 




