import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Krishna", "Dilip", "Lagad");
        names.forEach(System.out::println);
        names.stream()
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);

        System.out.println();
        List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        nestedList.stream()
                .flatMap(List::stream)
                .map(val -> val * 2)
                .toList()
                .forEach(System.out::println);
    }
}