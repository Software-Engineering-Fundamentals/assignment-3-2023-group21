package Group21.src.main.java.model;

import java.util.ArrayList;

public class Instructor extends Administrator{


    public void getEnquiryContents(ArrayList<Enquiry> openEnquiries){

        for (Enquiry enquiry: openEnquiries) {
            enquiry.readEnquiry();
        }

    }



}
