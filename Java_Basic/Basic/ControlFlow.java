// Main class
public class ControlFlow {
  public static void main(String[] args) {

      System.out.println("WhileLoop");
      WhileLoop whileExample = new WhileLoop();
      whileExample.runWhileLoop();

      System.out.println("--------------");

      System.out.println("DoWhileLoop");
      DoWhileLoop doWhileExample = new DoWhileLoop();
      doWhileExample.runDoWhileLoop();

      System.out.println("--------------");

      System.out.println("ForLoop");
      ForLoop ForLoopExample = new ForLoop();
      ForLoopExample.runForLoop();
  }
}

class WhileLoop {
  public void runWhileLoop() {
      int i = 1;
      // while loop
      while (i <= 5) {
          System.out.println("Count is: " + i);
          i++;
      }
  }
}

class DoWhileLoop {
  public void runDoWhileLoop() {
      int i = 1;
      // do-while loop
      do {
          System.out.println("Count is: " + i);
          i++;
      } while (i > 5);
  }
}

class ForLoop {
  public void runForLoop() {
      // for loop
      for (int i = 5; i > 0; --i) {
          System.out.println("Count is: " + i);
      }
  }
}

