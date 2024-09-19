// Single Inheritance
/*
-In single inheritance, a subclass inherits from only one superclass.
-It forms a single chain of inheritance.
-It is the most common type of inheritance.
*/


// Superclass
class SI_Animal {
  void eat() {
      System.out.println("SI_Animal is eating");
  }
}

// Subclass inheriting from SI_Animal
class SI_Dog extends SI_Animal {
  void bark() {
      System.out.println("SI_Dog is barking");
  }
}

// Main class
public class Oops_Inheritance_Single {
  public static void main(String[] args) {
      SI_Dog dog = new SI_Dog();
      dog.eat();  // Output: SI_Animal is eating
      dog.bark(); // Output: SI_Dog is barking
  }
}
