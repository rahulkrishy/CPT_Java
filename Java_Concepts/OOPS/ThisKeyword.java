// 'this' Keyword
/*
Using this Keyword:
  -The this keyword is used to refer to the current object instance within a class.
  -It is commonly used to differentiate between instance variables and parameters or local variables with the same name.
  -This approach is typically preferred when accessing or modifying instance variables within the same class.

Directly Passing Object Reference:
  -Passing the object reference directly to a method allows access to the object's attributes and methods.
  -This approach is useful when you need to access attributes or methods of other objects within the same class or when you want to pass an object to another class.
  -It can simplify code and improve readability, especially when dealing with complex interactions between objects. 
 */

public class ThisKeyword {
  public static void main(String[] a) {
      Human obj = new Human(); // Creating an object of Human class

      int age = 37; // Age value
      String name = "Bokkayya"; // Name value

      // Setting age using setter method with "this" keyword
      obj.setAge(age);

      // Setting name using setter method without "this" keyword (directly passing object)
      obj.setName(name, obj);

      // Getting and displaying age and name
      obj.getAge(); // Output: Age : 37
      obj.getName(); // Output: Name: Bokkayya
  }
}

// Human class
class Human {
  private int humanAge; // Private instance variable for age
  private String humanName; // Private instance variable for name

  // Setter method for age
  public void setAge(int humanAge) {
      this.humanAge = humanAge; // Using "this" keyword to refer to the instance variable
  }

  // Setter method for name (directly passing object without "this" keyword)
  public void setName(String humanName, Human obj) {
      Human obj1 = obj; // Creating a local reference to the passed object
      obj1.humanName = humanName; // Directly accessing and setting the name
  }

  // Getter method for age
  public void getAge() {
      System.out.println("Age : " + humanAge); // Displaying age
  }

  // Getter method for name
  public void getName() {
      System.out.println("Name: " + humanName); // Displaying name
  }
}

/*
In the above code:
-The ThisKeyword class contains the main method where we create an object of the Human class and demonstrate setting and getting the age and name.
-The Human class encapsulates the age and name as private instance variables.
-The setAge method of the Human class sets the age using the this keyword.
-The setName method of the Human class sets the name directly by passing the object reference without using the this keyword.
-The getAge and getName methods of the Human class display the age and name, respectively.
*/
