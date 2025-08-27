import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 9, 8, 0, 6, 5, 4, 5, 2, 1, 2, 3, 3, 3, 3, 3, 7);

        long startTime = System.currentTimeMillis();
        numbers.stream()
                .mapToInt(num -> num + 1)
                .sum();
        long endTime = System.currentTimeMillis();

        System.out.println("Time required (without parallel): " + (endTime - startTime));

        long startTimeP = System.currentTimeMillis();
        numbers.stream()
                .mapToInt(num -> num + 1)
                .parallel()
                .sum();
        long endTimeP = System.currentTimeMillis();

        System.out.println("Time required (with parallel): " + (endTimeP - startTimeP));
    }
}