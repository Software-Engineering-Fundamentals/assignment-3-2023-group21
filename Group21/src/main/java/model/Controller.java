package Group21.src.main.java.model;

import java.util.Random;
import java.util.List;
public class Controller {

    public int processPayment(int transactionID) { // method to process payment
        System.out.println("Processing Payment, transactionID: " + transactionID);

        return 1; // depending on the payment, it will return 0 on failure and 1 on success
    }

    public void createCourse(List<Object> courseDetails) { // method to set course category

        String category = (String) courseDetails.get(0);
        String introduction = (String) courseDetails.get(1);
        Double fees = (Double) courseDetails.get(2);

        // generates a new random courseID between 0-100
        Random random = new Random();
        int courseID = random.nextInt(100);
        // sets the default accessibility for the course to private
        String courseAvailability = "Private";

        Course course = new Course(courseID, courseAvailability);

        System.out.println("Creating Course, ID: " + courseID);
        System.out.println("Course Availability Set: " + courseAvailability);

        // setting the course attributes based on provided details
        System.out.println("Setting Course Category: " + category);
        course.setCategory(category);
        System.out.println("Setting Course Introduction: " + introduction);
        course.setIntroduction(introduction);
        System.out.println("Setting Course Fees: " + fees);
        course.setFees(fees);

        System.out.println("Course Created Successfully");
    }

    public void emailLoginCredentials() { // method to set course category
        System.out.println("Sending Login Credentials ...");
    }

} // end of class Course

