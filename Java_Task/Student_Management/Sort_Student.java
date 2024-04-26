package Student_Management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort_Student {
    // Method to sort student details by Roll No or GPA
    public static void sort_Student_details(ArrayList<Add_Student> Student_Details, int sort_by) {
        switch (sort_by) {
            case 1: // Sort by Roll No
                Collections.sort(Student_Details, Comparator.comparing(Add_Student::get_Student_rollNo));
                System.out.println("Students sorted by Roll No:");
                View_Student.display_Students(Student_Details); // Display sorted students
                break;
            case 2: // Sort by GPA
                Collections.sort(Student_Details, Comparator.comparing(Add_Student::get_Student_GPA));
                System.out.println("Students sorted by GPA:");
                View_Student.display_Students(Student_Details); // Display sorted students
                break;
            default: // Invalid choice
                System.out.println("Invalid choice for sorting.");
                break;
        }
    }
}
