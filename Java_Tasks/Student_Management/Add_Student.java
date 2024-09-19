package Student_Management;

public class Add_Student {
    // Instance variables
    private String Student_name;
    private int Student_rollNo;
    private int Student_Age;
    private double Student_GPA;

    // Constructor
    Add_Student(String Student_name, int Student_rollNo, int Student_Age, double Student_GPA) {
        this.Student_name = Student_name;
        this.Student_rollNo = Student_rollNo;
        this.Student_Age = Student_Age;
        this.Student_GPA = Student_GPA;
    }

    // Getters for accessing private variables
    public String get_Student_name() {
        return this.Student_name;
    }

    public int get_Student_rollNo() {
        return this.Student_rollNo;
    }

    public int get_Student_Age() {
        return this.Student_Age;
    }

    public double get_Student_GPA() {
        return this.Student_GPA;
    }
}
