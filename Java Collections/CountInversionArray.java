import java.util.*;

public class CountInversionArray {
    public static int solve(int[] nums) {
        List<List<Integer>> resp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            for (int j = i; j < nums.length; j++)
                if (nums[i] > nums[j]) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j]);
                    resp.add(list);
                }

        return resp.size();
    }

    // main method
    public static void main(String[] args) {
        int[] nums = { 8, 4, 2, 1 };
        System.out.println(solve(nums));
    }
}
