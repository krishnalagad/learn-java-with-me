import java.util.*;
import java.util.stream.*;

public class LargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Set<Integer> result = new LinkedHashSet<Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length; j++) {
                if ((nums[i] % nums[j] == 0) || (nums[j] % nums[i] == 0)) {
                    result.add(nums[i]);
                    result.add(nums[j]);
                }
            }
        }
        return result.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8 };
        System.out.println(largestDivisibleSubset(arr));
    }
}
