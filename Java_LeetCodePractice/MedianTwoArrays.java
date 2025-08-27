import java.util.Arrays;

public class MedianTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // merging two arrays
        int len = (nums1.length) + (nums2.length);
        int[] result = new int[len];
        int pos = 0;
        double median = 0;

        for (int i : nums1) {
            result[pos] = i;
            pos++;
        }

        for (int i : nums2) {
            result[pos] = i;
            pos++;
        }

        Arrays.sort(result);
        for (int i : result) {
            System.out.print(i + " ");
        }

        // if total elements is odd number
        if ((result.length) % 2 != 0) {
            // int mid = Math.floor(((result.length) / 2));
            int mid = ((result.length) / 2);
            median = Double.valueOf(result[mid]);
        }

        // if total elements is even number
        if ((result.length) % 2 == 0) {
            System.out.println("\n" + result.length);
            int mid = ((result.length) / 2);
            System.out.println(result[mid - 1] + "   " + result[mid]);
            median = (((Double.valueOf(result[mid-1])) + (Double.valueOf(result[mid]))) / (Double.valueOf(2)));
        }

        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 4 };
        // findMedianSortedArrays(nums1, nums2);
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}