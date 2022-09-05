import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        return Arrays
                .stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .get(0);
    }

    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 11, 12, 9 };
        System.out.println(findDuplicate(nums));
    }
}
