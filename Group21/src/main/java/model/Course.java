package Group21.src.main.java.model;

public class Course {
    public int courseID; // unique identifier for course
    public String courseCategory; // learning category of course
    public String courseIntroduction; // excerpt to describe course to potential students
    public String courseAvailability; // course access settings of course (public/private)
    public Double fees; // the cost to enrol and undertake the course

    public Course(int courseID, String courseAvailability) { // constructor for course objects
        this.courseID = courseID;
        this.courseAvailability = courseAvailability; // availability by default will be set to private
                                                      // as there is no content nor reason to be released unfinished
    }

    public void setCategory(String category) { // method to set course category
        this.courseCategory = category;
    }

    public void setIntroduction(String introduction) { // method to set course introduction
        this.courseIntroduction = introduction;
    }

    public void setFees(Double fees) { // method to set course fees
        this.fees = fees;
    }

} // end of class Course

