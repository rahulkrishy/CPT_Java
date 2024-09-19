public class TernaryOperator {
  public static void main(String[] args){
    int a = 8;
    int b = 9;
    byte c = 7;
    
    // Ternary Operator
    System.out.println("Largest: " + ((a>b&&a>c)?a:(b>c)?b:c) );
  }
}
