//Hierarchical Inheritance 
/*
In hierarchical inheritance, multiple subclasses inherit from the same superclass.
It forms a tree-like structure where a single superclass has multiple subclasses.
*/


// Superclass
class HI_Animal {
  void eat() {
      System.out.println("HI_Animal is eating");
  }
}

// Subclass inheriting from HI_Animal
class HI_Dog extends HI_Animal {
  void bark() {
      System.out.println("Dog is barking");
  }
}

// Another subclass inheriting from HI_Animal
class HI_Cat extends HI_Animal {
  void meow() {
      System.out.println("Cat is meowing");
  }
}

// Main class
public class Oops_Inheritance_Hierarchical {
  public static void main(String[] args) {
      HI_Dog dog = new HI_Dog();
      dog.eat();  // Output: HI_Animal is eating
      dog.bark(); // Output: Dog is barking

      HI_Cat cat = new HI_Cat();
      cat.eat();  // Output: HI_Animal is eating
      cat.meow(); // Output: Cat is meowing
  }
}
