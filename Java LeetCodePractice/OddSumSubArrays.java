import java.util.*;

public class OddSumSubArrays {
    static List<List<Integer>> printSubArray(int arr[]) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++)
                    list.add(arr[k]);
                result.add(list);
            }
        return result;
    }

    public static int numOfSubarrays(int[] arr) {
        List<List<Integer>> result = printSubArray(arr);
        int answer = 0;
        for (List<Integer> list : result)
            if (((list.stream().mapToInt(Integer::intValue).sum()) % 2) != 0)
                answer += 1;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };
        System.out.println(numOfSubarrays(arr));
    }
}
