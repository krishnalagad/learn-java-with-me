import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    // 1. Approach 1
    // public static int findDuplicate(int[] nums) {
    //     return Arrays
    //             .stream(nums)
    //             .boxed()
    //             .collect(
    //                     Collectors.groupingBy(
    //                             Function.identity(),
    //                             Collectors.counting()))
    //             .entrySet()
    //             .stream()
    //             .filter(m -> m.getValue() > 1)
    //             .map(Map.Entry::getKey)
    //             .collect(Collectors.toList())
    //             .get(0);
    // }

    // 2. Approach 2
    // public static int findDuplicate(int[] nums) {
    //     Set<Integer> items = new HashSet<>();
    //     return Arrays
    //                 .stream(nums)
    //                 .boxed()
    //                 .filter(n -> !items.add(n))
    //                 .collect(Collectors.toList())
    //                 .get(0);
    // }

    // 3. Approach 3
    // public static int findDuplicate(int[] nums) {
    //     List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    //     return list
    //             .stream()
    //             .filter(n -> Collections.frequency(list, n) > 1)
    //             .collect(Collectors.toList())
    //             .get(0);
    // }

    // 4. Approach 4
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.contains(a)) {
                return a;
            }
            set.add(a);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 11, 12, 9 };
        System.out.println(findDuplicate(nums));
    }
}
