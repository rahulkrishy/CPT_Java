// Oops_Polymorphism
/*
Polymorphism - Poly(Many) , morphism(Behavior)
Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. 
Polymorphism allows objects of different subclasses to be treated as objects of the superclass, promoting code reusability and flexibility.
It facilitates dynamic method invocation, enabling a single interface to represent multiple underlying implementations.
Polymorphism is achieved through method overloading and method overriding, providing different forms of the same method signature.
Polymorphism allows objects to exhibit different behaviors based on their types or classes, enabling flexible and modular design in object-oriented programming. 

There are two main types of polymorphism in Java: compile-time polymorphism/Early Binding (method overloading) and runtime polymorphism/Late Binding (method overriding).

1) Compile-time Polymorphism (Method Overloading):
  -Method overloading allows multiple methods with the same name but different parameter lists in the same class.
  -The compiler determines which overloaded method to call based on the number and types of arguments provided at compile time.
  -Overloaded methods may have different return types, but the parameter lists must differ in the number, order, or types of parameters.

2) Runtime Polymorphism (Method Overriding):
  -Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
  -It enables dynamic dispatch, where the method to be invoked is determined at runtime based on the actual object type rather than the reference type.
  -The overridden method in the subclass must have the same signature (name, parameter list, and return type) as the method in the superclass.

Dynamic method dispatch:
  -Dynamic method dispatch is a key feature of runtime polymorphism in Java. 
  -It refers to the process of determining which implementation of an overridden method to call at runtime based on the actual type of the object rather than the reference type. 
  -This allows for flexible and dynamic method invocation, where the method called is determined dynamically during program execution.
  
  how dynamic method dispatch works:
  -Inheritance Hierarchy:  Dynamic method dispatch involves a superclass and one or more subclasses. 
  -                        The superclass contains a method that is overridden by one or more of its subclasses.
  -Method Override:  Subclasses override a method from the superclass with their specific implementation. 
  -                  The overridden method in the subclass has the same signature (name, parameter list, and return type) as the method in the superclass.
  -Object Creation:  Objects of the subclass are created using references of the superclass. 
  -                  This allows for polymorphic behavior, where objects of different subclasses can be treated as objects of the superclass.
  -Method Invocation: When a method is called on the superclass reference, the JVM determines the actual type of the object at runtime.
  -Dynamic Dispatch: The JVM then invokes the overridden method of the actual object type, rather than the reference type. This is known as dynamic method dispatch.

*/

// Oops_Polymorphism.java

// Class to demonstrate compile-time polymorphism (method overloading)
class CompileTimePolymorphism {
  // Method to add two integers
  int add(int a, int b) {
      return a + b;
  }

  // Method to add three integers
  int add(int a, int b, int c) {
      return a + b + c;
  }
}

// Class to demonstrate runtime polymorphism (dynamic method dispatch)
class RuntimePolymorphism {
  // Base class method
  void display() {
      System.out.println("Inside Base class");
  }
}

// Derived class overriding the base class method
class Derived extends RuntimePolymorphism {
  // Overridden method
  @Override
  void display() {
      System.out.println("Inside Derived class");
  }
}

// Oops_Polymorphism class to call methods from CompileTimePolymorphism and RuntimePolymorphism classes
public class Oops_Polymorphism {
  public static void main(String[] args) {
      // Compile-time polymorphism (method overloading)
      CompileTimePolymorphism ctp = new CompileTimePolymorphism();
      System.out.println("Result of adding two numbers: " + ctp.add(5, 7));
      System.out.println("Result of adding three numbers: " + ctp.add(3, 6, 9));

      // Runtime polymorphism (dynamic method dispatch)
      RuntimePolymorphism rp = new Derived(); // Upcasting - Creating a reference of SuperClass to object of SubClass
      rp.display(); // Calls the overridden method in Derived class
  }
}

/*
CompileTimePolymorphism class:
  Contains two overloaded methods add to add two or three integers.
RuntimePolymorphism class:
  Defines a base class method display that prints "Inside Base class".
Derived class:
  Overrides the display method from the base class to print "Inside Derived class".
Oops_Polymorphism class (main):
  Creates an object of CompileTimePolymorphism and demonstrates method overloading by calling the add methods.
  Creates a reference of RuntimePolymorphism to an object of Derived class, demonstrating runtime polymorphism by calling the overridden display method.
*/