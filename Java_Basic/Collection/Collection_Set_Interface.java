// Collection_Set_Interface
/*
Set: 
  - A collection that does not allow duplicate elements. 
  - Sets do not maintain the order of elements.
  - Implementations include HashSet, TreeSet, LinkedHashSet, etc.

HashSet:
  - HashSet is an implementation of the Set interface in Java.
  - It uses a hash table for storage, which provides constant-time performance for basic operations (add, remove, contains).
  - Does not guarantee the order of elements.
  - Does not allow duplicate elements.
  Some commonly used methods:
    add(): Adds an element to the HashSet.
    remove(): Removes the specified element from the HashSet.
    contains(): Returns true if the HashSet contains the specified element.
    size(): Returns the number of elements in the HashSet.

TreeSet:
  - TreeSet is an implementation of the SortedSet interface in Java.
  - It stores elements in sorted order (natural ordering or by a Comparator).
  - Offers efficient operations for finding elements and iterating in sorted order.
  - Does not allow duplicate elements.
  Some commonly used methods:
    add(): Adds an element to the TreeSet.
    remove(): Removes the specified element from the TreeSet.
    contains(): Returns true if the TreeSet contains the specified element.
    size(): Returns the number of elements in the TreeSet.
    first(): Returns the first (lowest) element currently in the TreeSet.
    last(): Returns the last (highest) element currently in the TreeSet.

LinkedHashSet:
  - LinkedHashSet is an implementation of the Set interface in Java.
  - It maintains insertion order, which means the elements are ordered based on their insertion sequence.
  - Offers constant-time performance for basic operations (add, remove, contains).
  - Does not allow duplicate elements.
  Some commonly used methods:
    add(): Adds an element to the LinkedHashSet.
    remove(): Removes the specified element from the LinkedHashSet.
    contains(): Returns true if the LinkedHashSet contains the specified element.
    size(): Returns the number of elements in the LinkedHashSet.
*/

import java.util.*;

// Interface for demonstrating Set interface
interface SetInterfaceExample {
    void demonstrateSet();
}

// Class demonstrating HashSet implementation of Set interface
class HashSetExample implements SetInterfaceExample {
    @Override
    public void demonstrateSet() {
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Accessing elements
        System.out.println("Elements of HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Getting the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("Elements of HashSet after removing 'Banana': " + hashSet);

        // Checking if an element exists
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("HashSet contains 'Apple': " + containsApple);
    }
}

// Class demonstrating TreeSet implementation of Set interface
class TreeSetExample implements SetInterfaceExample {
    @Override
    public void demonstrateSet() {
        // Creating a TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        // Accessing elements
        System.out.println("Elements of TreeSet:");
        for (int num : treeSet) {
            System.out.println(num);
        }

        // Getting the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Removing an element
        treeSet.remove(20);
        System.out.println("Elements of TreeSet after removing 20: " + treeSet);

        // Checking if an element exists
        boolean contains30 = treeSet.contains(30);
        System.out.println("TreeSet contains 30: " + contains30);

        // Getting the first and last elements
        System.out.println("First element of TreeSet: " + ((TreeSet<Integer>) treeSet).first());
        System.out.println("Last element of TreeSet: " + ((TreeSet<Integer>) treeSet).last());
    }
}

// Class demonstrating LinkedHashSet implementation of Set interface
class LinkedHashSetExample implements SetInterfaceExample {
    @Override
    public void demonstrateSet() {
        // Creating a LinkedHashSet
        Set<Character> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add('A');
        linkedHashSet.add('B');
        linkedHashSet.add('C');

        // Accessing elements
        System.out.println("Elements of LinkedHashSet:");
        for (char letter : linkedHashSet) {
            System.out.println(letter);
        }

        // Getting the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Removing an element
        linkedHashSet.remove('B');
        System.out.println("Elements of LinkedHashSet after removing 'B': " + linkedHashSet);

        // Checking if an element exists
        boolean containsA = linkedHashSet.contains('A');
        System.out.println("LinkedHashSet contains 'A': " + containsA);
    }
}

// Main class to demonstrate Set interface and its implementations
public class Collection_Set_Interface {
    public static void main(String[] args) {
        // Demonstrating HashSet
        SetInterfaceExample hashSetExample = new HashSetExample();
        System.out.println("HashSet Example:");
        hashSetExample.demonstrateSet();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // Demonstrating TreeSet
        SetInterfaceExample treeSetExample = new TreeSetExample();
        System.out.println("TreeSet Example:");
        treeSetExample.demonstrateSet();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // Demonstrating LinkedHashSet
        SetInterfaceExample linkedHashSetExample = new LinkedHashSetExample();
        System.out.println("LinkedHashSet Example:");
        linkedHashSetExample.demonstrateSet();
    }
}
