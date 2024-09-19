//Type of interface
/*
1) Normal Interface:
  -Normal interfaces in Java are the most common type of interfaces.
  -They can contain any number of abstract methods, default methods, static methods, and constant variables.
  -Normal interfaces are used to define a set of methods that classes must implement.
  -Implementing classes provide concrete implementations for all abstract methods defined in the interface.
  -Normal interfaces can also include default methods and static methods, providing flexibility in interface design.

2) Functional Interface:
  -A functional interface is an interface that contains exactly one abstract method.
  -Java 8 introduced functional interfaces to support lambda expressions and method references, which provide a concise way to represent anonymous functions.
  -Functional interfaces can also contain default methods and static methods, as long as they have only one abstract method.
  -The '@FunctionalInterface' annotation is used to indicate that an interface is intended to be a functional interface.
  -Examples of functional interfaces include Runnable, Comparator, and Callable.

  Lambda expressions:

  Lambda expressions are a feature introduced in Java 8 that allow you to treat functionality as a method argument, or to create an anonymous function, which can be passed around your code.
  Syntax:
    -Lambda expressions consist of parameters, an arrow (->), and a body.
    -The body can be a single expression or a block of code.
  Functional Interfaces:
    -Lambda expressions are used primarily in the context of functional interfaces, which are interfaces that contain exactly one abstract method.
    -The lambda expression provides an implementation for this single abstract method.
  Example: 
  //
  Runnable runnable = () -> {
      System.out.println("This is a lambda expression");
  };
  //
  Limitations:
    -Lambda expressions can only be used with functional interfaces, i.e., interfaces with exactly one abstract method.
    -They cannot access non-final local variables from the enclosing scope unless those variables are effectively final.

3) Marker Interface:
  -Marker interfaces are interfaces with no methods or constants.
  -They are used to mark or tag classes to provide some specific behavior or capability.
  -Marker interfaces serve as a way for the Java runtime environment or other frameworks to identify classes that implement them and provide specialized behavior accordingly.
  -Classes implementing marker interfaces inherit some behavior or functionality defined by the interface.
  -Examples of marker interfaces include Serializable, Cloneable, and Remote.

In summary, normal interfaces are the standard interfaces that define a set of methods for classes to implement, functional interfaces contain exactly one abstract method and support lambda expressions, and marker interfaces are used to tag classes to provide specialized behavior. 
 */

// Normal interface
interface NormalInterfaceDemo {
  // Abstract method
  void method1();

  // Default method
  default void defaultMethod() {
      System.out.println("Default method in NormalInterface");
  }

  // Static method
  static void staticMethod() {
      System.out.println("Static method in NormalInterface");
  }
}

// Functional interface
@FunctionalInterface
interface FunctionalInterfaceDemo {
  // Abstract method (only one)
  void method();
}

// Marker interface
interface MarkerInterface {
  // No methods or constants
}

// Implementation of NormalInterface
class NormalImplementation implements NormalInterfaceDemo {
  @Override
  public void method1() {
      System.out.println("Implementation of method1 in NormalInterface");
  }
}

public class InterfaceTypes {
  public static void main(String[] args) {
      // Normal interface usage
      NormalImplementation normalImplementation = new NormalImplementation();
      normalImplementation.method1(); // Output: Implementation of method1 in NormalInterface
      normalImplementation.defaultMethod(); // Output: Default method in NormalInterface
      NormalInterfaceDemo.staticMethod(); // Output: Static method in NormalInterface

      // Functional interface usage (implemented with lambda expression)
      FunctionalInterfaceDemo functionalInterface = () -> {
          System.out.println("Implementation of method in FunctionalInterface");
      };
      functionalInterface.method(); // Output: Implementation of method in FunctionalInterface

      // Marker interface usage
      if (MarkerInterface.class.isAssignableFrom(NormalImplementation.class)) {
          System.out.println("NormalImplementation implements MarkerInterface");
      } else {
          System.out.println("NormalImplementation does not implement MarkerInterface");
      }
  }
}

