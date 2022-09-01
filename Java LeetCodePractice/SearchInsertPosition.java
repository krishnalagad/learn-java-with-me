import java.util.*;
import java.util.stream.*;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        // 1. if element exists in the input array i.e nums
        if (list.indexOf(target) != -1) {
            return list.indexOf(target);
        }

        // 2. if element doesn't exists in the input array and less than greatest
        // element in array
        for (int i : list) {
            if (i > target) {
                return list.indexOf(i);
            }
        }

        // 3. if element doesn't exists in the input array and less than greatest
        // element in array
        if (target > list.get(list.size() - 1)) {
            return list.size();
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        System.out.println(searchInsert(arr, 7));
    }
}
