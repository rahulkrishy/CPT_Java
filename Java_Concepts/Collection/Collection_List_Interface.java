// Collection_List_Interface
/*
List: 
  - An ordered collection that allows duplicate elements. 
  - Lists maintain the order of elements based on their insertion sequence. 
  - Implementations include ArrayList, LinkedList, etc.

ArrayList:
  - ArrayList is a resizable array implementation of the List interface in Java.
  - It stores elements sequentially in memory and allows random access to elements based on their index.
  - Provides dynamic resizing, automatically growing or shrinking as needed.
  - Offers fast access to elements but slower insertion and deletion operations, especially in the middle.
  - Suitable for scenarios where random access and iteration are frequent, but insertion and deletion operations are less common.
  Some commonly used methods:
    add(): Adds an element to the ArrayList.
    get(): Retrieves the element at the specified index.
    size(): Returns the number of elements in the ArrayList.
    remove(): Removes the first occurrence of the specified element from the ArrayList.
    contains(): Returns true if the ArrayList contains the specified element.

LinkedList:
  - LinkedList is a doubly-linked list implementation of the List interface in Java.
  - It consists of nodes, where each node contains a reference to the previous and next nodes in the sequence.
  - Allows fast insertion and deletion operations anywhere in the list, as it only requires adjusting the references of neighboring nodes.
  - Provides slower access to elements compared to ArrayList because it requires traversing the list from the beginning or end to reach a specific index.
  - Suitable for scenarios where frequent insertion and deletion operations are required, especially in the middle of the list, but random access is less common.
  Some commonly used methods:
    add(): Adds an element to the LinkedList.
    get(): Retrieves the element at the specified index.
    size(): Returns the number of elements in the LinkedList.
    remove(): Removes the first occurrence of the specified element from the LinkedList.
    contains(): Returns true if the LinkedList contains the specified element.
*/

import java.util.*;

// Interface for demonstrating List interface
interface ListInterfaceExample {
    void demonstrateList();
}

// Class demonstrating ArrayList implementation of List interface
class ArrayListExample implements ListInterfaceExample {
    @Override
    public void demonstrateList() {
        // Creating an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Accessing elements using index
        System.out.println("Elements of ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("Elements of ArrayList after removing 'Banana': " + arrayList);

        // Checking if an element exists
        boolean containsApple = arrayList.contains("Apple");
        System.out.println("ArrayList contains 'Apple': " + containsApple);

        // Adding elements at specific index
        arrayList.add(1, "Grapes");
        System.out.println("ArrayList after adding 'Grapes' at index 1: " + arrayList);
    }
}

// Class demonstrating LinkedList implementation of List interface
class LinkedListExample implements ListInterfaceExample {
    @Override
    public void demonstrateList() {
        // Creating a LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Accessing elements using index
        System.out.println("Elements of LinkedList:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // Getting the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Removing an element
        linkedList.remove(Integer.valueOf(20));
        System.out.println("Elements of LinkedList after removing 20: " + linkedList);

        // Checking if an element exists
        boolean contains30 = linkedList.contains(30);
        System.out.println("LinkedList contains 30: " + contains30);

        // Adding elements at specific index
        linkedList.add(1, 25);
        System.out.println("LinkedList after adding 25 at index 1: " + linkedList);
    }
}

// Main class to demonstrate List interface and its implementations
public class Collection_List_Interface {
    public static void main(String[] args) {
        // Demonstrating ArrayList
        ListInterfaceExample arrayListExample = new ArrayListExample();
        System.out.println("ArrayList Example:");
        arrayListExample.demonstrateList();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // Demonstrating LinkedList
        ListInterfaceExample linkedListExample = new LinkedListExample();
        System.out.println("LinkedList Example:");
        linkedListExample.demonstrateList();
    }
}
