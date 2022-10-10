import java.util.Arrays;

public class MaximunDIfference {
    public static int maximumGap(int[] nums) {
        if (nums.length < 2)
            return 0;

        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++)
            if ((nums[i + 1] - nums[i]) > count)
                count = (nums[i + 1] - nums[i]);

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 9, 1 };
        System.out.println(maximumGap(nums));
    }
}
