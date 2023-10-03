package Group21.src.main.java.model;

import java.util.Date;

public class Payment {
    public int transactionID; // unique identifier for course
    public Float amount; // learning category of course
    public Date date; // excerpt to describe course to potential students
    public String paymentDetails; // course access settings of course (public/private)
    public String paymentMethod; // the cost to enrol and undertake the course

    public Payment(String paymentDetails) {
        // placeholder ID
        this.transactionID = 1;
        this.paymentDetails = paymentDetails;
    }// constructor for payment objects

} // end of class Course

