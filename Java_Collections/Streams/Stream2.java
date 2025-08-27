import java.util.Arrays;
import java.util.List;

public class Stream2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 9, 8, 0, 6, 5, 4, 5);

        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)        // filter even numbers
                .map(num -> num * num)              // square each number
                .distinct()                         // reomve duplicate numbers
                .peek(System.out::println)          // peek into the stream (for debugging)
                .toList();                          // collect result into a list
        System.out.println("Squared numbers: " + result);

        long count = numbers.stream()
                .filter(num -> num > 5)             // filter numbers greater than 5
                .count();                           // count numbers greater than 5
        System.out.println("Count: " + count);

        int sum = numbers.stream()
            .mapToInt(Integer::intValue)            // convert Integer stream to IntStream
            .sum();                                 // Calculate sum
        System.out.println("Sum: " + sum);
    }
}