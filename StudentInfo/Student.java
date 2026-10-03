package codingProjects;

public class Student {
    //initiates variables
    private String firstName;
    private String lastName;
    private double ID;
    private double gpa;

    public Student(String firstName, String lastName, double ID, double gpa) { //constructors
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.gpa = gpa;
    }

    //setters and getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getID() {
        return ID;
    }
    public double getGpa() {
        return gpa;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setID(double ID) {
        this.ID = ID;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() { //toString method outputting info user was asked to input
        return "Student Name: " + firstName + " " + lastName + ", " + "Panther ID: " + ID + ", " + "Student GPA: " + gpa;
    }
}
