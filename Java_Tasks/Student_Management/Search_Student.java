package Student_Management;
import java.util.ArrayList;

public class Search_Student {
    // Method to search for a student by name
    public static void search_Student_details(ArrayList<Add_Student> Student_Details, String search_by_name) {
        boolean found = false; // Flag to track if the student is found
        // Loop through the list of students
        for (Add_Student student : Student_Details) {
            // Check if the name matches the search query (case insensitive)
            if (student.get_Student_name().equalsIgnoreCase(search_by_name)) {
                System.out.println("Student Found"); // Print message
                // Print student details
                System.out.print(" Name: " + student.get_Student_name() + " | ");
                System.out.print(" Roll No: " + student.get_Student_rollNo() + " | ");
                System.out.print(" Age: " + student.get_Student_Age() + " | ");
                System.out.print(" GPA: " + student.get_Student_GPA() + " | ");
                System.out.println(); // Move to the next line
                found = true; // Set the flag to true
                break; // Exit the loop since the student is found
            }
        }
        // If the student is not found
        if (!found) {
            System.out.println("Student " + search_by_name + " not Found."); // Print message
        }
    }
}
