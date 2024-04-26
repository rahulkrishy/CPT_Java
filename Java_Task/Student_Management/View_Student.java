package Student_Management;
import java.util.*;

public class View_Student {
    // Method to display student details
    public static void display_Students(ArrayList<Add_Student> Student_Details) {
        // Loop through the list of students and display their details
        for(Add_Student student: Student_Details) {
            // Print student details
            System.out.print(" Name: " + student.get_Student_name() + " | ");
            System.out.print(" Roll No: " + student.get_Student_rollNo() + " | ");
            System.out.print(" Age: " + student.get_Student_Age() + " | ");
            System.out.print(" GPA: " + student.get_Student_GPA() + " | ");
            System.out.println(); // Move to the next line for the next student
        }
    }
}
