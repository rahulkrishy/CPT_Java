// Multilevel Inheritance
/*
-In multilevel inheritance, a subclass inherits from another subclass, creating a chain of inheritance.
-It forms a hierarchy of classes where each subclass inherits from its immediate superclass.
*/


// Superclass
class MLI_Animal {
  void eat() {
      System.out.println("MLI_Animal is eating");
  }
}

// Subclass inheriting from MLI_Animal
class MLI_Dog extends MLI_Animal {
  void bark() {
      System.out.println("MLI_Dog is barking");
  }
}

// Subclass inheriting from MLI_Dog
class MLI_Labrador extends MLI_Dog {
  void color() {
      System.out.println("Labrador is golden");
  }
}

// Main class
public class Oops_Inheritance_MultiLevel {
  public static void main(String[] args) {
      MLI_Labrador labrador = new MLI_Labrador();
      labrador.eat();  // Output: MLI_Animal is eating
      labrador.bark(); // Output: MLI_Dog is barking
      labrador.color(); // Output: Labrador is golden
  }
}

