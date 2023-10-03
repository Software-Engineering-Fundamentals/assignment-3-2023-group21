package Group21.src.main.java.model;

import java.util.ArrayList;
public class Instructor extends Administrator{


    public static ArrayList<Object> sendCourseDetails(){

        ArrayList<Object> courseDetails = new ArrayList<>();

        // initialising course details that are sent to the controller for when the payment is processed
        String category = "Category";
        String introduction = "This is the course introduction";
        Double fees = 300.0;

        courseDetails.add(category);
        courseDetails.add(introduction);
        courseDetails.add(fees);

        System.out.println("Course Details Sent");
        return courseDetails;
    }

    public void sendAccountDetails(){
        // method for instructor to send personal details to the system for course registration
        // initialise a string to represent details rather than complicate it
        String accountDetails = "This is the personal details of the instructor";
        System.out.println("Personal Details Sent");
    }

    public static int makePayment(){
        // instructor method to make a payment

        // initialise payment details, for simplicity it will not be detailed
        String paymentDetails = "payment details...";

        System.out.println("Creating Payment");
        // creating a payment object and making a transactionID
        Payment payment = new Payment(paymentDetails);
        int transactionID = 1;
        payment.transactionID = transactionID;

        return transactionID;
    }



}
