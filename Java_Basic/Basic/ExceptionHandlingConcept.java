// 
/*
Exception handling in Java is a mechanism to handle runtime errors or exceptional conditions that may occur during the execution of a program. 
It helps in maintaining the normal flow of the program by providing a way to deal with unexpected situations gracefully. 
To ensure that the code runs smoothly without abruptly terminating, all critical statements are managed through exception handling. This approach allows the program to handle unexpected errors gracefully, preventing it from crashing prematurely.
Here are the key aspects related to exception handling in Java:

1. Types of Exceptions:

    1) Checked Exceptions: 
        - These are the exceptions that are checked at compile-time. 
        - They must be either caught using try-catch blocks or declared using the throws keyword in the method signature.

    2) Unchecked Exceptions (Runtime Exceptions): 
        - These are exceptions that are not checked at compile-time. 
        - They typically occur due to programming errors and do not require explicit handling. 
        - Examples include NullPointerException, ArrayIndexOutOfBoundsException, etc.

2. Exception Hierarchy:
                                         |- Error(Can't be handled), Ex. Thread Death, IO Error, virtualMachineError,OutOfMemory
    - Object(Class) -> Throwable(Class)->
                                         |- Exception(can be handled) -> Checked(IO,Sql Exceptions) & Unchecked(RunTime Exception,Ex: Arithmetic, ArrayIndexOutOfBound, NullPointer)
    - All exception classes in Java are subclasses of the Throwable class.
    - Throwable has two main subclasses: Exception and Error.
    - Exceptions are further divided into checked and unchecked exceptions.

3. Exception Handling Keywords and Constructs:

    1) try-catch Block: 
        - It is used to enclose the code that may throw an exception. 
        - If an exception occurs within the try block, it is caught by the corresponding catch block.

    2) throw Keyword: 
        - It is used to explicitly throw an exception from a method or block of code.
        - when you use the throw keyword to manually throw an exception, it is typically used in conjunction with the new keyword to create an instance of the exception object that you want to throw.
        - new: Keyword used to create a new instance of the exception object.

    3) throws Keyword: 
        - It is used in method signatures to declare that the method may throw certain exceptions. 
        - It delegates the responsibility of handling exceptions to the caller method.
        - declared in the header of the method to throws to caller method.

    4) finally Block: 
        - It is used to execute code that must be run regardless of whether an exception occurs or not. 
        - It is typically used for resource cleanup.

4. Handling Exceptions:

    1) Catching Exceptions: 
        - Exceptions are caught using try-catch blocks. 
        - Multiple catch blocks can be used to handle different types of exceptions.

    2) Throwing Exceptions: 
        - Exceptions can be thrown explicitly using the throw keyword.

    3) Propagating Exceptions: 
        - Exceptions can be propagated to the caller method using the throws keyword.

    4) Cleanup with finally: 
        - Resources like file handles, database connections, etc., can be safely closed in the finally block to ensure proper cleanup.

*/

// Custom exception class
class CustomException extends Exception //extends from inBuild Exception class
{
  // Constructor  
  public CustomException(String message) {
      super(message);
  }
}

// Class to demonstrate try-catch block
class TryCatchExample {
@SuppressWarnings("null") //just used to avoid shown null pointer compile time error to get it from exception
public void demonstrateTryCatch() {
    try 
    {
        // ArithmeticException
        @SuppressWarnings("unused")
        int result = 10 / 0; // Division by zero to trigger ArithmeticException
        // ArrayIndexOutOfBoundsException
	    int arr[] = {1,2,3,4,5};
		System.out.println(arr[5]);
        // NullPointerException
        String str = null;
        System.out.println(str.length());
    
    } 
    catch (ArithmeticException e) {
        System.out.println("Exception caught: ArithmeticException" + e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: ArrayIndexOutOfBound "+ e.getMessage());
    }
    catch(NullPointerException e){
        System.out.println("Exception caught: NullPointerException "+ e.getMessage());
    }
    catch(Exception e) //general exception catch always at the last
    {
        System.out.println("Exception Caught: "+ e);
    }
    finally{
        System.out.println("Done");
    }
  }
}

// Class to demonstrate throw keyword
class ThrowExample {
  public void demonstrateThrow() {
      try {
          throw new NullPointerException("Message- Custom NullPointerException"); //Explicitly pass exception with message
      } catch (NullPointerException e) {
          System.out.println("Exception caught: " + e.getMessage()); //getMessage() is used to get the message
      }
  }
}

// Class to demonstrate throws keyword
class ThrowsExample {
  // Method declaration with throws clause
  public void demonstrateThrows() throws Exception {
    // Code that might potentially throw an exception
    @SuppressWarnings("unused")
    int result = 10 / 0; // This line will throw an ArithmeticException
}
}

// Class to demonstrate try-catch-finally block
class TryCatchFinallyExample {
  public void demonstrateTryCatchFinally() {
      try {
        @SuppressWarnings("unused")
        int result = 10 / 0; // Division by zero to trigger ArithmeticException
      } catch (ArithmeticException e) {
          System.out.println("Exception caught: " + e.getMessage());
      } finally {
          System.out.println("Finally block executed");
      }
  }
}

public class ExceptionHandlingConcept {
  public static void main(String[] args) {
    
    System.out.println("TryCatchExample--------------------------------");
    // Demonstrate try-catch block
    TryCatchExample tryCatchExample = new TryCatchExample();
    tryCatchExample.demonstrateTryCatch();

    System.out.println("ThrowExample--------------------------------");
    // Demonstrate throw keyword
    ThrowExample throwExample = new ThrowExample();
    throwExample.demonstrateThrow();

    System.out.println("ThrowsExample--------------------------------");
    // Demonstrate throws keyword
    ThrowsExample throwsExample = new ThrowsExample();
    try {
        throwsExample.demonstrateThrows();
    } catch (Exception e) {
        System.out.println("Exception caught: " + e);
    }

    System.out.println("CustomException--------------------------------");
    // Demonstrate custom exception (just use throw, obj creation is not needed for constructor)
    try {
        throw new CustomException("Custom Exception occurred"); //we can pass our the message with it
    } catch (CustomException e) {
        System.out.println("Exception caught: " + e.getMessage());
    }

    System.out.println("TryCatchFinallyExample--------------------------------");
    // Demonstrate try-catch-finally block
    TryCatchFinallyExample tryCatchFinallyExample = new TryCatchFinallyExample();
    tryCatchFinallyExample.demonstrateTryCatchFinally();
  }
}
