// Sorting: Comparable_vs_Comparator
/*
Comparable provides a way for objects of a class to define their natural ordering, 
while Comparator allows for custom sorting logic to be applied externally to objects of a class

Comparable Interface:
  - Comparable is an interface in Java that defines a single method compareTo().
  - It allows objects of a class to be sorted automatically based on their natural ordering.
  - The class whose objects need to be sorted must implement the Comparable interface and override the compareTo() method to define the natural ordering of its objects.
  - The compareTo() method returns a negative integer, zero, or a positive integer if the current object is less than, equal to, or greater than the specified object, respectively.
  - The natural ordering is defined by the class itself, which means the sorting logic is embedded within the class.
  - Examples of classes that implement Comparable include String, Integer, and other wrapper classes.

Comparator Interface:
  - Comparator is a functional interface in Java that defines a single method compare().
  - It provides an external comparison logic separate from the class whose objects need to be sorted.
  - Classes that implement Comparator can define multiple comparison strategies.
  - Comparator objects can be passed to sorting methods to customize the sorting order.
  - Comparator is useful when:
  - Sorting objects of classes that do not implement Comparable.
  - Customizing the sorting order of classes that do implement Comparable.
  - Comparator allows for flexibility in sorting logic without modifying the class being sorted.
  - Comparator objects can be used for sorting, searching, and other operations.
  - Examples of classes that use Comparator for sorting include Collections.sort(), Arrays.sort(), etc.
*/

import java.util.*;

// Class representing a Book
class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    // Implementing Comparable interface to define natural ordering based on pageCount
    @Override
    public int compareTo(Book other) {
        return this.pageCount - other.pageCount;
    }

    // Overriding toString() for better output representation
    @Override
    public String toString() {
        return "Book{title='" + title + "', pageCount=" + pageCount + "}";
    }
}

// Comparator for sorting books based on title
class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle()); // return 1:swap, -1:UnSwap 
    }
}

public class Comparable_vs_Comparator {
    public static void main(String[] args) {
        // Creating a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 500));
        books.add(new Book("Python Basics", 400));
        books.add(new Book("C++ Essentials", 350));

        // Sorting books based on natural ordering (pageCount)
        System.out.println("Books sorted by pageCount (natural ordering):");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }

        // Sorting books based on title using Comparator
        System.out.println("\nBooks sorted by title:");
        Collections.sort(books, new TitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

/*
The Book class implements the Comparable<Book> interface to define natural ordering based on the number of pages (pageCount).
The TitleComparator class implements the Comparator<Book> interface to define a custom sorting order based on the book titles.
In the main method, we create a list of Book objects and demonstrate sorting using both natural ordering and the custom comparator.
*/
