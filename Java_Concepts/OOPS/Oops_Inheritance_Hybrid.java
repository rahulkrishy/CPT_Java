// OOPS_Hybrid inheritance
/*
Hybrid inheritance (a combination of different types of inheritance) can be achieved 
by using a combination of single, multilevel, and hierarchical inheritance.
*/


// Superclass
class HYI_Animal {
  void eat() {
      System.out.println("HYI_Animal is eating");
  }
}

// Subclass inheriting from HYI_Animal
class HYI_Dog extends HYI_Animal {
  void bark() {
      System.out.println("HYI_Dog is barking");
  }
}

// Another subclass inheriting from HYI_Animal
class Cat extends HYI_Animal {
  void meow() {
      System.out.println("Cat is meowing");
  }
}

// Subclass inheriting from Dog and Cat (Hybrid Inheritance)
class HYI_DogCat extends HYI_Dog {
  void purr() {
      System.out.println("DogCat is purring");
  }
}

// Main class
public class Oops_Inheritance_Hybrid {
  public static void main(String[] args) {
      HYI_DogCat dogCat = new HYI_DogCat();
      dogCat.eat();  // Output: HYI_Animal is eating (inherited from HYI_Animal)
      dogCat.bark(); // Output: HYI_Dog is barking (inherited from HYI_Dog)
      dogCat.purr(); // Output: DogCat is purring (specific to DogCat)
  }
}
