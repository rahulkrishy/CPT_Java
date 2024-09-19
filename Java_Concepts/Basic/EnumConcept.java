// Enums
/*
Enums, short for "enumerations," in Java are a special type of data type that allows for a variable to be a set of predefined constants. 
Enumerations make code more readable and maintainable by providing a way to represent a fixed set of constants.

Definition:
  -Enums are declared using the enum keyword in Java.
  -They can contain one or more constants, separated by commas.
  -Each constant represents an instance of the enum type and is implicitly declared as a public static final field within the enum.
Example:
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

Constants:
  -Enum constants are implicitly declared as public static final fields within the enum.
  -They are typically named using uppercase letters to distinguish them from regular variables.
  -Enum constants are accessed using the dot notation (Day.MONDAY, for example).

Methods:
  -Enums can contain methods, constructors, and fields like regular classes.
  -You can define custom methods within an enum to perform operations specific to the enum constants.

Ordinal and Values:
  -Each enum constant has an ordinal value, which represents its position in the enum declaration (starting from zero).
  -The ordinal() method returns the ordinal value of an enum constant.
  -The values() method returns an array containing all the enum constants in the order they are declared.
*/

// Define an enum representing different days of the week
enum Day {
  // Enum constants
  SUNDAY("Sunday"),
  MONDAY("Monday"),
  TUESDAY("Tuesday"),
  WEDNESDAY("Wednesday"),
  THURSDAY("Thursday"),
  FRIDAY("Friday"),
  SATURDAY("Saturday");

  // Enum fields
  private final String displayName;

  // Constructor to initialize enum fields
  Day(String displayName) {
      this.displayName = displayName;
  }

  // Method to get display name of the day
  public String getDisplayName() {
      return displayName;
  }

  // Static method to get enum constant by display name
  public static Day getByDisplayName(String displayName) {
      for (Day day : values()) {
          if (day.displayName.equals(displayName)) {
              return day;
          }
      }
      throw new IllegalArgumentException("Invalid display name: " + displayName);
  }
}

public class EnumConcept {
  public static void main(String[] args) {
      // Accessing enum constants
      Day today = Day.SATURDAY;
      System.out.println("Today is: " + today); // Output: SATURDAY

      // Using switch statement with enum
      switch (today) {
          case MONDAY:
          case TUESDAY:
          case WEDNESDAY:
          case THURSDAY:
          case FRIDAY:
              System.out.println("It's a weekday");
              break;
          case SATURDAY:
          case SUNDAY:
              System.out.println("It's a weekend");
              break;
      }

      // Accessing enum fields and methods
      System.out.println("Display name of SATURDAY: " + Day.SATURDAY.getDisplayName()); // Output: Saturday

      // Using static method to get enum constant by display name
      Day holiday = Day.getByDisplayName("Sunday");
      System.out.println("Holiday is: " + holiday); // Output: SUNDAY

       // Displaying ordinal and values of enum constants
       for (Day day : Day.values()) {
        System.out.println("Ordinal of " + day + ": " + day.ordinal()); // Output: Ordinal of DAY: 0, Ordinal of SATURDAY: 6
    }
  }
}
