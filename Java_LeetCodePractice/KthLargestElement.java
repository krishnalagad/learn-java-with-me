import java.util.*;
import java.util.stream.*;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k - 1);
    }

 
    static public void main(String[] args) {
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        System.out.println(findKthLargest(arr, 4));
    }
}
