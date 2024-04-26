// Array Of Objects
/*
array of objects in Java is an array where each element is an object of a specific class. 
It allows you to store multiple objects of the same class in a contiguous memory block. 
*/

// Define a Array_Person class
class Array_Person {
  private String name;
  private int age;
  
  // Constructor
  public Array_Person(String name, int age) {
      this.name = name;
      this.age = age;
  }
  
  // Getter methods
  public String getName() {
      return name;
  }
  
  public int getAge() {
      return age;
  }
}

// Main class
public class Array_ArrayOfObjects {
  public static void main(String[] args) {
      // Create an array of Array_Person objects
      Array_Person[] people = new Array_Person[3]; // Array of size 3
      
      // Initialize array elements with Array_Person objects
      people[0] = new Array_Person("Alice", 25);
      people[1] = new Array_Person("Bob", 30);
      people[2] = new Array_Person("Charlie", 35);
      
      // Access and print information of each Array_Person
      for (Array_Person Array_Person : people) {
          System.out.println("Name: " + Array_Person.getName() + ", Age: " + Array_Person.getAge());
      }
  }
}

