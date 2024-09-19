package Calculator_System;

public class BasicCalculator implements Calculator {
  @Override
  public double add(double num1, double num2) {
      return num1 + num2;
  }

  @Override
  public double subtract(double num1, double num2) {
      return num1 - num2;
  }

  @Override
  public double multiply(double num1, double num2) {
      return num1 * num2;
  }

  @Override
  public double divide(double num1, double num2) {
      if (num2 == 0) {
          throw new ArithmeticException("Cannot divide by zero");
      }
      return num1 / num2;
  }
}
