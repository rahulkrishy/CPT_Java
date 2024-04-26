// Reading input from User
/*
Reading input from the user in Java can be done using various methods provided by the Scanner class(commonly used) or BufferedReader class.

1)Using Scanner class:
The Scanner class, available in the java.util package, 
provides various methods to read different types of input from the user.

2) Using BufferedReader class:
The BufferedReader class, available in the java.io package, is used to 
read text from a character-input stream with efficiency and provides more flexibility than Scanner for reading large volumes of text.

-----

next(): Reads the next token (sequence of characters separated by whitespace) from the input. It stops reading when it encounters whitespace (space, tab, or newline). The newline character (Enter key) is not consumed and remains in the input buffer.
nextLine(): Reads the entire line of input until it encounters a newline character (Enter key). It consumes the newline character.
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Class to read user input using Scanner

class ScannerInputReader {
  void readInput() {
      @SuppressWarnings("resource")
      Scanner scanner = new Scanner(System.in);

      // Reading a string
      System.out.print("Enter a string (using Scanner): ");
      String inputString = scanner.nextLine();
      System.out.println("You entered: " + inputString);

      // Reading an integer
      System.out.print("Enter an integer (using Scanner): ");
      int inputInt = scanner.nextInt();
      System.out.println("You entered: " + inputInt);

      // Reading a floating-point number
      System.out.print("Enter a floating-point number (using Scanner): ");
      double inputDouble = scanner.nextDouble();
      System.out.println("You entered: " + inputDouble);

      // Closing the scanner
      // scanner.close(); //must use
  }
}

// Class to read user input using BufferedReader
class BufferedReaderInputReader {
  void readInput() throws IOException {

      // InputStreamReader in = new InputStreamReader(System.in);
      // BufferedReader reader = new BufferedReader(in);
      // OR 
      // OneLine Implementation of BufferReader
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      // Reading a string
      System.out.print("Enter a string (using BufferedReader): ");
      String inputString = reader.readLine();
      System.out.println("You entered: " + inputString);

      // Reading an integer
      System.out.print("Enter an integer (using BufferedReader): ");
      int inputInt = Integer.parseInt(reader.readLine());
      System.out.println("You entered: " + inputInt);

      // Reading a floating-point number
      System.out.print("Enter a floating-point number (using BufferedReader): ");
      double inputDouble = Double.parseDouble(reader.readLine());
      System.out.println("You entered: " + inputDouble);

      // Closing the BufferedReader
      // reader.close();
  }
}

// Main class to demonstrate both methods of reading user input
public class ReadingUserInput {
  public static void main(String[] args) throws IOException {
    ScannerInputReader scannerReader = new ScannerInputReader();
    scannerReader.readInput();

    BufferedReaderInputReader bufferedReaderReader = new BufferedReaderInputReader();
    bufferedReaderReader.readInput();
  }
}
