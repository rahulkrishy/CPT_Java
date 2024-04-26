// Stream API
/*
1. Introduction to Streams:
    - Streams represent a sequence of elements that support aggregate operations on collections, such as filtering, mapping, and reducing.
    - They do not modify the original data source; instead, they allow operations to be performed on the elements of the source data.One stream can only used once, to use them first we need need assign to new stream and operate it.
    - Unlike collections, streams do not store elements; they provide a way to process elements from a source (e.g., a collection, array, or I/O channel) on-demand.

2. Creating Streams:
    - Streams can be created from various sources, including collections, arrays, I/O channels, and generator functions.
    - Common methods to create streams include stream() and parallelStream() for collections, Arrays.stream() for arrays, and Files.lines() for I/O channels.

3. Intermediate and Terminal Operations:
    - Stream operations are categorized into intermediate and terminal operations:
        a. Intermediate operations: These operations transform the stream into another stream, allowing for filtering, mapping, sorting, etc. Examples include filter(), map(), sorted(), etc.
        b. Terminal operations: These operations produce a result or side-effect and terminate the stream. Examples include forEach(), collect(), reduce(), etc.

4. Stream Pipeline:
    - Stream operations can be combined to form a stream pipeline, where the result of one operation is passed as input to the next operation.
    - Stream pipelines typically consist of zero or more intermediate operations followed by a terminal operation.

5. Lazy Evaluation:
    - Streams use lazy evaluation, meaning intermediate operations are not evaluated until a terminal operation is invoked.
    - Lazy evaluation allows for optimized processing, as only elements that are necessary for the result are computed.

6. Parallel Streams:
    - Streams can be processed sequentially or in parallel, depending on the source and requirements.
    - Parallel streams leverage multiple threads to perform operations concurrently, potentially improving performance on multi-core processors.
    - Parallelism can be enabled using the parallel() method on streams or by using parallel stream sources like parallelStream().

7. Reduction Operations:
    - Reduction operations combine the elements of a stream into a single result, such as summing, averaging, or finding the maximum element.
    - Common reduction operations include reduce(), collect(), sum(), average(), max(), min(), etc.

8. Collectors:
    - Collectors are specialized reduction operations that collect elements from a stream into a mutable result container, such as a collection or a map.
    - Common collectors include toList(), toSet(), toMap(), joining(), groupingBy(), partitioningBy(), etc.

9. Error Handling:
    - Stream operations can throw checked exceptions, which must be handled appropriately using try-catch blocks or by propagating them to the caller.

10. Performance Considerations:
    - While streams offer concise and expressive code, improper use of streams can lead to performance overhead, especially when dealing with large datasets or complex operations.
    - It's essential to understand the characteristics of stream operations and consider performance implications when designing stream pipelines.

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcept {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Intermediate operations: filter, map, sorted
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0) // Filter even numbers
                                           .map(n -> n * 2) // Double each even number
                                           .sorted() // Sort the numbers
                                           .collect(Collectors.toList()); // Terminal operation: collect to list

        System.out.println("Even numbers (doubled and sorted): " + evenNumbers);

        // Lazy evaluation: not computed until terminal operation is invoked
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily", "Frank");

        System.out.println("First three names:");
        names.stream()
             .limit(3) // Limit to first three names
             .forEach(System.out::println); // Terminal operation: print each name

        // Parallel streams: processing in parallel
        List<Integer> squares = numbers.parallelStream()
                                      .map(n -> n * n) // Square each number
                                      .collect(Collectors.toList());

        System.out.println("Squares of numbers (processed in parallel): " + squares);

        // Reduction operation: sum
        int sum = numbers.stream()
                         .reduce(0, Integer::sum); // Terminal operation: reduce to sum
        System.out.println("Sum of numbers: " + sum);

        // Collectors: groupingBy
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Group fruits by their first letter
        System.out.println("Fruits grouped by first letter:");
        fruits.stream()
              .collect(Collectors.groupingBy(s -> s.charAt(0))) // Group by first letter
              .forEach((letter, group) -> System.out.println(letter + ": " + group));
    }
}
