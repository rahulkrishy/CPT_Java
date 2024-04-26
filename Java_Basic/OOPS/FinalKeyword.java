// final keyword
/*
The final keyword in Java is used to restrict the user from modifying the variable, method, or class it is applied to. 

Final Variables:
  -When applied to a variable, it means that the variable's value cannot be changed once it has been assigned.
  -Final variables must be initialized either at the time of declaration or in the constructor.
  -Once initialized, any attempt to reassign a value to a final variable will result in a compilation error.

Final Methods:
  -When applied to a method, it means that the method cannot be overridden by subclasses.
  -Final methods are useful when you want to prevent subclasses from changing the behavior of a method.

Final Classes:
  -When applied to a class, it means that the class cannot be subclassed.
  -Final classes are often used to create immutable classes or utility classes that should not be extended.
*/


// Class with final variable, method, and class
public class FinalKeyword {
    
  // Final variable
  final int FINAL_NUMBER = 10;
  
  // Final method
  final void display() {
      System.out.println("Inside final method");
  }
  
  // Final class
  final class FinalClass {
      // Class implementation
  }
  
  // Main method to demonstrate usage
  public static void main(String[] args) {
      // Create an instance of FinalKeyword class
      FinalKeyword obj = new FinalKeyword();
      
      // Access final variable
      System.out.println("Final number: " + obj.FINAL_NUMBER);
      
      // Call final method
      obj.display();
      
      // Attempt to extend final class
      // Compilation error: Cannot subclass final class
      // class SubClass extends FinalClass {}
  }
}

/*
The FINAL_NUMBER variable is declared as final, indicating that its value cannot be changed after initialization.
The display method is declared as final, preventing subclasses from overriding it.
The FinalClass is declared as final, meaning it cannot be subclassed.
*/
