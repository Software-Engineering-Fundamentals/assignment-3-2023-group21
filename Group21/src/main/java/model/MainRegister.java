package Group21.src.main.java.model;

import java.util.ArrayList;

public class MainRegister {
    public static void main(String[] args) {
        registerCourse();
    }

    public static void registerCourse(){

        System.out.println("Scenario: Instructor Registers a Course");

        // Create one instructor instance
        Instructor instructor = new Instructor();
        // Create a new controller instance
        Controller controller = new Controller();

        // send course details
        ArrayList<Object> courseDetails = instructor.sendCourseDetails();
        // send account details
        instructor.sendAccountDetails();
        // make payment
        int transactionID = instructor.makePayment();

        // controller processes payment details to ensure that they are valid to complete the transaction
        int status = controller.processPayment(transactionID);

        if (status == 1) {
            System.out.println("Payment Validated, Proceeding to Create Course");
            // Controller creating the new course once the payment is successful
            controller.createCourse(courseDetails);

            // dummy value to say that the instructor already has an account
            boolean userRegistered = true;

            if (!userRegistered) {
                // if the instructor has not been registered with the learning portal, email them login credentials
                controller.emailLoginCredentials();
            }

        } else {
            System.out.println("Payment was not successful, process cancelled");
        }


    }


}