import java.util.Date;
import java.text.SimpleDateFormat;

public class DateClass {
  public static void main(String a[]){
    Date today1 = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

    String formattedDateOutput1 = formatter.format(today1);
    System.out.println(formattedDateOutput1);

    // New 2nd date
    // Date today2 = new Date();
    Date today2 = new Date(1550000000L);

    String formattedDateOutput2 = formatter.format(today2);
    System.out.println(formattedDateOutput2);

    // Compare dates(after/before)
    boolean isAfter = today1.after(today2);
    System.out.println(isAfter);
  }
}
