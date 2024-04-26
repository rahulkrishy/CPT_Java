// Collection
/*
1.Introduction to Collections:
  - Collections in Java represent a group of objects known as elements. It provides a framework for storing, manipulating, and accessing groups of objects efficiently.
  - They offer a wide range of data structures and algorithms to efficiently manage collections of elements.
  - Java Collections Framework (JCF) is a set of classes and interfaces provided in the java.util package for working with collections.

2.Interfaces:
  - Collection: The root interface in the collection hierarchy. It defines the basic operations supported by all collection types, such as adding, removing, and querying elements.
  - List: An ordered collection that allows duplicate elements. Lists maintain the order of elements based on their insertion sequence. Implementations include ArrayList, LinkedList, etc.
  - Set: A collection that does not allow duplicate elements. Sets are used when the uniqueness of elements is important. Implementations include HashSet, TreeSet, etc.
  - Queue: A collection designed for holding elements prior to processing. Queues typically order elements in a FIFO (First-In-First-Out) manner. Implementations include LinkedList, PriorityQueue, etc.
  - Map: An object that maps keys to values. Maps do not allow duplicate keys and each key can map to at most one value. Implementations include HashMap, TreeMap, etc.

3.Classes:
  - ArrayList: A resizable array implementation of the List interface. It provides dynamic resizing and fast random access.
  - LinkedList: A doubly linked list implementation of the List interface. It provides efficient insertion and deletion operations.
  - HashSet: An implementation of the Set interface using a hash table. It provides constant-time performance for basic operations.
  - TreeSet: An implementation of the Set interface based on a Red-Black tree. It maintains elements in sorted order.
  - HashMap: An implementation of the Map interface using a hash table. It provides constant-time performance for basic operations.
  - TreeMap: An implementation of the Map interface based on a Red-Black tree. It maintains key-value pairs in sorted order.

4.Common Methods:
  - add(E element): Adds the specified element to the collection.
  - remove(Object obj): Removes the specified element from the collection.
  - contains(Object obj): Returns true if the collection contains the specified element.
  - size(): Returns the number of elements in the collection.
  - iterator(): Returns an iterator over the elements in the collection.

5.Iteration:
  - Collections support iteration through various mechanisms such as iterators, enhanced for loops, and forEach method.
  - Iterators provide a way to traverse through the elements of a collection. 
  - The Iterator interface defines methods like next(), hasNext(), and remove() for iterating over collections.

6.Sorting:
  - Collections can be sorted using the Collections.sort() method or by implementing the Comparable or Comparator interfaces.
  - The Collections.sort() method for List implementations or by using a SortedSet or TreeMap for automatic sorting.

7.Generics:
  - Java Collections Framework uses generics to ensure type safety. 
  - Generics allow collections to store elements of a specific type, providing compile-time type checking and eliminating the need for explicit type casting.
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionConcept {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("List Example:");
        // Enhanced For loop 
        for (String language : list) {
            System.out.println(language);
        }

        // forEach
        // list.forEach(language -> System.out.println(language));
        System.out.println();

        // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20); // Duplicate element, automatically removed

        System.out.println("Set Example:");
        // for (int number : set) {
        //     System.out.println(number);
        // }

        // forEach
        set.forEach(number -> System.out.println(number));
        System.out.println();

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        System.out.println("Map Example:");
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue());
        // }

        // forEach
        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}

/*
List: Stores a list of elements in a specific order.
Set: Stores a collection of unique elements (no duplicates).
Map: Stores key-value pairs where each key maps to a corresponding value.
It creates instances of ArrayList, HashSet, and HashMap, adds elements to them, and then iterates over each collection to print its contents. 
*/