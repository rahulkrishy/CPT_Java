// Collection_Map_Interface
/*
Map: 
  - A collection that maps keys to values.
  - Each key must be unique, and it can map to at most one value.
  - Implementations include HashMap, TreeMap, LinkedHashMap, etc.

HashMap:
  - HashMap is an implementation of the Map interface in Java.
  - It uses a hash table for storage, providing constant-time performance for basic operations (put, get, remove).
  - 'Does not guarantee the order of elements'.
  - Allows one null key and multiple null values.
  Some commonly used methods:
    put(): Associates the specified value with the specified key in the HashMap.
    get(): Returns the value to which the specified key is mapped, or null if the key is not present.
    remove(): Removes the mapping for the specified key from the HashMap if present.
    containsKey(): Returns true if the HashMap contains the specified key.
    containsValue(): Returns true if the HashMap maps one or more keys to the specified value.
    size(): Returns the number of key-value mappings in the HashMap.

TreeMap:
  - TreeMap is an implementation of the SortedMap interface in Java.
  - It stores key-value pairs in sorted order (natural ordering or by a Comparator).
  - Provides efficient operations for finding keys and iterating in sorted order.
  - Does not allow null keys but can have multiple null values.
  Some commonly used methods:
    put(): Associates the specified value with the specified key in the TreeMap.
    get(): Returns the value to which the specified key is mapped, or null if the key is not present.
    remove(): Removes the mapping for the specified key from the TreeMap if present.
    containsKey(): Returns true if the TreeMap contains the specified key.
    containsValue(): Returns true if the TreeMap maps one or more keys to the specified value.
    size(): Returns the number of key-value mappings in the TreeMap.
    firstKey(): Returns the first (lowest) key currently in the TreeMap.
    lastKey(): Returns the last (highest) key currently in the TreeMap.

LinkedHashMap:
  - LinkedHashMap is an implementation of the Map interface in Java.
  - It maintains insertion order, meaning the elements are ordered based on their insertion sequence.
  - Provides predictable iteration order.
  - Allows one null key and multiple null values.
  Some commonly used methods:
    put(): Associates the specified value with the specified key in the LinkedHashMap.
    get(): Returns the value to which the specified key is mapped, or null if the key is not present.
    remove(): Removes the mapping for the specified key from the LinkedHashMap if present.
    containsKey(): Returns true if the LinkedHashMap contains the specified key.
    containsValue(): Returns true if the LinkedHashMap maps one or more keys to the specified value.
    size(): Returns the number of key-value mappings in the LinkedHashMap.

HahMap vs HashTable:
  - HashMap and Hashtable are both implementations of the Map interface in Java, but they have some differences:
  - HashMap is preferred in most cases due to its better performance and flexibility, while Hashtable is used in situations where thread safety is critical.

HashMap:
  - HashMap is not synchronized, meaning it is not thread-safe. Multiple threads can access and modify a HashMap concurrently, but if it's not properly synchronized, it may lead to unexpected behavior.
  - Allows null values and one null key.
  - Iteration through the elements is not guaranteed to be in any particular order.
  - HashMap is generally preferred for most applications due to its performance and flexibility.

Hashtable:
  - Hashtable is synchronized, making it thread-safe. Access to a Hashtable is synchronized on the Hashtable object itself, which means only one thread can access it at a time. This synchronization comes with a performance cost.
  - Does not allow null values or null keys. If you try to insert null as a key or value, it will throw a NullPointerException.
  - Iteration through the elements is in the order in which they were inserted.
  - Hashtable is considered legacy and has largely been replaced by HashMap in modern Java applications, unless thread safety is explicitly required.
*/

import java.util.*;

// Interface for demonstrating Map interface
interface MapInterfaceExample {
    void demonstrateMap();
}

// Class demonstrating HashMap implementation of Map interface
class HashMapExample implements MapInterfaceExample {
    @Override
    public void demonstrateMap() {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);

        // Accessing elements
        System.out.println("Elements of HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Removing a key-value pair
        hashMap.remove("Banana");
        System.out.println("Elements of HashMap after removing 'Banana': " + hashMap);

        // Checking if a key exists
        boolean containsKey = hashMap.containsKey("Apple");
        System.out.println("HashMap contains key 'Apple': " + containsKey);

        // Checking if a value exists
        boolean containsValue = hashMap.containsValue(30);
        System.out.println("HashMap contains value 30: " + containsValue);
    }
}

// Class demonstrating TreeMap implementation of Map interface
class TreeMapExample implements MapInterfaceExample {
    @Override
    public void demonstrateMap() {
        // Creating a TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Accessing elements
        System.out.println("Elements of TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the size of the TreeMap
        System.out.println("Size of TreeMap: " + treeMap.size());

        // Removing a key-value pair
        treeMap.remove(1);
        System.out.println("Elements of TreeMap after removing key 1: " + treeMap);

        // Checking if a key exists
        boolean containsKey = treeMap.containsKey(3);
        System.out.println("TreeMap contains key 3: " + containsKey);

        // Getting the first and last keys
        System.out.println("First key of TreeMap: " + ((TreeMap<Integer, String>) treeMap).firstKey());
        System.out.println("Last key of TreeMap: " + ((TreeMap<Integer, String>) treeMap).lastKey());
    }
}

// Class demonstrating LinkedHashMap implementation of Map interface
class LinkedHashMapExample implements MapInterfaceExample {
    @Override
    public void demonstrateMap() {
        // Creating a LinkedHashMap
        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put('A', 1);
        linkedHashMap.put('B', 2);
        linkedHashMap.put('C', 3);

        // Accessing elements
        System.out.println("Elements of LinkedHashMap:");
        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the size of the LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());

        // Removing a key-value pair
        linkedHashMap.remove('B');
        System.out.println("Elements of LinkedHashMap after removing key 'B': " + linkedHashMap);

        // Checking if a key exists
        boolean containsKey = linkedHashMap.containsKey('A');
        System.out.println("LinkedHashMap contains key 'A': " + containsKey);
    }
}

// Main class to demonstrate Map interface and its implementations
public class Collection_Map_Interface {
    public static void main(String[] args) {
        // Demonstrating HashMap
        MapInterfaceExample hashMapExample = new HashMapExample();
        System.out.println("HashMap Example:");
        hashMapExample.demonstrateMap();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // Demonstrating TreeMap
        MapInterfaceExample treeMapExample = new TreeMapExample();
        System.out.println("TreeMap Example:");
        treeMapExample.demonstrateMap();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // Demonstrating LinkedHashMap
        MapInterfaceExample linkedHashMapExample = new LinkedHashMapExample();
        System.out.println("LinkedHashMap Example:");
        linkedHashMapExample.demonstrateMap();
    }
}

