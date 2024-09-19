// Generic class (same as Template in c++)
/*
A generic class in Java is a class that can work with any data type. 
It allows you to define a class with placeholders for data types, which are specified when the class is instantiated. 
Generics provide type safety and enable code reusability by allowing you to create classes and methods that operate on different data types without having to rewrite the code for each type.

Declaration: 
To declare a generic class, you use angle brackets (<>) to specify one or more type parameters. 
These parameters represent the types that the class will work with. 
For example:
 ```java
 public class MyClass<T> {
     // Class definition goes here
 }
 ```

Type Parameters: 
Type parameters are placeholders for actual data types. 
They are usually represented by single uppercase letters, such as T, E, or K, but you can use any valid Java identifier. 
You can specify multiple type parameters separated by commas.

Instantiation: 
When you create an object of a generic class, you specify the actual data types to be used in place of the type parameters. 
For example:
    ```java
    MyClass<Integer> myObject = new MyClass<>();
    ```
    Here, Integer is the actual type used for the type parameter T.

Type Safety: 
Generics provide compile-time type safety, ensuring that you only use the correct data types with generic classes. 
This helps catch type-related errors at compile time rather than runtime.

Code Reusability: 
Generic classes promote code reusability by allowing you to write classes and methods that operate on different data types without duplicating code. 
This makes the code more maintainable and reduces redundancy.

Generic Methods: 
In addition to generic classes, Java also supports generic methods, which are methods that can accept and return generic types. 
Generic methods are declared similarly to generic classes but are defined within regular classes or interfaces.
*/

public class GenericClass<T> {
  private T content;

  public void setContent(T content) {
      this.content = content;
  }

  public T getContent() {
      return content;
  }

  public static void main(String[] args) {
    GenericClass<Integer> intBox = new GenericClass<>();
      intBox.setContent(10);
      System.out.println("Integer Box Content: " + intBox.getContent());

      GenericClass<String> strBox = new GenericClass<>();
      strBox.setContent("Hello, Generics!");
      System.out.println("String Box Content: " + strBox.getContent());
  }
}
