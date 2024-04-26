/*
// Structure of a Java Program:

1.Package Declaration (Optional):
    package com.example.myProject;
    -A package is a namespace that organizes a set of related classes and interfaces.
    -It helps in avoiding naming conflicts and provides better organization.
2.Import Statements (Optional):
    import java.util.Scanner;
    -Import statements are used to import classes, interfaces, or entire packages into the current program.
3.Class Declaration:
    public class MyClass {
    // Class members (fields and methods) go here
    }
    -A class is the basic building block of Java programs.
    -It encapsulates data for the object and methods to operate on that data.
4.Main Method:
    public static void main(String[] args) {
    // Program logic goes here
    }
    -The main method serves as the entry point of the Java program.
    -It has a specific signature (public static void main(String[] args)) and is where program execution begins.
5.Other Class Members:
    public class MyClass {
    int number; // Field
    public void display() { // Method
        System.out.println("Number: " + number);
    }}
    -Inside the class declaration, you can define fields (variables) and methods (functions) that define the behavior of the class.
*/

// Compiling and Running Java Programs:
/* 
Compiling Java Programs:
1.Write Code: 
    Create a Java source file with a .java extension containing your Java code.
2.Compile Code:
    javac MyClass.java
    -Use the javac command to compile the Java source file into bytecode.
    -Use cd comment in the terminal to change directory
3.Generated Files:
    -If there are no errors, the compiler generates one or more .class files containing bytecode.

Running Java Programs:
1.Run Compiled Program:
    java MyClass
    -Use the java command to run the compiled Java program.
2.Main Method Execution:
    -The java command looks for the main method in the specified class and starts program execution from there.
3.ClassPath and Package Names:
    java -cp . com.example.myProject.MyClass
    -If your program uses classes from other packages or directories, you need to specify the classPath using the -cp option.
    -For example, if your class is in a package, you need to specify the package name along with the class name when running the program.
*/

//--------------------------------------------------------------

// Hello World!

public class _HelloWorld {
  public static void main(String[] args) {
      System.out.println("Hello World!");
  }
}

// 
/*
public class HelloWorld: 
    Declares a class named HelloWorld. In Java, every application consists of at least one class.
public static void main(String[] args): 
    Every Java program must have a main method, which serves as the entry point of the program.
    It has a specific signature (public static void main(String[] args)) and is where program execution begins.
System.out.println("Hello, World!");: 
    This statement prints "Hello, World!" to the console. System.out refers to the standard output stream, and println() is a method to print a line of text.

Static Keyword in main():
    -Entry Point: The main method is where the Java program starts running. It's the first method executed by the JVM.
    -No Object Creation: Since the main method is called by the JVM before any objects are created, it must be static. Non-static methods require an object to be called, but the main method is invoked without creating any objects.
    -Access Without Instantiation: Declaring the main method as static allows it to be called directly using the class name. This makes the syntax simpler and emphasizes that the main method is a class-level entry point.
String[] args:
    -String[] args is the parameter list, which allows the program to accept command-line arguments as an array of strings
*/

//--------------------------------------------------------------

// Findings:

// Naming convention:
/* 
- PascalNamingConvention - Classes, Interface
- camelNamingConvention - Methods, Variables
- ALLCAPITAL - Constants
*/

// In Java, you can have multiple classes in the same file, but only one of them can be public, and the filename must match the name of the public class.

// The process of object creation in Java into two steps: class loading and object instantiation.

/*
// 'Class' Class in Java:
In Java, the Class class is a fundamental part of the language and runtime environment, providing a way to represent classes and interfaces at runtime. 
It allows developers to examine and manipulate the runtime properties of classes dynamically.
*/

//Findings: Avoiding Class Name Conflicts in Java: Organizing Files in Separate Directories
/*
-If you have two Java files in the same directory with classes having the same name, but you are trying to compile or run one of them individually, you might encounter errors due to class name conflicts.
-When you compile Java files, the compiler generates corresponding .class files for each class, and if you have two classes with the same name, they will overwrite each other in the same directory.
-To resolve this issue and compile/run both sets of files independently, you can place each set of Java files in its own separate directory. This way, the compiler will generate separate .class files in each directory, avoiding conflicts. , give me suitable title for it
*/
