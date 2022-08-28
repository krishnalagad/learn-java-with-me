import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianOfTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> list3 = new ArrayList<>();
        double result = 0.0;

        list3 = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        Collections.sort(list3);
        System.out.println(list3);

        // if list size is odd
        if (list3.size() % 2 != 0) {
            return (Double.valueOf(list3.get(list3.size() / 2)));
        }

        // if list size is even
        if (list3.size() % 2 == 0) {
            return ((Double.valueOf(list3.get(list3.size() / 2)))
                    + (Double.valueOf(list3.get((list3.size() / 2) - 1)))) / Double.valueOf(2);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2};
        int[] nums2 = { 3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
