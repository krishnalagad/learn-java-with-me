import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        Integer[] obj = {1, 2, 3, 4, 5, 6};
        Stream<Integer> intStream = Stream.of(obj);
        intStream.forEach(System.out::println);
    }
}