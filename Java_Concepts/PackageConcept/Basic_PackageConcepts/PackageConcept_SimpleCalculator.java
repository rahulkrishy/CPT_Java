// Packages
/*
1. Packages in Java:

   - Packages in Java are used to organize and manage classes and interfaces into groups or namespaces.
   - They help in avoiding naming conflicts and provide a modular structure for large-scale applications.
   - A package is a directory that contains related Java classes and interfaces.
   - Packages provide a way to encapsulate classes and control access to them.
   - Java packages follow a hierarchical naming structure, similar to directories in a file system.

2. Advantages of Using Packages:

   - **Modularity**: Packages help in organizing code into logical units, making it easier to manage and maintain.
   - **Encapsulation**: Packages allow classes to be grouped together based on functionality, providing a level of encapsulation.
   - **Namespace Management**: Packages prevent naming conflicts by segregating classes into separate namespaces.
   - **Access Control**: Packages can control access to classes and members using access modifiers like public, protected, and private.
   - **Reusability**: Packages facilitate code reuse by allowing classes to be easily shared and imported into other projects.

3. Package Naming Conventions:

   - Package names are written in lowercase letters by convention.
   - Packages follow a reverse domain name convention, such as 'com.example.package' to get a unique name for packages.
   - The Java naming convention suggests using a company's domain name in reverse order as the package name prefix.
   - Package names should be short, descriptive, and meaningful to reflect the content and purpose of the classes within them.

4. Creating and Using Packages:

   - To create a package, you simply include a 'package' declaration at the beginning of your Java source file.
   - The package declaration specifies the name of the package to which the class belongs.
   - To use classes from another package, you need to import them using the `import` statement.
   - Import statements allow you to access classes and interfaces from other packages without fully qualifying their names.
   - You can import specific classes or the entire package using wildcards (*).

5. Package Structure in File System:

   - In the file system, each package corresponds to a directory, and each dot (.) in the package name corresponds to a directory separator.
   - For example, the package com.example.package would be stored in a directory structure like com/example/package.
   - The Java compiler automatically searches for classes in the directories specified by the classpath.

6. Standard Java Packages:

   - Java provides several standard packages, such as java.lang, java.util, java.io, etc., which contain commonly used classes and interfaces.
   - These packages are automatically imported into every Java program and can be used without explicit import statements.
   - The java.lang package, in particular, contains fundamental classes and objects that are essential for all Java programs, such as String, Object, System, etc.
   - Every class(inBuild) in java belongs to some packages.

*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
PackageConcepts Folder(main folder)
   - PackageConcept_SimpleCalculator.java (Main class)
   - BasicOperation
       - Level1_Operation.java (add(),sub())
       - Level2_Operation.java (mul(),div())
   - AdvOperation
       - AdvLevel1_Operation.java (pow())
       - AdvLevel2_Operation.java (sqrt())
*/

/*
To compile and run the Java files from the terminal:

Open Terminal: Open your terminal.
Navigate to Project Directory: Use cd to move to the directory containing your Java files.

Compile Java Files: Use javac to compile all Java files including the main class and classes in packages:
javac PackageConcept_SimpleCalculator.java BasicOperation/*.java AdvOperation/*.java

Run Program: After successful compilation, run the main class using java:
java PackageConcept_SimpleCalculator

This will execute the Java program and display the output in the terminal.
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Importing classes from BasicOperation package
// import BasicOperation.Level1_Operation;
// import BasicOperation.Level2_Operation;
import BasicOperation.*;  //'*' only refers to all the files inside the Folder, not the subFolders

// Importing specific classes from AdvOperation package
import AdvOperation.AdvLevel1_Operation;
import AdvOperation.AdvLevel2_Operation;

public class PackageConcept_SimpleCalculator {
    public static void main(String[] args) {

        // Creating an object of Level2_Operation class from BasicOperation package
        Level2_Operation obj1 = new Level2_Operation();

        // Performing basic operations
        System.out.println("Add : " + obj1.add(4, 3));
        System.out.println("Sub : " + obj1.sub(4, 3));
        System.out.println("Mul : " + obj1.mul(4, 3));
        System.out.println("Div : " + obj1.div(4, 3));

        // Creating objects of advanced operation classes from AdvOperation package
        AdvLevel1_Operation obj2 = new AdvLevel1_Operation();
        System.out.println("Pow : " + obj2.power(4, 3));

        AdvLevel2_Operation obj3 = new AdvLevel2_Operation();
        System.out.println("Sqrt: " + obj3.SquareRoot(49));

    }
}

