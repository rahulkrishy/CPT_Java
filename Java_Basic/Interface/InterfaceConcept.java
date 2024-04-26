// Interface
/*
In Java, An interface in Java is a blueprint of a class. 
It can have only static constants and abstract methods.

Definition:
  -An interface in Java is declared using the interface keyword.
  -It defines a set of methods that a class must implement.
  -It is a blueprint of a class, but unlike classes, interfaces cannot be instantiated.
  -An interface can also include constants, default methods, static methods, and nested types.

Purpose:
  -Encapsulation: Interfaces allow you to define a contract for behavior without exposing the implementation details.
  -Abstraction: They help in achieving abstraction by separating the definition of a method from its implementation.
  -Polymorphism: Interfaces facilitate polymorphism, allowing objects of different classes to be treated interchangeably if they implement the same interface.

Implementation:
  -A class implements an interface using the 'implements' keyword.
  -A class can implement multiple interfaces, separated by commas.
  -When a class implements an interface, it must provide concrete implementations for all the methods declared in the interface.

Abstract Methods:
  -An abstract method in an interface does not have a method body. It only provides a method signature (name, parameters, return type).
  -All methods declared in an interface are implicitly public and abstract (except for static and default methods introduced in Java 8).

Default Methods:
  -Default methods were introduced in Java 8 to provide a way to add new methods to interfaces without breaking existing implementations.
  -A default method in an interface has a method body and is declared using the default keyword.
  -Default methods are used to provide a default implementation that can be overridden by implementing classes.

Static Methods:
  -Static methods in interfaces were introduced in Java 8 to provide utility methods that are not tied to specific instances of implementing classes.
  -They are declared using the static keyword and can be invoked using the interface name.

Constant Variables:
  -Interfaces can contain constant variables, which are implicitly public, static, and final.
  -Constant variables must be initialized with a value, and their values cannot be changed once assigned.

Multiple Inheritance:
  -Java does not support multiple inheritance of classes, but it allows multiple inheritance of interfaces.
  -A class can implement multiple interfaces, inheriting the abstract methods and default implementations from all of them.

Polymorphism:
  -Interfaces enable polymorphism in Java, allowing objects of different classes to be treated uniformly based on the interface they implement.
  -This promotes "loose coupling(Independency)" and flexibility in software design.
---
Class-Class: extends
Class-Interface: implements
Interface-Interface: extends
*/

// Interface with abstract method
interface Ic_Animal {
  void sound(); // Abstract method
}

// Interface with default method
interface Ic_Walkable {
  default void walk() {
      System.out.println("Walking");
  }
}

// Interface with static method
interface Ic_Jumpable {
  static void jump() {
      System.out.println("Jumping");
  }
}

// Interface with constant variable
interface Ic_Constants {
  String MESSAGE = "Hello, Interfaces!"; // Constant variable
}

// Class implementing interfaces
class Dog implements Ic_Animal, Ic_Walkable {
  @Override
  public void sound() {
      System.out.println("Dog barks");
  }
}

public class InterfaceConcept {
  public static void main(String[] args) {
      // Implementing interface with abstract method
      Ic_Animal dog = new Dog();
      dog.sound(); // Output: Dog barks

      // Implementing interface with default method
      Ic_Walkable walker = new Dog();
      walker.walk(); // Output: Walking

      // Implementing interface with static method directly
      Ic_Jumpable.jump(); // Output: Jumping

      // Accessing constant variable from interface directly
      System.out.println(Ic_Constants.MESSAGE); // Output: Hello, Interfaces!
  }
}

/*
We define four interfaces: Ic_Animal, Ic_Walkable, Ic_Jumpable, and Ic_Constants, each illustrating a different aspect of interfaces 
(abstract method, default method, static method, and constant variable).
We implement the Animal interface in the Dog class, providing an implementation for the sound() method.
In the main class InterfaceConcept, we demonstrate:
Implementing the Animal interface with the Dog class and calling the sound() method.
Implementing the Walkable interface with the Dog class and calling the walk() default method.
Calling the jump() static method from the Jumpable interface 'directly'.
Accessing the constant variable MESSAGE from the Constants interface.
*/
