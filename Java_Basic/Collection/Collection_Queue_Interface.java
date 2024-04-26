// Collection_Queue_Interface
/*
Queue: 
  - A collection designed for holding elements prior to processing.
  - Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner.
  - Implementations include LinkedList, PriorityQueue, etc.

LinkedList:
  - LinkedList can be used as a Queue implementation in Java.
  - It provides FIFO (First-In-First-Out) ordering.
  - Allows elements to be added and removed from both ends of the Queue.
  - Suitable for scenarios where insertion and removal operations are frequent.
  Some commonly used methods:
    offer(): Adds an element to the end of the Queue.
    poll(): Retrieves and removes the head of the Queue.
    peek(): Retrieves, but does not remove, the head of the Queue.
    size(): Returns the number of elements in the Queue.

PriorityQueue:
  - PriorityQueue is an unbounded priority Queue based on a priority heap.
  - Elements are ordered based on their natural ordering or by a Comparator provided at queue construction time.
  - Offers elements with the highest priority (as determined by their ordering) first.
  - Suitable for scenarios where elements need to be processed based on priority.
  Some commonly used methods:
    offer(): Adds an element to the PriorityQueue.
    poll(): Retrieves and removes the highest priority element from the PriorityQueue.
    peek(): Retrieves, but does not remove, the highest priority element from the PriorityQueue.
    size(): Returns the number of elements in the PriorityQueue.
*/

import java.util.*;

// Interface for demonstrating Queue interface
interface QueueInterfaceExample {
    void demonstrateQueue();
}

// Class demonstrating LinkedList implementation of Queue interface
class LinkedListQueueExample implements QueueInterfaceExample {
    @Override
    public void demonstrateQueue() {
        // Creating a LinkedList Queue
        Queue<String> linkedListQueue = new LinkedList<>();

        // Adding elements to the Queue
        linkedListQueue.offer("Apple");
        linkedListQueue.offer("Banana");
        linkedListQueue.offer("Orange");

        // Accessing elements
        System.out.println("Elements of LinkedList Queue:");
        for (String fruit : linkedListQueue) {
            System.out.println(fruit);
        }

        // Getting the size of the Queue
        System.out.println("Size of LinkedList Queue: " + linkedListQueue.size());

        // Removing an element
        String removedElement = linkedListQueue.poll();
        System.out.println("Removed element from LinkedList Queue: " + removedElement);

        // Peeking at the next element
        String nextElement = linkedListQueue.peek();
        System.out.println("Next element in LinkedList Queue: " + nextElement);
    }
}

// Class demonstrating PriorityQueue implementation of Queue interface
class PriorityQueueExample implements QueueInterfaceExample {
    @Override
    public void demonstrateQueue() {
        // Creating a PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the Queue
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        // Accessing elements
        System.out.println("Elements of PriorityQueue:");
        for (int num : priorityQueue) {
            System.out.println(num);
        }

        // Getting the size of the Queue
        System.out.println("Size of PriorityQueue: " + priorityQueue.size());

        // Removing an element
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element from PriorityQueue: " + removedElement);

        // Peeking at the next element
        int nextElement = priorityQueue.peek();
        System.out.println("Next element in PriorityQueue: " + nextElement);
    }
}

// Main class to demonstrate Queue interface and its implementations
public class Collection_Queue_Interface {
    public static void main(String[] args) {
        // Demonstrating LinkedList Queue
        QueueInterfaceExample linkedListQueueExample = new LinkedListQueueExample();
        System.out.println("LinkedList Queue Example:");
        linkedListQueueExample.demonstrateQueue();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // Demonstrating PriorityQueue
        QueueInterfaceExample priorityQueueExample = new PriorityQueueExample();
        System.out.println("PriorityQueue Example:");
        priorityQueueExample.demonstrateQueue();
    }
}
