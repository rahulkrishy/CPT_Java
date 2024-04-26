// this() vs super()
/*
this Keyword:
- The 'this' keyword in Java is a reference variable that refers to the current object.
- It can be used inside any method or constructor to refer to the current instance of the class.
- Primary Uses:
  - Differentiating between instance variables and method parameters or local variables with the same name.
  - Invoking constructors within other constructors (constructor chaining).
  - Passing the current object as an argument in method calls or returning the current object from a method.
- Usage:
  - Accessing instance variables: this.variableName
  - Invoking constructors: this()
  - Passing current object as an argument: method(this)
  - Returning current object: return this

super Keyword:
- The 'super' keyword in Java is a reference variable that is used to access members of the superclass.
- It can be used to call superclass constructors, methods, or access superclass fields.
- Primary Uses:
  - Calling superclass constructors: super(parameters)
  - Accessing superclass methods or fields: super.methodName() or super.variableName
  - Accessing superclass methods overridden by the subclass: super.methodName()
- Usage:
  - Calling superclass constructor: super(parameters)
  - Accessing superclass method: super.methodName()
  - Accessing superclass field: super.variableName

Key Differences:
- 'this' keyword refers to the current object instance, while 'super' keyword refers to the superclass of the current object.
- 'this' is used to differentiate between instance variables and method parameters or local variables with the same name, while 'super' is used to access members of the superclass.
- 'this' is primarily used within the class where it is defined, while 'super' can be used within both the subclass and superclass.

Object Class:
- In Java, every class implicitly extends the Object class, even if it's not explicitly declared. 
- This means that if you don't specify a superclass for your class, Java automatically considers it to be a subclass of Object. 
- However, explicitly writing extends Object in a class declaration is redundant, as it doesn't change the class's behavior or inheritance hierarchy.
*/


public class This_vs_Super {
  public static void main(String[] a) {
      new B(); //Anonymous Object
  }
}

// Superclass A
class A extends Object {
  // Default constructor
  public A() {
      super(); // Implicit call to superclass constructor (Object class constructor)
      System.out.println("In A");
  }

  // Parameterized constructor
  public A(int n) {
      super(); // Implicit call to superclass constructor (Object class constructor)
      System.out.println("In A int");
  }

  public void printInfo(){
    System.out.println("Hello");
  }
}

// Subclass B inheriting from A
class B extends A {
  // Default constructor
  public B() {
      this(5); // Explicit call to B's parameterized constructor with value 5
      System.out.println("In B");
  }

  // Parameterized constructor
  public B(int n) {
      super(); // Implicit call to superclass constructor (A class Default constructor)
      // super(5); // Implicit call to superclass constructor (A class Parameterized constructor)
      System.out.println("In B int");
      super.printInfo();
  }
}

