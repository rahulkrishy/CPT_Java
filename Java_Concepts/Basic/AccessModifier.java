// Access modifiers
/* 
Access modifiers in Java control the visibility and accessibility of classes, methods, and variables within a program. 
They enforce encapsulation and help in implementing data hiding, abstraction, and access control mechanisms. 
There are four main types of access modifiers in Java:

Private: 
  -The private access modifier restricts access to the class, method, or variable to within the same class only. 
  -It is the most restrictive access modifier and ensures the highest level of encapsulation.

Default (Package-private): 
  -If no access modifier is specified, it is considered to have default access. 
  -The default access modifier allows access only within the same package. 
  -Classes, methods, and variables with default access can only be accessed within the same package and are not accessible outside the package.

Protected: 
  -The protected access modifier allows access to the class, method, or variable within the same package or subclasses (even if they belong to different packages). 
  -It is more restrictive than public but less restrictive than default and private.

Public: 
  -The public access modifier allows unrestricted access to the class, method, or variable from any other class or package. 
  -Classes with public access can be accessed from anywhere in the program.It has the widest scope of accessibility.
  -Methods and variables with public access can be accessed from any class.

*/

// AccessModifier.java

// Class with default access modifier
class AccessClass {
  // Private variable accessible only within the class
  @SuppressWarnings("unused")
  private int privateVar = 10;
  
  // Default variable accessible within the package
  int defaultVar = 20;
  
  // Protected variable accessible within the package and by subclasses
  protected int protectedVar = 30;
  
  // Public variable accessible from anywhere
  public int publicVar = 40;
  
  // Private method accessible only within the class
  @SuppressWarnings("unused")
  private void privateMethod() {
      System.out.println("Private method called");
  }
  
  // Default method accessible within the package
  void defaultMethod() {
      System.out.println("Default method called");
  }
  
  // Protected method accessible within the package and by subclasses
  protected void protectedMethod() {
      System.out.println("Protected method called");
  }
  
  // Public method accessible from anywhere
  public void publicMethod() {
      System.out.println("Public method called");
  }
}

// Main class to demonstrate access modifiers
public class AccessModifier {
  public static void main(String[] args) {
      AccessClass obj = new AccessClass();
      
      // Accessing variables
      //obj.privateVar; // Error: privateVar has private access in AccessClass
      System.out.println("Default variable: " + obj.defaultVar); // Output: Default variable: 20
      System.out.println("Protected variable: " + obj.protectedVar); // Output: Protected variable: 30
      System.out.println("Public variable: " + obj.publicVar); // Output: Public variable: 40
      
      // Accessing methods
      //obj.privateMethod(); // Error: privateMethod() has private access in AccessClass
      obj.defaultMethod(); // Output: Default method called
      obj.protectedMethod(); // Output: Protected method called
      obj.publicMethod(); // Output: Public method called
  }
}






