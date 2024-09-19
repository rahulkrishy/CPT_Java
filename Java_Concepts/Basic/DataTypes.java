// Variables in Java:
/* 
Variable is a container that stores data values. 
Variables are declared with a specific data type, which defines the type of data the variable can hold. 
Variable names must start with a letter, dollar sign ($), or underscore (_), followed by letters, digits, dollar signs, or underscores.
Variable names are case-sensitive.
Cannot use Java reserved keywords as variable names.
*/

// Data Types in Java
/* 
Java supports various data types, 
which can be classified into two categories: primitive data types and reference data types.

1)Primitive Data Types:
    -Represent basic data types and are built into the Java language.
    -Include int, double, boolean, char, byte, short, long, and float.
    -Used to store simple values directly in memory.

2)Reference Data Types:
    -Represent objects and are instantiated from classes.
    -Include String, arrays, and user-defined classes.
    -Store references (memory addresses) to objects rather than the actual data.
*/

// Primitive Data Types
/* 
Java has eight primitive data types, 
which can be categorized into four groups: integer, floating-point, character, and boolean.

1)Integer Data Types:
-byte:
    Definition: Represents 8-bit signed integers.
    Size: 8 bits (1 byte).
    Range: From -128 to 127.
-short:
    Definition: Represents 16-bit signed integers.
    Size: 16 bits (2 bytes).
    Range: From -32,768 to 32,767.
-int:
    Definition: Represents 32-bit signed integers.
    Size: 32 bits (4 bytes).
    Range: From -2^31 to 2^31 - 1.
-long:
    Definition: Represents 64-bit signed integers.
    Size: 64 bits (8 bytes).
    Range: From -2^63 to 2^63 - 1.

2)Floating-Point Data Types:
-float:
    Definition: Represents single-precision floating-point numbers.
    Size: 32 bits (4 bytes).
    Range: Approximately ±3.40282347E+38F (6-7 significant decimal digits).
-double:
    Definition: Represents double-precision floating-point numbers.
    Size: 64 bits (8 bytes).
    Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits).

3)Character Data Type:
-char:
    Definition: Represents a single 16-bit Unicode character.
    Size: 16 bits (2 bytes).
    Range: Unicode characters from '\u0000' to '\uffff'.

4)Boolean Data Type:
-boolean:
    Definition: Represents true or false values.
    Size: Not precisely defined by the language specification.
    Range: true or false.
*/

// Reference Data Types
/* 
Reference data types in Java represent objects and are instantiated from classes. 
Unlike primitive data types, which store values directly, reference data types store references (memory addresses) to objects. 
Java has several built-in reference data types, and users can also create their own custom reference data types using classes.

1) String:
    Definition: Represents a sequence of characters.
    Size: The size of a String object varies depending on the number of characters it contains.
    Range: Unicode characters, allowing for the representation of text in any language.
2)Arrays:
    Definition: Represents a collection of elements of the same data type.
    Size: The size of an array varies based on the number of elements it contains.
    Range: Arrays can store elements of any data type, including primitive and reference data types.
3)Classes:
    Definition: Represents user-defined data types with attributes and behaviors.
    Size: The size of objects instantiated from a class varies based on the memory required for its attributes.
    Range: Classes can encapsulate complex data structures and functionalities, providing flexibility in representing various entities in a program.

// Wrapper Class:

Wrapper classes in Java are classes that provide a way to represent primitive data types as objects. 
They encapsulate primitive values in an object, allowing them to be used in contexts that require objects, such as collections, generics, and method overloading.
Here are the wrapper classes for primitive data types:
Integer - Wrapper for int
Long - Wrapper for long
Short - Wrapper for short
Byte - Wrapper for byte
Float - Wrapper for float
Double - Wrapper for double
Character - Wrapper for char
Boolean - Wrapper for boolean

AutoBoxing:
AutoBoxing is the automatic conversion of primitive data types to their corresponding wrapper objects. 
// AutoBoxing: converting int to Integer
int num = 10;
Integer integerObj = num; // AutoBoxing

UnBoxing:
UnBoxing is the reverse process, where wrapper objects are automatically converted back to their primitive data types.
// UnBoxing: converting Integer to int
Integer integerObj = 20;
int num = integerObj; // UnBoxing
*/


// Main class for running the program
public class DataTypes {
  public static void main(String[] args) {
      // Create an object of PrimitiveDataTypes class to demonstrate primitive data types
      PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();                            //'primitiveDataTypes' is reference of object, 'new' creates a object
      primitiveDataTypes.printPrimitiveDataTypes(); // Call method to print primitive data types
      
      // Create an object of ReferenceDataTypes class to demonstrate reference data types
      ReferenceDataTypes refDataTypes = new ReferenceDataTypes();
      refDataTypes.printReferenceDataTypes(); // Call method to print reference data types
  }
}

// Class to demonstrate primitive data types
class PrimitiveDataTypes {
  // Method to print primitive data types
  public void printPrimitiveDataTypes() {
      // Primitive Data Types
      // Integer data types
      byte myByte = 100;
      short myShort = 10_000; // Note '_' is used for number visualization purpose only, compiler will ignore it.
      int myInt = 1_00_000;
      long myLong = 1_00_00_00_000L; // Note the 'L' suffix to indicate a long literal
      
      // Floating-point data types
      float myFloat = 3.14f;    // Note must use 'f' suffix to indicate a float literal
      double myDouble = 3.14159265359;
      
      // Character data type
      char myChar = 'A';
      
      // Boolean data type
      boolean myBoolean = true;  //Note boolean will only accept true or false, not '0' or '1'
      
      // Output values
      System.out.println("Primitive Data Types:");
      System.out.println("Byte: " + myByte);
      System.out.println("Short: " + myShort);
      System.out.println("Int: " + myInt);
      System.out.println("Long: " + myLong);
      System.out.println("Float: " + myFloat);
      System.out.println("Double: " + myDouble);
      System.out.println("Char: " + myChar);
      System.out.println("Boolean: " + myBoolean);

      // Type conversion
			
	    // Conversion - Implicit conversion
	    byte num1 = 1;
	    int num2 = num1;             //conversion from byte to int
	    System.out.println(num2);

		// Casting - explicit conversion
		int num3 = 257;
		byte num4 = (byte) num3;   //explicit conversion from int to byte (257 % 256[range of byte] = 1)
		System.out.println(num4);

		// Type Promotion
		byte num5 = 10;
		byte num6 = 30;
		int num7 = num5 * num6;    //result will exceed the range of byte, type promotion from byte to int
		System.out.println(num7);
  }
}

// Class to demonstrate reference data types
class ReferenceDataTypes {
  // Method to print reference data types
  public void printReferenceDataTypes() {
      // Reference Data Types
      // String
      String myString = "Hello, Java!";
      
      // Array
      int[] myArray = {1, 2, 3, 4, 5};
      
      // Custom class
      ReferenceDataTypes_Person person1 = new ReferenceDataTypes_Person("John", 25);
      
      // Output values
      System.out.println("\nReference Data Types:");
      System.out.println("String: " + myString);
      System.out.print("Array: ");
      for (int num : myArray) {
          System.out.print(num + " ");
      }
      System.out.println();
      System.out.println("Custom Class: " + person1.getName() + ", " + person1.getAge());
  }
}

// Custom class for reference data type
class ReferenceDataTypes_Person {
  private String name;
  private int age;
  
  // Constructor
  public ReferenceDataTypes_Person(String name, int age) {
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

// main method:
/*
The main method is the entry point of the Java program. 
It is a special method that the Java Virtual Machine (JVM) looks for when starting the program.
In Java, the main method, which serves as the entry point for the program, can be placed anywhere within the class body of the main class. There is no strict rule dictating whether it should be at the beginning or end of the class, as long as it is properly declared and defined.
We create an object of the 'PrimitiveDataTypes class' by using the 'new' keyword followed by the 'class name' and 'parentheses'. This creates an instance of the PrimitiveDataTypes class.
The created object is assigned to the variable 'primitiveDataTypes', which is of 'type PrimitiveDataTypes'. This variable serves as a reference to the newly created object.
We then call the 'printPrimitiveDataTypes' method on the primitiveDataTypes object using 'dot notation (.)'. This method call executes the code within the printPrimitiveDataTypes method of the PrimitiveDataTypes class.
In Java, you can have multiple classes in the same file, but only one of them can be public, and the filename must match the name of the public class.
*/

// Object creation in 'Cpp' vs 'Java':
/* 
C++:
    PrimitiveDataTypes primitiveDataTypes;
    primitiveDataTypes.printPrimitiveDataTypes();
  -In C++, you can directly create an object of a class using the class name followed by parentheses. The object is created on the 'stack'.

Java:
    PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();
    primitiveDataTypes.printPrimitiveDataTypes();
  -In Java, you use the 'new' keyword followed by the 'class name' and 'parentheses' to dynamically allocate memory for the object on the 'heap'. 
  -This is necessary because Java is managed by a garbage collector, so objects created using new will be automatically deallocated when they are no longer in use.
*/