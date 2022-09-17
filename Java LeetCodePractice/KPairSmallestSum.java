import java.util.*;
import java.util.stream.*;

public class KPairSmallestSum {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums1[i]);
                list.add(nums2[j]);
                ans.add(list);
            }
        }
        // Approach 1 : to get first n elements from list.
        // return ans.subList(0, k);

        // Approach 2 : to get first n elements from list using stream.
        return ans.stream().limit(k).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2 };
        int[] arr2 = { 1, 2, 3 };
        System.out.println(kSmallestPairs(arr1, arr2, 3));
    }
}

// [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
