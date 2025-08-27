package problems;

import java.util.Arrays;
import java.util.List;

public class PrefixSum {
    static private int[] solution(int[] arr) {
        if (arr.length == 0) return new int[] {0};
        int length = arr.length;
        int[] prefixSum = new int[length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    static private int getSum(int[] prefixSum, int left, int right) {
        if (left == 0) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 2, 10};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
