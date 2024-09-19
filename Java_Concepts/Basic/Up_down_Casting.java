// Upcasting/downcasting
/* 
Upcasting and downcasting are concepts related to inheritance in object-oriented programming, particularly in Java.

Upcasting:
  - Upcasting refers to the process of casting a subclass reference to a superclass reference.
  - It is always safe and does not require an explicit cast operator.
  - Upcasting allows you to treat an object of a subclass as an object of its superclass.
  - Upcasting is implicitly performed by the compiler.

Downcasting:
  - Downcasting refers to the process of casting a superclass reference to a subclass reference.
  - It is not safe and requires an explicit cast operator.
  - Downcasting is used when you want to access members specific to the subclass.
  - It may result in a ClassCastException at runtime if the object being casted is not actually an instance of the subclass.
*/


// Class for upcasting
class cast_Animal {
  void makeSound() {
      System.out.println("cast_Animal makes a sound");
  }
}

// Subclass of cast_Animal
class cast_Dog extends cast_Animal {
  void bark() {
      System.out.println("cast_Dog barks");
  }
}

public class Up_down_Casting {
  public static void main(String[] args) {
      // Upcasting: Subclass object to superclass reference
      cast_Dog dog = new cast_Dog(); // Creating a cast_Dog object
      cast_Animal animal = dog; // Upcasting cast_Dog to cast_Animal

      // Accessing method using cast_Animal reference
      animal.makeSound(); // Output: cast_Animal makes a sound

      // Downcasting: Superclass reference to subclass reference
      // Must be done explicitly and may throw ClassCastException if not valid
      cast_Animal animal2 = new cast_Dog(); // Upcasting cast_Dog to cast_Animal
      cast_Dog dog2 = (cast_Dog) animal2; // Downcasting cast_Animal to cast_Dog (explicit cast)
      
      // Accessing method specific to cast_Dog class
      dog2.bark(); // Output: cast_Dog barks
  }
}

