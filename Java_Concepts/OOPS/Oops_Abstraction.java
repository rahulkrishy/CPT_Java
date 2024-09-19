// Abstraction
/*
Abstraction is a fundamental concept in object-oriented programming (OOP) that focuses on 
representing the essential features of an object while hiding the unnecessary details of its implementation. 
It allows developers to create models that mimic real-world entities by emphasizing what an object does rather than how it does it.
In OOP, abstraction is implemented using abstract classes and interfaces.
1. Abstract Classes:
    - An abstract class is a class that cannot be instantiated directly but can be subclassed.
    - It may contain abstract methods (methods without a body) that subclasses must implement.
    - Abstract classes can also have concrete methods with implementations.
    - They serve as a blueprint for other classes and are used to define common behavior shared by multiple subclasses.

2. Interfaces:
    - An interface is a reference type in Java that defines a set of abstract methods.
    - Like abstract classes, interfaces cannot be instantiated directly.
    - Classes can implement one or more interfaces, inheriting the abstract methods declared in those interfaces.
    - Interfaces are used to achieve multiple inheritance of type and to provide a contract for classes to adhere to.

3. Encapsulation:
    - Encapsulation is closely related to abstraction and involves bundling the data (attributes) and methods (behaviors) that operate on the data into a single unit (a class).
    - It hides the internal state of objects and exposes only the necessary functionality through methods, thus promoting information hiding and modularity.
*/
/*
1. Abstract Keyword:
  -The abstract keyword is used to declare abstract classes and methods in Java.
  -Abstract classes cannot be instantiated directly and may contain both abstract and concrete methods.
  -Abstract methods are declared without implementation and must be overridden by subclasses.

2. Abstract Classes with Abstract Methods:
   - Abstract classes are classes that cannot be instantiated and may contain abstract methods(only declarations).
   - Abstract methods are declared without implementation and must be overridden by subclasses.
   - Abstract methods only belongs to abstract classes.
   - We can't create a object of abstract class, only can create reference of abstract class.
   - They are used to define a common interface for a group of related subclasses.
   - Example:
     ```java
     abstract class AbstractClass {
         abstract void abstractMethod();
     }
     ```

3. Concrete Class with Inner Classes:
   - Concrete Class are used to define all the abstract methods in the abstract class. Concrete class always extends abstract class.
   - Its Compulsory to define all the declared abstract methods, if it not use all of it, then that class will also becomes an abstract, so then we need new Concrete class.  
   - Inner classes are classes defined within another class.
   - They can access members of the outer class, including private members.
   - Inner classes can be of different types: static inner class, non-static inner class (also known as nested class), local inner class, and anonymous inner class.
   - Example:
     ```java
     class ConcreteClass {
         // Inner class
         class InnerClass {
             // Inner class method
             void display() {
                 System.out.println("Inner class method");
             }
         }
     }
     ```

4. Anonymous Inner Classes:
   - Anonymous inner classes are inner classes without a name that are declared and instantiated at the same time.
   - They are typically used for one-time use cases, such as event handling or implementing interfaces.
   - They can access members of the enclosing class as well as local variables of the enclosing method (if declared final or effectively final).
   - Example:
     ```java
     interface HelloWorld {
         void greet();
     }

     class Main {
         public static void main(String[] args) {
             HelloWorld hello = new HelloWorld() {
                 public void greet() {
                     System.out.println("Hello, World!");
                 }
             };
             hello.greet();
         }
     }
     ```

5. Abstract Classes with Anonymous Inner Classes:
   - Anonymous inner classes allow you to quickly and directly implement abstract methods as needed, without the need to create separate named classes beforehand.
   - They allow defining the implementation of abstract methods without explicitly creating a subclass.
   - They are useful when a simple, one-time implementation is needed.
   - Example:
     ```java
     abstract class AbstractClass {
         abstract void abstractMethod();
     }

     class Main {
         public static void main(String[] args) {
             AbstractClass obj = new AbstractClass() {
                 void abstractMethod() {
                     System.out.println("Implemented abstract method");
                 }
             };
             obj.abstractMethod();
         }
     }
     ```
*/


// Abstract class with abstract method
abstract class AbstractClass {
    abstract void abstractMethod(); //only declaration in abstract class
}

// Concrete class implementing abstract method
class ConcreteClass extends AbstractClass {
    // Implementing abstract method
    void abstractMethod() {
        System.out.println("Abstract method implemented in ConcreteClass");
    }

    // Inner class
    class InnerClass {
        // Inner class method
        void display() {
            System.out.println("Inner class method");
        }
    }
}

// Main class to demonstrate abstract classes, inner classes, and anonymous inner classes
public class Oops_Abstraction {
    public static void main(String[] args) {
        // Concrete class instance
        ConcreteClass concrete = new ConcreteClass();
        concrete.abstractMethod(); // Call concrete method

        // Inner class instance
        ConcreteClass.InnerClass inner = concrete.new InnerClass();  // To Access innerClass we need to mention OuterClass with '.' and assign with object of OuterClass with InnerClass
        inner.display(); // Call inner class method

        // Anonymous inner class implementing interface
        HelloWorld hello = new HelloWorld() {
            // Implementing interface method
            public void greet() {
                System.out.println("Hello from Anonymous inner class");
            }
        };
        hello.greet(); // Call interface method

        // Anonymous inner class extending abstract class
        AbstractClass obj = new AbstractClass() {
            // Implementing abstract method
            void abstractMethod() {
                System.out.println("Implemented abstract method by Anonymous inner class");
            }
        };
        obj.abstractMethod(); // Call abstract method
    }

    // Interface with one method
    interface HelloWorld {
        void greet();
    }
}


