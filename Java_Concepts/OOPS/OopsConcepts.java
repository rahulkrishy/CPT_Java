// Object-oriented programming (OOP)
/*
Object-oriented programming (OOP) is a programming paradigm that revolves around the concept of objects, which are instances of classes. 
In Java, OOP is fundamental, and it encompasses several key concepts
1. Classes and Objects:
   - Class: A blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of the class will have.
   - Object: An instance of a class. It encapsulates data and behaviors defined by its class.

2. Encapsulation:
   - Encapsulation is the bundling of data (attributes) and methods (behaviors) that operate on the data into a single unit (class).
   - It hides the internal state of objects and only allows access through well-defined interfaces (public methods), thereby protecting the integrity of the data.

3. Inheritance:
   - Inheritance is a mechanism where a class (subclass) can inherit properties and behaviors from another class (superclass).
   - It promotes code reusability and establishes an "is-a" relationship between classes.

4. Polymorphism:
   - Polymorphism allows objects to be treated as instances of their superclass.
   - It enables methods to be implemented in various ways in different subclasses.
   - Types of polymorphism:
     - Compile-time (Static) Polymorphism: Method overloading
     - Runtime (Dynamic) Polymorphism: Method overriding

5. Abstraction:
   - Abstraction is the process of hiding the complex implementation details and showing only the essential features of an object.
   - It focuses on what an object does rather than how it achieves it.
   - Abstract classes and interfaces are used to achieve abstraction in Java.

6. Association, Aggregation, and Composition:
   - Association: Represents a relationship between two or more classes.
   - Aggregation: Represents a "has-a" relationship where one class contains references to another class.
   - Composition: Represents a strong form of aggregation where the lifecycle of the contained object is managed by the container.

7. Access Modifiers:
   - Access modifiers control the visibility and accessibility of classes, methods, and variables.
   - Types of access modifiers in Java:
     - Public: Accessible from anywhere.
     - Protected: Accessible within the same package or subclass.
     - Default (Package-private): Accessible only within the same package.
     - Private: Accessible only within the same class.

8. Constructor and Destructor:
   - Constructor: A special method used to initialize objects of a class. It has the same name as the class and is called when an object is created.
   - Destructor: Java does not have explicit destructors like some other languages. Garbage collection automatically deallocates memory when an object is no longer referenced.

9. Method Overriding and Overloading:
   - Method Overriding: Allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
   - Method Overloading: Allows multiple methods with the same name but different parameters in the same class.

10. Final Keyword:
    - The final keyword can be applied to classes, methods, and variables.
    - A final class cannot be subclassed, a final method cannot be overridden, and a final variable cannot be reassigned.

*/



// Encapsulation: Using private access modifiers to encapsulate data
class Oops_Person {
  private String name;
  private int age;

  // Constructor: Initializing object state during instantiation
  public Oops_Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Getter methods: Allowing controlled access to private data
  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }

  // Inheritance: Creating a subclass that extends the Oops_Person class
  static class Oops_Student extends Oops_Person {
      // Constructor of subclass
      public Oops_Student(String name, int age) {
          super(name, age); // Calling superclass constructor
      }

      // Method Overriding: Providing a specific implementation of a method from superclass
      @Override
      public String getName() {
          return "Student Name: " + super.getName(); // Calling superclass method
      }
  }

  // Main class containing the main method
  public static class OopsConcepts {
      // Polymorphism: Using superclass reference to refer to subclass object
      public static void main(String[] args) {
          Oops_Person person = new Oops_Person("Alice", 30);
          System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

          Oops_Student student = new Oops_Student("Bob", 20);
          System.out.println(student.getName()); // Output: "Student Name: Bob"
      }
  }
}

