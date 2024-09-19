// Anonymous Object
/*
In Java, an anonymous object is an object that is created without assigning it to any variable. 
Instead, it is instantiated and used directly at the point of creation. 
Anonymous objects are typically used for one-time use or for performing a single operation without the need to store the reference for later use.

Anonymous objects are useful when:
-You need to perform a single operation or method call without storing the object's reference.
-There's no need to reuse the object or access its state later in the program.
-You want to keep the code concise and avoid cluttering it with unnecessary variable declarations.
*/

public class AnonymousObject {
  public void displayMessage() {
      System.out.println("Hello, this is an anonymous object!");
  }

  public static void main(String[] args) {
      /*
      // Normal Object creation using references
      AnonymousObject obj = new AnonymousObject();
      obj.displayMessage();
      */

      // Creating and using an anonymous object
      new AnonymousObject().displayMessage(); // Creating an anonymous object of AnonymousObject and calling displayMessage method directly
      
  }
}

