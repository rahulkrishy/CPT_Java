package Calculator_System;

public class CalculatorMain {
  public static void main(String[] args) {
      BasicCalculator basicCalculator = new BasicCalculator();
      AdvancedCalculator advancedCalculator = new AdvancedCalculator();

      // Basic Calculator Operations
      System.out.println("Basic Calculator:");
      System.out.println("Addition: " + basicCalculator.add(10, 5));
      System.out.println("Subtraction: " + basicCalculator.subtract(10, 5));
      System.out.println("Multiplication: " + basicCalculator.multiply(10, 5));
      System.out.println("Division: " + basicCalculator.divide(10, 5));

      // Advanced Calculator Operations
      System.out.println("\nAdvanced Calculator:");
      System.out.println("Power: " + advancedCalculator.power(2, 3));
      System.out.println("Square Root: " + advancedCalculator.squareRoot(16));
      System.out.println("Factorial: " + advancedCalculator.factorial(5));
  }
}

