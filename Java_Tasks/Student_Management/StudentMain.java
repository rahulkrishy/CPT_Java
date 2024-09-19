package Student_Management;
import java.util.*;

public class StudentMain {
    // Total count of students
    public static int student_TotalCount = 0;

    public static void main(String a[]) {
        // Welcome message
        System.out.println("\"Welcome to Student Management Tool\" ");
        // Scanner for user input
        Scanner scan = new Scanner(System.in);

        // List to store student details
        ArrayList<Add_Student> Student_Details = new ArrayList<>();
        
        // Main loop for user interaction
        boolean run = true;
        while(run) {
            // Menu options
            System.out.print("\n1.Add 2.Remove 3.Sort 4.Search 5.View 6.Exit \nEnter your Command(1-5): ");
            int InputCommand = scan.nextInt();
            
            switch(InputCommand) {
                case 1: 
                    System.out.println("\nAdd:");
                    add_new_student(Student_Details);
                    break;
                case 2: 
                    System.out.println("\nRemove:");
                    remove_student(Student_Details);
                    break;
                case 3: 
                    System.out.println("\nSort:");
                    sort_student(Student_Details);
                    break;
                case 4: 
                    System.out.println("\nSearch:");
                    Search_Student(Student_Details);
                    break;
                case 5: 
                    System.out.println("\nView:");
                    System.out.println("Total Students: "+ student_TotalCount);
                    View_Student.display_Students(Student_Details);
                    break;
                case 6: 
                    System.out.println("\nExit:");
                    run = false;
                    break;
                default: 
                    System.out.println("InValid Input, Try again..");
            }
        }
        // Close scanner
        scan.close();
    }

    // Method to add a new student
    @SuppressWarnings("resource")
    private static void add_new_student(ArrayList<Add_Student> Student_Details) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String Student_name = scan.nextLine();
        System.out.print("Enter Student Roll No: ");
        int Student_RollNo = scan.nextInt();
        System.out.print("Enter Student Age: ");
        int Student_Age = scan.nextInt();
        System.out.print("Enter Student GPA: ");
        Double Student_GPA = scan.nextDouble();
        
        // Create new student object and add to list
        Add_Student add_student = new Add_Student(Student_name, Student_RollNo, Student_Age, Student_GPA);
        Student_Details.add(add_student);
        // Increment total student count
        student_TotalCount++; 
        System.out.println("New Student Details Successfully added");
    }

    // Method to remove a student
    @SuppressWarnings("resource")
    private static void remove_student(ArrayList<Add_Student> Student_Details) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Roll No of the Students to Remove: ");
        int remove_by_rollNo = scan.nextInt();
        Remove_Student.remove_Student_details(Student_Details, remove_by_rollNo);
        // Decrement total student count
        student_TotalCount--; 
    }

    // Method to sort students by Roll No or GPA
    @SuppressWarnings("resource")
    private static void sort_student(ArrayList<Add_Student> Student_Details) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.RollNo 2.GPA \n Enter Sort by(1/2): ");
        int sort_by = scan.nextInt();
        Sort_Student.sort_Student_details(Student_Details, sort_by);
    }

    // Method to search students by Name
    @SuppressWarnings("resource")
    private static void Search_Student(ArrayList<Add_Student> Student_Details) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student to search: ");
        String search_by_name = scan.nextLine();
        Search_Student.search_Student_details(Student_Details, search_by_name);
    }
}
