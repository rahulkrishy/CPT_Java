package Student_Management;
import java.util.ArrayList;

public class Remove_Student {
    // Method to remove student details by Roll No
    public static void remove_Student_details(ArrayList<Add_Student> Student_Details, int remove_by_rollNo) {
        boolean removed = false; // Flag to track if student is removed
        for (int i = 0; i < Student_Details.size(); i++) {
            if (Student_Details.get(i).get_Student_rollNo() == remove_by_rollNo) { // If Roll No matches
                Student_Details.remove(i); // Remove student from list
                System.out.println("Student with Roll No " + remove_by_rollNo + " removed successfully.");
                removed = true; // Set flag to true
                break; // Exit loop after removing the student
            }
        }
        if (!removed) {
            System.out.println("Student with Roll No " + remove_by_rollNo + " not found."); // If not found
        }
    }
}
