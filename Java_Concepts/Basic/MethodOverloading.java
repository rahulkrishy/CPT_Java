// Main class
public class MethodOverloading {
  public static void main(String[] a){
    MethodOverloadingCalculator obj = new MethodOverloadingCalculator();

    // Call the methods
    System.out.println("Sum of 5 and 7: " + obj.add(5, 7));
    System.out.println("Sum of 2, 3, and 4: " + obj.add(2, 3, 4));
    System.out.println("Sum of 2.5 and 3.7: " + obj.add(2.5, 3.7));
    System.out.println("Sum of 1.1, 2.2, and 3.3: " + obj.add(1.1, 2.2, 3.3));
  }
}

class MethodOverloadingCalculator 
{
  // Method to add two integers
  public int add(int a, int b) {
      return a + b;
  }

  // Method to add three integers
  public int add(int a, int b, int c) {
      return a + b + c;
  }

  // Method to add two doubles
  public double add(double a, double b) {
      return a + b;
  }

  // Method to add three doubles
  public double add(double a, double b, double c) {
      return a + b + c;
  }

}
