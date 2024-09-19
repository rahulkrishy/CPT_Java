// Object class
/*
The Object class is the root class of all Java classes. It is automatically inherited by all other classes in Java. 
It resides in the java.lang package and is automatically imported into every Java program.
Some of the commonly used Object methods:

1)toString() Method:
    -The toString() method returns a string representation of the object.
    -By default, the toString() method returns a string that consists of the class name followed by the "@" symbol and the hashcode of the object.
    -It is often overridden in user-defined classes to provide meaningful string representations of objects.
2)equals() Method:
    -The equals() method compares two objects for equality.
    -By default, the equals() method in the Object class compares object references for equality (i.e., whether they refer to the same object in memory).
    -It is often overridden in user-defined classes to provide custom equality comparisons based on object attributes.
3)hashCode() Method:
    -The hashCode() method returns the hashcode value of the object.
    -The hashcode value is used in hash-based data structures like HashMap to determine the storage location of objects.
    -It is often overridden in user-defined classes to provide custom hashcode implementations that are consistent with the equals() method.
4)getClass() Method:
    -The getClass() method returns the runtime class of the object.
    -It returns an object of type Class, which provides information about the class.
*/


// Custom class for demonstrating toString() method
class ToStringDemo {
  private int value;

  // Constructor
  public ToStringDemo(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
      return "Value: " + value;
  }
}

// Custom class for demonstrating equals() method
class EqualsDemo {
  private int value;

  public EqualsDemo(int value) {
      this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj) {
          return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
          return false;
      }
      EqualsDemo other = (EqualsDemo) obj;
      return value == other.value;
  }
}

// Custom class for demonstrating hashCode() method
class HashCodeDemo {
  private int value;

  public HashCodeDemo(int value) {
      this.value = value;
  }

  @Override
  public int hashCode() {
      return Integer.hashCode(value);
  }
}

// Main class to demonstrate usage of custom and built-in object methods
public class ObjectClassConcept {
  public static void main(String[] args) {
      // Demo of toString() method
      ToStringDemo toStringDemo = new ToStringDemo(42);
      System.out.println("toString() method result: " + toStringDemo); // Output: Value: 42

      // Demo of equals() method
      EqualsDemo obj1 = new EqualsDemo(10);
      EqualsDemo obj2 = new EqualsDemo(10);
      System.out.println("equals() method result: " + obj1.equals(obj2)); // Output: true

      // Demo of hashCode() method
      HashCodeDemo hashCodeDemo = new HashCodeDemo(42);
      System.out.println("hashCode() method result: " + hashCodeDemo.hashCode()); // Output: 42

      // Demo of getClass() method
      Object obj = new Object();
      System.out.println("getClass() method result: " + obj.getClass()); // Output: class java.lang.Object
  }
}

/*
code demonstrates the usage of toString(), equals(), and hashCode() methods in separate classes, along with the getClass() method. 
Each custom class overrides the respective method to provide custom behavior. 
The main method in the ObjectClassConcept class calls and uses these methods to demonstrate their functionality.
*/
