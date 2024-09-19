package Calculator_System;

public class AdvancedCalculator extends BasicCalculator {

  public double power(double base, double exponent) {
      return Math.pow(base, exponent);
  }

  public double squareRoot(double num) {
      return Math.sqrt(num);
  }

  public double factorial(int num) {
      if (num < 0) {
          throw new IllegalArgumentException("Factorial is not defined for negative numbers");
      }
      if (num == 0 || num == 1) {
          return 1;
      }
      return num * factorial(num - 1);
  }
  
}

