import java.util.*;
import java.util.stream.*;

public class OddSumSubArrays {
    static List<List<Integer>> printSubArray(int arr[]) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) { // This loop will select start element
            for (int j = i; j < n; j++) { // This loop will select end element
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) // This loop will print element from start to end
                    list.add(arr[k]);

                result.add(list);
                System.out.println();
            }
        }
        return result;
    }

    public static int numOfSubarrays(int[] arr) {
        List<List<Integer>> result = printSubArray(arr);

        System.out.println(result);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };
        System.out.println(numOfSubarrays(arr));
    }
}
