import java.util.*;

public class KPairSmallestSum {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < nums2.length; j++) {
                list.add(nums1[i], nums2[j]);
                System.out.println(list);
            }
            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 7, 11 };
        int[] arr2 = { 2, 4, 6 };
        System.out.println(kSmallestPairs(arr1, arr2, 3));
    }
}

// [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
