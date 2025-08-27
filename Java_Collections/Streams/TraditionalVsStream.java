import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStream {
    public static void main(String[] args) {
        List<Integer> vals = new ArrayList<Integer>();
        vals.add(10);
        vals.add(11);
        vals.add(12);
        vals.add(13);
        vals.add(14);
        vals.add(15);
        vals.add(16);

        int sum = vals.stream()
                    .filter(num -> num % 2 == 0)
                    .mapToInt(num -> num * num)
                    .sum();
        System.out.println("Sum of squares of even numbers (Java Streams): " + sum);
    }
}