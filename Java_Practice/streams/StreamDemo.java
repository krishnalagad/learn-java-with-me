package streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Krishna", "Dilip", "Lagad");
        stringStream.forEach(System.out::println);

        // Used Supplier to use stream multiple times.
        Supplier<Stream<String>> suppStream = () -> Stream.of("a", "b", "c");
        suppStream.get().forEach(System.out::print);
        suppStream.get().forEach(System.out::print);
    }
}
