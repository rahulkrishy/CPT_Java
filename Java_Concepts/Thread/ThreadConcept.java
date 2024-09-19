// Thread concept
/*
Thread concept in Java allows concurrent execution of tasks, enabling applications to perform multiple operations simultaneously. 

1. Thread Basics:
    - A thread is a lightweight process within a process. It allows Java programs to perform multiple tasks simultaneously by dividing the program into multiple execution paths.
    - Java applications can have multiple threads running concurrently, each executing its set of instructions independently.
    - Threads are instances of the java.lang.Thread class or implement the java.lang.Runnable interface.

2. Concurrency:
    - Threads enable concurrent execution, where multiple tasks can run simultaneously within a program.
    - Each thread has its own stack and program counter, allowing it to execute independently of other threads.

3. Creating Threads:
    - There are two ways to create threads in Java:
    a. Extending the Thread class and overriding its run() method.
    - Example:
        class A extends Thread{
          public void run()       //Always thread class have run() method
          {// Thread logic here}}
        class B extends Thread{
          public void run()
          {// Thread logic here}}
        public class MainLobby1{
          public static void main(String[] args){
            A obj1 = new A();
            B obj2 = new B();
        
            obj1.start();     //always start() method to execute the thread run() method.
            obj2.start(); }}

    b. Implementing the Runnable interface and providing implementation for the run() method.
    - Example:
        class A implements Runnable{
          public void run(){// Thread logic here}}
        class B implements Runnable{
          public void run(){// Thread logic here}}
        public class Main{
          public static void main(String[] args){
            A obj1 = new A();
            B obj2 = new B();

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);
        
            t1.start(); 
            t2.start(); }}
      
4. Starting Threads:
    - Threads are started using the start() method, which calls the run() method internally.
    - Example:
        MyThread thread = new MyThread();
        thread.start();

5. Thread States:
    - Threads in Java can be in one of the following states:
        a. New: The thread has been created but not started yet.
        b. Runnable: The thread is ready to run and waiting for CPU time.
        c. Blocked/Waiting: The thread is temporarily inactive, waiting for an event to occur.
        d. Timed Waiting: The thread is waiting for a specific period.
        e. Terminated: The thread has completed execution.

6. Thread Synchronization:
    - In a multithreaded environment, synchronization ensures that only one thread can access a resource or critical section at a time to prevent race conditions and data corruption.
    - Synchronization can be achieved using:
        a. synchronized keyword: Used to create synchronized methods or blocks.
        b. wait() and notify() methods: Used for inter-thread communication and coordination.
        c. Lock and Condition interfaces: Provides a more flexible way of synchronization.

7. Thread Interruption:
    - Threads can be interrupted using the interrupt() method to signal them to stop execution.
    - Interrupted threads can handle the interruption by catching InterruptedException and performing cleanup tasks.

8. Thread Joining:
    - The join() method allows one thread to wait for the completion of another thread.
    - This is useful for coordinating the execution sequence of threads.

9. Thread Priority:
    - Threads can have priorities ranging from 1 (lowest) to 10 (highest).
    - Higher priority threads are scheduled to run before lower priority threads, but it's not guaranteed.

10. Thread Lifecycle:
    - The lifecycle of a thread consists of several states, including creation, execution, and termination. 
    - Threads transition between these states based on their execution status and actions performed by the program.
    - The main states of the thread lifecycle are: new, runnable, blocked, waiting, timed waiting, and terminated.

11. Thread Pooling:
    - Thread pooling is a technique used to manage and reuse a pool of worker threads to execute tasks asynchronously.
    - Java provides the Executor framework (ExecutorService and ThreadPoolExecutor) for managing thread pools efficiently.

12. Thread Safety:
    - Thread safety ensures that shared resources are accessed safely by multiple threads without causing data corruption or inconsistencies.
    - Techniques such as synchronization, atomic operations, and using thread-safe data structures (e.g., ConcurrentHashMap, CopyOnWriteArrayList) help achieve thread safety.

13. scheduler:
    - The scheduler in Java is responsible for managing the execution of threads within a Java Virtual Machine (JVM). 
    - It determines which threads should run, when they should run, and for how long they should run.
    Thread Priority:Threads in Java can be assigned a priority ranging from 1 (lowest) to 10 (highest). 
                    The thread scheduler uses these priorities to determine the order in which threads are executed. 
                    However, the actual behavior may vary between different JVM implementations and operating systems.
    Time Slicing:   The scheduler allocates CPU time to threads using a technique called time slicing. Each thread is given a small time slice during which it can execute. 
                    Once the time slice expires, the scheduler may switch to another thread.

14. Concurrency Utilities:
    - Java provides high-level concurrency utilities in the java.util.concurrent package, such as ExecutorService, Semaphore, CountDownLatch, CyclicBarrier, etc., to simplify concurrent programming tasks.

 */

public class ThreadConcept {
    public static void main(String[] args) {
        // Creating and starting a thread by extending the Thread class
        MyThreadConcept thread1 = new MyThreadConcept();
        thread1.start();

        // Creating and starting a thread by implementing the Runnable interface
        Thread thread2 = new Thread(new MyRunnableConcept());
        thread2.start();

        // Synchronizing access to shared data
        SharedDataConcept sharedData = new SharedDataConcept();
        Thread thread3 = new Thread(new MyRunnableWithSyncConcept(sharedData));
        Thread thread4 = new Thread(new MyRunnableWithSyncConcept(sharedData));
        Thread thread5 = new Thread(new MyRunnableWithSyncConcept(sharedData));
        Thread thread6 = new Thread(new MyRunnableWithSyncConcept(sharedData));
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        // Interrupting a thread
        Thread thread7 = new Thread(new MyInterruptedRunnableConcept());
        thread7.start();
        thread7.interrupt(); //interrupt the sleeping thread

        // Joining threads
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread exiting..."); //~ without join() main may be executed first before thread

        for(int i=0;i<1;i++)
        {
            for(int j=0;j<1000000000;j++){} //max int delay
            for(int k=0;k<1000000000;k++){} //max int delay
            System.out.println("Main delay thread exiting..."); //~Creating a delay, Main may be executed after the delay to the thread 
        }
    }
}

// Thread by extending Thread class
class MyThreadConcept extends Thread {
    @Override
    public void run() {
        System.out.println("Thread by extending Thread class: " + Thread.currentThread().getName());
    }
}

// Thread by implementing Runnable interface
class MyRunnableConcept implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread by implementing Runnable interface: " + Thread.currentThread().getName());
    }
}

// Synchronizing access to shared data
class SharedDataConcept {
    private int count = 0; //initialized to zero

    public synchronized void increment()  //synchronized keyword enables thread synchronization one after another
    {
        count++;
        System.out.println("Incremented count: " + count);
    }
}

class MyRunnableWithSyncConcept implements Runnable {
    private SharedDataConcept sharedData;

    // Constructor
    public MyRunnableWithSyncConcept(SharedDataConcept sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        sharedData.increment();
    }
}

// Interrupting a thread
class MyInterruptedRunnableConcept implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); //thread7 is sleeping for 1000 milliseconds using Thread.sleep(1000). If the interruption occurs while the thread is sleeping, it will throw an InterruptedException, causing the thread to exit the sleep and proceed to execute the code within the catch block.
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + Thread.currentThread().getName()); //thread7(Thread-6)
        }
    }
}
