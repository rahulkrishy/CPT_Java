// Oops_Inheritance
/*
Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class (subclass or derived class) 
to inherit properties and behavior (methods and fields) from an existing class (superclass or base class). 
In Inheritance , whenever we create a obj for any class, it will call its Constructor of subclass and suprclass.
This enables code reuse, promotes modularity, and facilitates the creation of hierarchical relationships between classes.

Key aspects of inheritance include:
1) Base Class (Superclass):
  -The base class is the existing class from which properties and behavior are inherited.
  -It serves as the template or blueprint for creating new classes.
  -It encapsulates common attributes and methods shared by its subclasses.
2) Derived Class (Subclass):
  -The derived class is the new class that inherits properties and behavior from the base class.
  -It extends or specializes the functionality of the base class by adding new features or overriding existing methods.
  -It can also define additional fields and methods specific to its requirements.
  Syntax:
  -In Java, inheritance is declared using the extends keyword.
  -Syntax: class SubclassName extends SuperclassName { ... }
  -The subclass inherits all non-private fields and methods from the superclass.
3) Access Modifiers:
  -Inherited members retain their original access modifiers (e.g., public, protected, or default).
  -Subclasses can access inherited members based on their visibility:
  -Public members are accessible to all classes.
  -Protected members are accessible within the same package and by subclasses.
  -Default (package-private) members are accessible within the same package only.

4) Types of Inheritance:
  ->1.Single Inheritance: 
      A subclass inherits from only one superclass.
  ->2.Multilevel Inheritance: 
      A subclass inherits from another subclass, creating a chain of inheritance.
  ->3.Hierarchical Inheritance: 
      Multiple subclasses inherit from the same superclass.
  ->4.Multiple Inheritance (Not supported in Java): 
      Multiple inheritance refers to a subclass inheriting from multiple superclasses.
      It can lead to the diamond problem and is not supported in Java, Will rise Ambiguity Problem.
      A subclass inherits from multiple superclasses. Java supports multiple inheritance through interfaces, where a class can implement multiple interfaces.
  ->5.Hybrid Inheritance (Combination of above types):
      Hybrid inheritance is a combination of two or more types of inheritance.
      It can include any combination of single, multilevel, hierarchical, or multiple inheritance (through interfaces).

5) Method Overriding:
  -Subclasses can override (redefine) methods inherited from the superclass to provide specialized implementations.
  -The method signature (name, parameters, and return type) must match the overridden method in the superclass.
  -Annotations such as @Override can be used to indicate that a method is intended to override a superclass method.
6) Super Keyword:
  -The super keyword is used to access members of the superclass from within the subclass.
  -It is used to invoke superclass constructors, methods, or access superclass fields that are hidden by the subclass.

Inheritance promotes code reuse, enhances maintainability, and enables polymorphic behavior, where objects of different subclasses can be treated interchangeably based on their common superclass type. 
However, it's essential to design inheritance hierarchies carefully to ensure proper encapsulation, cohesion, and adherence to the "is-a" relationship between classes.
*/


// Base class (Superclass)
class i_Animal {
  // Method in the superclass
  public void sound() {
      System.out.println("Animal makes a sound");
  }
}

// Derived class (Subclass)
class i_Dog extends i_Animal {
  // Method overridden in the subclass
  @Override
  public void sound() {
      System.out.println("Dog barks");
  }

  // Additional method specific to i_Dog class
  public void wagTail() {
      System.out.println("Dog wags tail");
  }
}

public class Oops_Inheritance {
  public static void main(String[] args) {
      // Create an object of subclass (i_Dog)
      i_Dog dog = new i_Dog();

      // Call methods from the superclass and subclass
      dog.sound();    // Output: Dog barks (overridden method)
      dog.wagTail();  // Output: Dog wags tail (method specific to i_Dog class)

      // Create an object of the superclass (Animal)
      i_Animal animal = new i_Animal();

      // Call method from the superclass
      animal.sound(); // Output: Animal makes a sound
  }
}
