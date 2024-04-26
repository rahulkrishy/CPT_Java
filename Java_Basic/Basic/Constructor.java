// Constructor
/*
1)Constructor in Java:
   A constructor in Java is a special type of method that is automatically invoked when an object of a class is created. 
   It is used to initialize the state of an object by assigning initial values to its instance variables or performing any necessary setup tasks.
   constructors are automatically invoked each time when an object of a class is created.

2)Key Points:
   - Purpose:
     - Initialization: Constructors initialize the newly created object with initial values.
     - Setup Tasks: They can perform any setup tasks required before the object is ready to use.
   - Characteristics:
     - Same name as class: Constructors have the same name as the class they belong to.
     - No return type: Constructors do not have a return type, not even void.
     - Invoked implicitly: They are invoked implicitly by the new keyword when an object is created.
     - Cannot be called directly: Constructors cannot be called directly using methods like other member functions.

   // Example of a constructor
   public class MyClass {
       public MyClass() {
           // Constructor body
       }
   }

3)Types of Constructors:
   a. Default Constructor:
      - A constructor with no parameters is called a default constructor.
      - It is automatically provided by the compiler if no other constructors are defined.
      - Initializes instance variables to their default values (0 for numeric types, null for reference types, etc.).

      // Example of a default constructor
      public class MyClass {
          public MyClass() {
              // Default constructor body
          }
      }

   b. Parameterized Constructor:
      - A constructor with parameters is called a parameterized constructor.
      - Allows initialization of instance variables with specified values passed as arguments during object creation.

      // Example of a parameterized constructor
      public class MyClass {
          public MyClass(int value) {
              // Parameterized constructor body
          }
      }

   c. Copy Constructor:
      - A constructor that creates an object by copying the state of another object of the same class.
      - Typically used to create a new object with the same state as an existing object.

      // Example of a copy constructor
      public class MyClass {
          public MyClass(MyClass obj) {
              // Copy constructor body
          }
      }

4)Constructor Overloading:
   - Like other methods, constructors can be overloaded by defining multiple constructors with different parameter lists.
   - Allows creating objects with different initialization options based on the parameters passed.

   // Example of constructor overloading
   public class MyClass {
       public MyClass() {
           // Default constructor body
       }

       public MyClass(int value) {
           // Parameterized constructor body
       }
   }

5)Constructor Access Modifiers:
   - Constructors can have access modifiers like public, protected, private, or default (no modifier).
   - The choice of access modifier determines the visibility of the constructor.

   // Example of constructors with access modifiers
   public class MyClass {
       public MyClass() {
           // Public constructor body
       }

       private MyClass(int value) {
           // Private constructor body
       }
   }

6)Initialization Block:
    -In addition to constructors, initialization blocks are also used to initialize instance variables.
    -Static initialization blocks are executed when the class is loaded, while instance initialization blocks are executed when an object is created.

 */


public class Constructor {
  private int value;

  // Default constructor
  public Constructor() {
      value = 0;
  }

  // Parameterized constructor
  public Constructor(int value) {
      this.value = value;
  }

  // Copy constructor
  public Constructor(Constructor obj) {
      this.value = obj.value;
  }

  // Constructor overloading
  public Constructor(double value) {
      this.value = (int) value;
  }

  // Initialization block
  {
      // Initialization block
      // Executed each time when an object is created
      System.out.println("Object initialized");
  }

  public static void main(String[] args) {
      // Creating objects using different constructors
      Constructor obj1 = new Constructor();            // Default constructor
      Constructor obj2 = new Constructor(10);    // Parameterized constructor
      Constructor obj3 = new Constructor(obj2);        // Copy constructor
      Constructor obj4 = new Constructor(3.14);  // Constructor overloading

      // Printing values
      System.out.println(obj1.value);   // Output: 0
      System.out.println(obj2.value);   // Output: 10
      System.out.println(obj3.value);   // Output: 10 (Copied value)
      System.out.println(obj4.value);   // Output: 3 (Type casted from double to int)
  }
}



