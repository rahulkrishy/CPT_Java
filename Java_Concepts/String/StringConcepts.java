// String
/*
In Java, the String class represents a sequence of characters. 
It's widely used for storing and manipulating textual data.
1)Immutable:
    -Strings in Java are immutable, meaning their values cannot be changed once they are created.
    -When you modify a string (e.g., through concatenation or substring operations), a new string object is created in memory.
2)Declaration and Initialization:
    -You can create a string using either a string literal or by creating a String object.
    -String literals are enclosed in double quotes (" ").
    String str1 = "Hello"; // Using a string literal
    String str2 = new String("World"); // Using a String object
3)String Literals vs. String Objects:
    -String literals are stored in the string pool and are automatically interned (reused).
    -String objects created using the new keyword are stored in the heap memory and are not interned.
    String str1 = "Hello"; // Literal (in string pool)
    String str2 = new String("Hello"); // Object (in heap)
4)String Pool:
    -Java maintains a "string pool" to store unique string literals.
    -When you create a string using a string literal, Java checks the string pool to see if the same string already exists. 
    -If it does, it returns a reference to the existing string, otherwise, it creates a new string in the pool.
    String str1 = "Hello"; // Created in the string pool
    String str2 = "Hello"; // Reuses the same string from the pool
5)String Concatenation:
    -You can concatenate strings using the + operator or the concat() method.
    String greeting = "Hello";
    String name = "Alice";
    String message = greeting + ", " + name + "!"; // Using +
    String result = greeting.concat(", ").concat(name).concat("!"); // Using concat() method
6)String Methods:
    -The String class provides numerous methods for performing various operations on strings, such as:
    length(): Returns the length of the string.
    charAt(int index): Returns the character at the specified index.
    substring(int beginIndex): Returns a substring starting from the specified index.
    indexOf(String str): Returns the index of the first occurrence of the specified substring.
    toUpperCase(), toLowerCase(): Returns a string with all characters converted to upper or lower case, respectively.
    Format Method: (Format specifier) String.format()
    %s - String
    %d - Decimal integer
    %f - Floating-point number
    %t - Date/time
    %b - Boolean
    %c - Character
    %n - Newline
    %o - Octal number
    %x - Hexadecimal number
    %e - Scientific notation

7)String Comparison:
    -Use the equals() method to compare the contents of two strings for equality.
    -Use the compareTo() method to compare strings lexicographically.
    String str1 = "hello";
    String str2 = "Hello";
    boolean isEqual = str1.equals(str2); // false
    int comparisonResult = str1.compareTo(str2); // > 0
8)String Manipulation:
    -You can manipulate strings using methods like replace(), trim(), split(), startsWith(), endsWith(), etc.
    String sentence = "   Java is awesome!   ";
    String trimmedSentence = sentence.trim(); // Removes leading and trailing whitespace
    String[] words = trimmedSentence.split("\\s+"); // Splits the sentence into words
9)Mutable string: StringBuilder and StringBuffer:
    -For mutable string manipulation, use StringBuilder (not thread-safe) or StringBuffer (thread-safe).
    -These classes provide methods like append(), insert(), delete(), reverse(), etc., for modifying string contents efficiently.

------------------------------------------------------------

String Constant Pool (SCP):
In Java, the String Constant Pool (SCP) is a special area in the heap memory that stores unique instances of string literals. 
It is a memory optimization technique used by the Java Virtual Machine (JVM) to conserve memory and improve performance.
the String Constant Pool in the heap is a special area where unique instances of string literals are stored, promoting memory efficiency and string reusability in Java applications.

1)Storage of String literals:
    -When you create a string using a string literal (e.g., "Hello"), Java checks if the string already exists in the SCP.
    -If the string is not found, a new instance is created in the SCP, and its reference is returned.
    -If the string is found, the existing instance's reference is returned instead of creating a new one.
2)Immutability and Reusability:
    -Strings in the SCP are immutable, meaning their values cannot be changed after creation.
    -Since strings are immutable, they can be safely shared among multiple variables and threads without the risk of modification.
    -This immutability property allows strings to be reused efficiently, reducing memory consumption.
3)Benefits:
    -Memory Efficiency: By storing unique string literals in a single location, the SCP reduces memory usage by avoiding duplicate string instances.
    -Performance: String comparisons and interned string lookups are faster because the JVM can compare references instead of comparing the content of strings.
4)Garbage Collection:
    -Strings in the SCP are eligible for garbage collection only if there are no references to them.
    -String objects created using the new keyword (e.g., new String("Hello")) are not stored in the SCP and are subject to normal garbage collection rules.

------------------------------------------------------------

Immutable Strings:
    -In Java, strings created using the String class are immutable by default, meaning their values cannot be changed after creation.
    -Any operation that appears to modify a string, such as concatenation or substring creation, actually creates a new string object rather than modifying the existing one.
    -Immutable strings offer several advantages, including simplicity, thread safety, and enhanced security.
    -Immutable strings are inherently thread-safe because they cannot be modified, making them suitable for use in multithreaded environments without synchronization concerns.

Mutable strings: 
StringBuffer and StringBuilder
1)StringBuffer:
    -StringBuffer is a thread-safe, mutable sequence of characters.
    -It provides synchronized methods to ensure thread safety, making it suitable for 'use in multithreaded environments'.
    -Operations like appending, inserting, deleting, and replacing characters in a StringBuffer are synchronized, ensuring that multiple threads can safely modify its contents concurrently.
2)StringBuilder:
    -StringBuilder is similar to StringBuffer, but it is not thread-safe.
    -Unlike StringBuffer, StringBuilder does not provide synchronized methods. Consequently, it offers better performance in 'single-threaded environments' because it avoids the overhead of synchronization.
    -StringBuilder is ideal for situations where thread safety is not a concern, such as when the string manipulation is performed within a single thread.
------------------------------------------------------------
    */


// Main class
public class StringConcepts {
  public static void main(String[] args) {
      // 1. Declaration and Initialization
      StringDeclarationInitialization.demo();
      
      // 2. String Literals vs. String Objects
      StringLiteralsVsObjects.demo();
      
      // 3. String Concatenation
      StringConcatenation.demo();
      
      // 4. String Methods
      StringMethods.demo();
      
      // 5. String Comparison
      StringComparison.demo();
      
      // 6. String Manipulation
      StringManipulation.demo();
      
      // 7. StringBuffer and StringBuilder
      StringBufferAndStringBuilder.demo();
  }
}

// Class to demonstrate Declaration and Initialization of Strings
class StringDeclarationInitialization {
  public static void demo() {
      // Declaration and Initialization
      String str1 = "Hello"; // Using string literal
      String str2 = new String("World"); // Using String object
      System.out.println("String 1: " + str1);
      System.out.println("String 2: " + str2);
  }
}

// Class to demonstrate String Literals vs. String Objects
class StringLiteralsVsObjects {
  public static void demo() {
      String str1 = "Hello"; // String literal (in String pool)
      String str2 = new String("Hello"); // String object (in heap)
      System.out.println("String 1 == String 2? " + (str1 == str2)); // false
  }
}

// Class to demonstrate String Concatenation
class StringConcatenation {
  public static void demo() {
      String str1 = "Hello";
      String str2 = "World";
      String result = str1 + " " + str2;
      System.out.println("Concatenated String: " + result);
  }
}

// Class to demonstrate String Methods
class StringMethods {
  public static void demo() {
      String str = "Hello World";
      int num = 37;
      String isEmpty = "   ";
      System.out.println("Length: " + str.length());
      System.out.println("Substring: " + str.substring(6));
      System.out.println("Index of 'o': " + str.indexOf('o'));
      System.out.println("To Upper Case: " + str.toUpperCase());
      System.out.println("To Lower Case: " + str.toLowerCase());
      System.out.println(String.format("!! Welcome %d %s !!", num,str));
      System.out.println("isEmpty: "+isEmpty.trim().isEmpty());
  }
}

// Class to demonstrate String Comparison
class StringComparison {
  public static void demo() {
      String str1 = "hello";
      String str2 = "Hello";
      System.out.println("String Comparison: " + str1.equals(str2)); // false
  }
}

// Class to demonstrate String Manipulation
class StringManipulation {
  public static void demo() {
      String str = "   Java is awesome!   ";
      String trimmed = str.trim();
      String[] words = trimmed.split("\\s+");
      for (String word : words) {
          System.out.println("Word: " + word);
      }
  }
}

// Class to demonstrate StringBuffer and StringBuilder
class StringBufferAndStringBuilder {
  public static void demo() {
      // StringBuffer (Thread-safe)
      StringBuffer stringBuffer = new StringBuffer("Hello");
      stringBuffer.append(" World");
      System.out.println("StringBuffer: " + stringBuffer.toString());
      
      // StringBuilder (Not thread-safe)
      StringBuilder stringBuilder = new StringBuilder("Hello");
      stringBuilder.append(" World");
      System.out.println("StringBuilder: " + stringBuilder.toString());
  }
}

