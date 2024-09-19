// multi-dimensional array
/*
A multi-dimensional array in Java is an array of arrays, or, more generally, an array of arrays of arrays, and so on. 
It allows you to represent data in multiple dimensions, such as rows and columns in a table or a matrix.

Declaration Syntax:
dataType[][] arrayName; // Two-dimensional array
dataType[][][] arrayName; // Three-dimensional array
// and so on...

Initialization Syntax:
dataType[][] arrayName = {
    {value1, value2, ...}, // First row
    {value3, value4, ...}, // Second row
    // Additional rows...
};

To access elements of a multi-dimensional array using multiple indices. 
For a two-dimensional array, you specify the row index followed by the column index.
*/

public class Array_2D {
  public static void main(String[] a){
    int[][] TwoDimArray = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

  for (int i = 0; i < TwoDimArray.length; i++) { // Iterate over each row index
    for (int j = 0; j < TwoDimArray[i].length; j++) { // Iterate over each column index in the current row
        System.out.print(TwoDimArray[i][j] + " "); // Print the element at row i and column j
    }
    System.out.println(); // Move to the next line after printing all elements of the current row
  }

  System.out.println("----------");

  int[][] TwoDimArray2 = new int[3][3];

  // Assigning Random values
  for (int i = 0; i < TwoDimArray2.length; i++) { // Iterate over each row index
    for (int j = 0; j < TwoDimArray2[i].length; j++) { // Iterate over each column index in the current row
        TwoDimArray2[i][j] = (int)(Math.random() * 10); // It returns a random double value greater than or equal to 0.0 and less than 1.0. multiply the result of Math.random() by 10 to range (0-10), type casted to convert to an integer.
    }
  }

  // Enhanced for loop
  for (int arr[] : TwoDimArray2) { // Iterate over each row in the two-dimensional array
    for (int ele : arr) {        // Iterate over each element in the current row
        System.out.print(ele + " "); // Print the element followed by a space
    }
    System.out.println(); // Move to the next line after printing all elements of the current row
  }

  System.out.println("----------");

  int[][] jaggedArray = new int[3][]; // Create a jagged array with 3 rows
  jaggedArray[0] = new int[4];   // First row has 4 elements
  jaggedArray[1] = new int[2];   // Second row has 2 elements
  jaggedArray[2] = new int[5];   // Third row has 5 element

  // Assigning Random values in jagged array
  for (int i = 0; i < jaggedArray.length; i++) { 
    for (int j = 0; j < jaggedArray[i].length; j++) { 
        jaggedArray[i][j] = (int)(Math.random() * 10); 
    }
  }

  for (int arr[] : jaggedArray) { 
    for (int ele : arr) {        
        System.out.print(ele + " "); 
    }
    System.out.println(); 
  }
  
  }
}
