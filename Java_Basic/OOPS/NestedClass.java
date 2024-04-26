// Nested Class
/*
Oops_NestedClass is OuterClass
 */
public class NestedClass {
  private int outerVariable;

  public NestedClass(int outerVariable) {
      this.outerVariable = outerVariable;
  }

  // Nested class
  public class InnerClass {
      private int innerVariable;

      public InnerClass(int innerVariable) {
          this.innerVariable = innerVariable;
      }

      public void display() {
          System.out.println("Outer variable: " + outerVariable);
          System.out.println("Inner variable: " + innerVariable);
      }
  }

  public static void main(String[] args) {
      // Creating an object of the outer class
      NestedClass outerObj = new NestedClass(10);

      // Creating an object of the inner class using the outer class object
      NestedClass.InnerClass innerObj = outerObj.new InnerClass(20);

      // Calling the display method of the inner class
      innerObj.display();
  }
}

/*
The NestedClass(OuterClass) contains an instance variable outerVariable and a nested class InnerClass.
The InnerClass contains an instance variable innerVariable and a method display() to print both outer and inner variables.
Inside the main method, an object of the outer class outerObj is created.
Then, using the outer class object, an object of the inner class innerObj is created.
Finally, the display() method of the inner class is called to print the values of both outer and inner variables.
 */
