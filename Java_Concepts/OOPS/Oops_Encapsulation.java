// Encapsulation
/*
Encapsulation is a fundamental concept in object-oriented programming (OOP) that combines data (attributes) and methods (behaviors) into a single unit called a class. 
It involves hiding the internal state of objects and only allowing access to the data through well-defined interfaces (methods). 
Encapsulation is crucial for achieving data abstraction, data hiding, and access control in OOP.

1)Data Hiding:
- Encapsulation hides the internal state (data) of an object from the outside world.
- Data members (attributes) of a class are typically declared as private, making them inaccessible from outside the class.

2)Access Modifiers:
- Access modifiers control the visibility and accessibility of classes, methods, and variables in Java.
- In encapsulation, data members are often marked as private to restrict direct access and modification.
- Common access modifiers:
  - public: Accessible from anywhere.
  - private: Accessible only within the same class.
  - protected: Accessible within the same package or subclass.
  - Default (package-private): Accessible only within the same package.

3)Getter and Setter Methods:
- Getter methods: Also known as accessor methods, they provide read-only access to private data members.
- Setter methods: Also known as mutator methods, they provide write access to private data members and enable controlled modification of data.
- Getter and setter methods encapsulate the access to private data, allowing controlled interaction with the object's state.

4)"this" keyword:
-"this" keyword in Java refers to the current object instance within a class. 
-It is used to differentiate between instance variables and parameters or local variables with the same name. 
-Accessing instance variables or methods: this.variableName or this.methodName().
 */


// Base class
public class Oops_Encapsulation {
  public static void main(String[] args) {
      // Create an Employee object
      Employee emp = new Employee("Sanillu Bhai", 50000);

      // Access and modify data using public methods
      System.out.println("Employee Name: " + emp.getName());
      System.out.println("Employee Salary: Rs." + emp.getSalary());

      System.out.println("---------------");

      emp.setName("Sanillu Sai");
      emp.setSalary(60000);

      // Print updated data
      System.out.println("Updated Employee Name: " + emp.getName());
      System.out.println("Updated Employee Salary: Rs." + emp.getSalary());
  }
}

// Employee class with private data and public methods
class Employee {
  // Private data members (attributes)
  private String name;
  private double salary;


  // Constructor to initialize data
  public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
  }

  // Getter method to retrieve employee name
  public String getName() {
      return name;
  }

  // Setter method to update employee name
  public void setName(String name) {
      this.name = name;
  }

  // Getter method to retrieve employee salary
  public double getSalary() {
      return salary;
  }

  // Setter method to update employee salary
  public void setSalary(double salary) {
      if (salary >= 0) { // Ensure salary is non-negative
          this.salary = salary;
      } else {
          System.out.println("Invalid salary! Salary cannot be negative.");
      }
  }
}
