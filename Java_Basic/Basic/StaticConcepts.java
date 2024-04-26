// static keyword
/*
static keyword is used to define members (variables, methods, and blocks) that belong to the class itself, rather than to individual instances of the class. 

1)Static Variable:
    -A static variable, also known as a class variable, is shared among all instances of a class.
    -There is only one copy of a static variable, regardless of how many instances of the class are created.
    -Static variables are initialized only once, at the start of the execution, and retain their values throughout the program's lifetime.
    -They are accessed using the class name followed by the dot (.) operator.
2)Static Method:
    -A static method belongs to the class rather than to any specific instance of the class.
    -Static methods can be invoked directly using the class name, without the need to create an instance of the class.
    -They cannot access non-static (instance) variables and methods directly, but can access other static members.
    -Static methods are commonly used for utility functions or operations that do not require access to instance-specific data.
3)Static Block:
    -A static block is a special type of block that executes only once when the class is loaded into memory.
    -It is used to initialize static variables or perform any one-time initialization tasks for the class.
    -Static blocks are executed in the order they appear in the class, from top to bottom
    -A static block is executed when the class is loaded into the JVM, regardless of whether any objects of that class are created or not. 
    -This behavior ensures that static initialization tasks are performed before any instances of the class are created or any static members are accessed.
Common Use Cases:
    -Static variables are often used for constants, counters, or shared resources across instances.
    -Static methods are used for utility functions, factory methods, or helper functions that do not require access to instance-specific data.
    -Static blocks are used for one-time initialization tasks, such as loading configuration files or initializing static variables.
*/

public class StaticConcepts {

  // Static variable
  static int staticVar = 10; // Shared among all instances
  
  // Normal variable
  int normalVar = 20; // Instance-specific

  // Static block
  static {
      System.out.println("Static block executed.");
  }

  // Normal block
  {
      System.out.println("Normal block executed.");
  }

  // Static method
  static void staticMethod() {
      System.out.println("Static method called.");
  }

  // Normal method
  void normalMethod() {
      System.out.println("Normal method called.");
  }

  // Main method
  public static void main(String[] args) {
      // Creating an instance of the class
      StaticConcepts obj = new StaticConcepts();

      // Accessing static variable and method directly using class name
      System.out.println("Static variable: " + StaticConcepts.staticVar);
      staticMethod();
      
      // Accessing normal variable and method using object
      System.out.println("Normal variable: " + obj.normalVar);
      obj.normalMethod();
  }
}

/*
Static Keyword in main():
-Entry Point: The main method is where the Java program starts running. It's the first method executed by the JVM.
-No Object Creation: Since the main method is called by the JVM before any objects are created, it must be static. Non-static methods require an object to be called, but the main method is invoked without creating any objects.
-Access Without Instantiation: Declaring the main method as static allows it to be called directly using the class name. This makes the syntax simpler and emphasizes that the main method is a class-level entry point.
 */
