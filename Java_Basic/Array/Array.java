// Array:
/* 
Definition: 
    An array is a fixed-size collection of elements of the same data type arranged in a sequential order. 
    Each element in an array is accessed by its index.

Characteristics:
    Arrays have a fixed size that is determined at the time of array creation and cannot be changed dynamically.
    Array elements are stored in contiguous memory locations, allowing for efficient access using index-based retrieval.
    Array indices start from 0 and go up to length - 1, where length is the size of the array.

Declaration Syntax:
    dataType[] arrayName; // Preferred syntax
    // OR
    dataType arrayName[]; // Alternate syntax (less common)

Ways to Declare and Use Arrays:

1) Declaration and Initialization in One Step:
int[] numbers = {1, 2, 3, 4, 5}; // Initialize array with values

2) Declaration and Initialization in Two Steps:
int[] numbers;
numbers = new int[]{1, 2, 3, 4, 5}; // Initialize array after declaration

3) Empty Array Declaration:
int[] numbers = new int[5]; // Create an array of size 5 with default values (0 for int)

4) Accessing Array Elements:
int[] numbers = {1, 2, 3, 4, 5};
int firstElement = numbers[0]; // Accessing the first element
int lastElement = numbers[numbers.length - 1]; // Accessing the last element

5) Looping Through Array Elements:
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]); // Print each element
}

6) Enhanced For Loop (For-each Loop):
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num); // Print each element
}

*/
import java.util.Arrays;

public class Array {
  public static void main(String[] a){

    // Declaration and Initialization in One Step
    int[] numArray1 = {1,2,3,4,5}; // Initialize array with values
    for (int i = 0; i < numArray1.length; i++) {
        System.out.println(i + " : " + numArray1[i]); // Print each element
    }

    System.out.println("----------------");

    // Declaration and Initialization in Two Steps:
    int[] numArray2; 
    numArray2 = new int[] {8,6,10,7,9}; // Initialize array after declaration

    Arrays.sort(numArray2); //Sort the array with inBuild Arrays sort method

    int index = 0;
    for(int i : numArray2){
        System.out.println(index + " : " + i);
        index++;
    } 

    System.out.println("----------------");

    // Array Copy(InBuild Method())

    int[] copyFrom = new int[] {11, 12, 13, 14, 15};
    int[] copyInto = new int[copyFrom.length];
    System.arraycopy (copyFrom, 0, copyInto, 0, copyFrom. length);
    for (int i = 0; i < copyInto.length; i++) {
        System.out.println (copyInto[i]);
      }

    System.out.println("----------------");

    // Min Max Array
    MinMaxArray run = new MinMaxArray();
    int[] result = run.findMinMax(numArray1);
    // Print the array without using loops
    System.out.println(Arrays.toString(result));

  }
}

class MinMaxArray {
    public int[] findMinMax(int[] arr)  //return type of array int[]
    {
        // Initialize min and max to the first element in the array
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // If the current element is smaller than min then assign min to it
            if (arr[i] < min) {
                min = arr[i];
            }
            // If the current element is larger than max then assign max to it
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // return a new integer array that contains min and max
        return new int[] {min, max};
    }
}

/* 
numArray1:
In numArray1, the array is declared and initialized in a single step. This is called an "array initializer" syntax. 
Here, the compiler automatically determines the size of the array based on the number of elements provided within the curly braces {}. 
It's a concise way to create and initialize arrays.

numArray2:
In numArray2, the array is declared first using int[] numbers;, but it is not initialized yet. 
Then, in the next line, the array is initialized using the new keyword. Here, the new keyword is used to explicitly allocate memory for the array on the heap. 
It's necessary when the size of the array is not known at compile-time or when you want to separate the declaration and initialization steps.
The array size is explicitly specified with new int[]{...}, allowing more flexibility in determining the size dynamically or based on other factors at runtime.

//Drawbacks of array:
-Fixed Size: Arrays have a fixed size, which cannot be changed dynamically after initialization.
-Homogeneous Data: Arrays can only store elements of the same data type.
-Inefficient Insertion/Deletion: Insertion or deletion of elements in the middle of an array can be inefficient, requiring shifting of elements.
-No Built-in Methods: Arrays lack built-in methods for common operations like sorting, searching, or resizing.

// System.arrayCopy() 
The System.arrayCopy() method in Java is used to copy elements from one array to another. 
It provides a fast and efficient way to copy array contents, whether it's a complete array or a portion of it.

public static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)

Parameters:
src: The source array from which elements are to be copied.
srcPos: The starting position in the source array from where elements will be copied.
dest: The destination array to which elements will be copied.
destPos: The starting position in the destination array where elements will be copied.
length: The number of elements to be copied.

Notes:
Both src and dest must be arrays of the same type.
The starting positions srcPos and destPos are zero-based indices.
The length parameter determines the number of elements to copy.
The src array is not modified by this operation.

//Findings:
--
int[] numArray2 = new int[5]; // Allocate memory for an array of size 5
numArray2 = {6, 7, 8, 9, 10}; // Initialize the array with values {6, 7, 8, 9, 10}
this approach is not valid when you have already declared and instantiated the array using new int[5]. 
In Java, you can't use the array initializer syntax directly after assigning a new array reference to the same variable.
Only Use Direct Initialization or Indirect Initialization.
--
*/
