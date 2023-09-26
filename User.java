import java.util.Scanner;

public class User {
    
    public void enrolCourse(){}

    public void registerCourse(){}

    public void lodgeEnquiry(){

        // If user input is expected, use the code below:
        // System.out.println("Please enter your enquiry:");

        // String userEnquiry1 = "";
        // Scanner scnr = new Scanner(System.in);
        
        // while(scnr.hasNext()){
        //     String s = scnr.next();
        //     userEnquiry1 = userEnquiry1 + s;
        // }
        // scnr.close();

        // Should we have to randomly generate an ID for each enquiry?
        // Enquiry newEnquiryInput = new Enquiry(1, userEnquiry1); 
        // System.out.println(newEnquiryInput.get);


        // If user input is NOT expected,, use the code below:
        String userEnquiry2 = "...This is an enquiry created by User class...";
        Enquiry newEnquiryNoInput = new Enquiry(1, userEnquiry2);

    }

} // end of class User 
