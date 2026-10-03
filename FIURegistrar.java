package codingProjects;
import java.util.Scanner;

public class FIURegistrar {
    static int numStudents;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Student[] students = createArrayOfStudents(scnr); //calls array of students to create a list of students to be inputted
        processStudents(students); //processes student array and calculates highest, lowest, and average gpa
    }

    //creates array of students and their info
    public static Student[] createArrayOfStudents(Scanner scnr) {
        System.out.print("How many students would you like to process? ");
        numStudents = scnr.nextInt();
        scnr.nextLine();

        //initializing array
        Student[] students = new Student[numStudents];

        //loop to ask for student info
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Input information for student " + (i + 1) + " below:");

            System.out.print("First Name: ");
            String getFirstName = scnr.nextLine();

            System.out.print("Last Name: ");
            String lastName = scnr.nextLine();

            System.out.print("Panther ID: ");
            int ID = scnr.nextInt();

            double gpa;
            //keeps gpa between 0.0 and 4.0
            while (true) {
                System.out.print("GPA (between 0.0 and 4.0): ");
                gpa = scnr.nextDouble();
                scnr.nextLine();
                if (gpa >= 0.0 && gpa <= 4.0) { //makes sure input is only between 0.0 and 4.0
                    break;
                } else {
                    System.out.println("Invalid GPA. Please input GPA again"); //if gpa is not within limits, it will ask user to put gpa again
                }
                System.out.println();
            }
            students[i] = new Student(getFirstName, lastName, ID, gpa); // student object made from data provided by user
        }
        return students; // returns array of students
    }

    //processes student array to find lowest, highest, and average gpa
    public static void processStudents(Student[] students) {
        double sumGPA = 0.0;
        double lowestGPA = Double.MAX_VALUE;
        double highestGPA = Double.MIN_VALUE;

        //loop to compare gpa
        for (Student student : students) {
            System.out.println(student);

            double gpa = student.getGpa();
            sumGPA += gpa;

            if (gpa > highestGPA) {
                highestGPA = gpa;
            }
            if (gpa < lowestGPA) {
                lowestGPA = gpa;
            }
        }
        double averageGPA = sumGPA / students.length; //computes average gpa using values inputted by user

        System.out.println();
        //will output average, lowest, and highest GPA
        System.out.println("Lowest GPA: " + lowestGPA);
        System.out.println("Highest GPA: " + highestGPA);
        System.out.printf("Average GPA: %.2f\n", averageGPA); //prints average gpa with 2 decimal places

        System.out.println(); //space between info for clearer view

        //shows students whose gpa is above average
        System.out.println("Students with an above average GPA: ");
        for (Student student : students) {
            if (student.getGpa() > averageGPA) {
                System.out.println(student.toString());
            }
        }
    }
}
