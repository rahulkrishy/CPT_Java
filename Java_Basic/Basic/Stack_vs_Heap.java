// Stack Memory vs Heap Memory
/* 
Stack Memory:

Definition: 
    Stack memory is used for storing method frames, local variables, and method call information.
Usage: 
    Each thread in a Java program has its own stack memory. 
    When a method is called, a new frame is pushed onto the stack to store local variables and method parameters. 
    When the method completes, its frame is popped off the stack.
Characteristics:
    Stack memory is fast and has a limited size.
    Memory allocation and deallocation are managed automatically by the JVM.
    Variables stored on the stack have a short lifespan and are destroyed as soon as their method exits.

Heap Memory:

Definition: 
    Heap memory is used for dynamic memory allocation, primarily for objects and arrays.
Usage: 
    All objects in Java are allocated memory from the heap. 
    When an object is created using the new keyword, memory is allocated from the heap, and a reference to that memory location is returned.
Characteristics:
    Heap memory is larger than stack memory and is shared among all threads.
    Objects stored on the heap have a longer lifespan and persist until they are no longer referenced or garbage collected.
    Memory allocation and deallocation are managed automatically by the JVM's garbage collector.
*/

public class Stack_vs_Heap {
  public static void main(String[] a){
  StackMemory obj1 = new StackMemory();
  obj1.runStackMemory();

  HeapMemory obj2 = new HeapMemory();
  obj2.runHeapMemory();
  }
}

class StackMemory {
  public void runStackMemory() {
      int x = 5; // Stored on the stack
      int y = 10; // Stored on the stack
      int z = add(x, y); // Method call, a new frame is pushed onto the stack
      System.out.println("Sum: " + z);
  }
  
  public static int add(int a, int b) { // Method definition, a new frame is pushed onto the stack
      return a + b; // Temporary variables 'a' and 'b' are stored on the stack
  } // Method completes, frame is popped off the stack
}

class HeapMemory {
  public void runHeapMemory() {
      // Object allocation on the heap
      Heap_Person RunHeap_Person = new Heap_Person("John", 25); // Memory allocated on the heap
      System.out.println("Name: " + RunHeap_Person.getName() + ", Age: " + RunHeap_Person.getAge());
  }
}

class Heap_Person {
  private String name;
  private int age;
  
  // Constructor
  public Heap_Person(String name, int age) {
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

/*
An object of the Heap_Person class is allocated memory on the heap using the new keyword.
The object's attributes (name and age) are stored in memory allocated on the heap.
The object's reference (RunHeap_Person) is stored on the stack, and its lifespan is determined by the scope of the variable holding the reference.
*/
