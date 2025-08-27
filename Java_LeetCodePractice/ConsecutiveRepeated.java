import java.util.*;

public class ConsecutiveRepeated {
    public static int findConsecutiveRepeated(int[] arr) {
        Arrays.sort(arr);
        double max = 0;
        double count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count += 1;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return (int) max;
    }

    // main method.
    public static void main(String[] args) {
        int[] arr = { 9, 7, 8, 1, 2, 3, 6, 5 };
        System.out.println(findConsecutiveRepeated(arr));
    }
}
