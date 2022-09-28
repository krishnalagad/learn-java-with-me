import java.util.*;
import java.util.stream.*;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        System.out.println(findKthLargest(arr, 4));
    }
}
