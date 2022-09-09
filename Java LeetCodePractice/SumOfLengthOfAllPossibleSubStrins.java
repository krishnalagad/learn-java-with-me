import java.util.Arrays;

public class SumOfLengthOfAllPossibleSubStrins {
    public static int uniqueLetterString(String s) {
        int n = s.length();
        int[] preIndex = new int[n];
        int[] nextIndex = new int[n];

        int[] index = new int[26];
        Arrays.fill(index, -1);
        for (int i = 0; i < n; i++) {
            int j = s.charAt(i) - 'A';
            preIndex[i] = index[j];
            index[j] = i;
        }
        Arrays.fill(index, n);
        for (int i = n - 1; i >= 0; i--) {
            int j = s.charAt(i) - 'A';
            nextIndex[i] = index[j];
            index[j] = i;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += (i - preIndex[i]) * (nextIndex[i] - i);
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(uniqueLetterString("LEETCODE"));
    }
}
