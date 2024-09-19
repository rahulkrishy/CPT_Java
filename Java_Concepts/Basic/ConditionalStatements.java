public class ConditionalStatements {
    public static void main(){
      int a = 7;
      int b = 8;
      byte c = 10;
  
      // conditional statement
      if(a>b && a>c)
        System.out.println("a is greater " + a);
      else if(b>c)
        System.out.println("b is greater " + b);
      else
        System.out.println("c is greater " + c);
  
    }
  }
