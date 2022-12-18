import java.util.*;

public class LongestConsecutiveSequence {
    private static int longestConsecutive(int[] arr) {
        if (arr.length == 0)
            return 0;

        Arrays.sort(arr);
        int currSequence = 1;
        int longSequence = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == arr[i - 1] + 1) {
                    currSequence += 1;
                } else {
                    longSequence = Math.max(longSequence, currSequence);
                    currSequence = 1;
                }
            }
        }
        return Math.max(longSequence, currSequence);
        // return longSequence;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 23, 34, 45, 56, 11, 12, 13, 43, 14, 87, 15, 86, 45, 85, 78, 84, 83, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(longestConsecutive(arr));
    }
}