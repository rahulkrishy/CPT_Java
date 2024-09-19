// Overloading vs Overriding
/*
Overloading:
- Overloading occurs when multiple methods in the same class have the same name but different parameters.
- It allows methods to perform similar tasks with different inputs.
- Methods with different signatures can coexist in the same class, distinguished by the number or types of parameters.
- Overloading is resolved at compile time based on the method signature.
- Example: Having multiple constructors in a class with different parameter lists.

Overriding:
- Overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
- It allows subclasses to provide their own behavior for inherited methods.
- The subclass method must have the same name, parameters, and return type as the superclass method.
- Overriding is resolved at runtime based on the actual object type.
- Example: Providing a different implementation for the `toString` method in a subclass.

Differences:
- Overloading is resolved at compile time based on method signature, while overriding is resolved at runtime based on object type.
- Overloading involves multiple methods with the same name but different parameters, while overriding involves a method in a subclass with the same signature as a method in its superclass.
- Overloading is used to provide multiple methods for performing similar tasks with different inputs, while overriding is used to provide a specific implementation for inherited methods.

*/


// Base class
class OO_Animal {
  // Method overloading in the superclass
  void makeSound() {
      System.out.println("Animal makes a sound");
  }

  // Method overloading with a parameter
  void makeSound(String sound) {
      System.out.println("Animal makes " + sound);
  }
}

// Subclass inheriting from Animal
class OO_Dog extends OO_Animal {
  // Method overriding in the subclass
  @Override
  void makeSound() {
      System.out.println("Dog barks");
  }

  // Method overloading in the subclass
  void makeSound(int count) {
      for (int i = 0; i < count; i++) {
          System.out.println("Dog barks");
      }
  }
}

// Main class
public class Overloading_vs_OverRiding {
  public static void main(String[] args) {
      OO_Animal animal = new OO_Animal();
      animal.makeSound();               // Output: Animal makes a sound
      animal.makeSound("woof");        // Output: Animal makes woof

      System.out.println("-----------");

      OO_Dog dog = new OO_Dog();
      dog.makeSound();                  // Output: Dog barks (overridden method)
      dog.makeSound(3);                 // Output: Dog barks (overloaded method, 3 times)
  }
}
