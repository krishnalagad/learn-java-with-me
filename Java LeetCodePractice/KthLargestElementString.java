import java.util.*;

public class KthLargestElementString {
    public static String kthLargestNumber(String[] nums, int k) {
        int[] arr = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        return String.valueOf(arr[arr.length - k]);
    }

    public static void main(String[] args) {
        String[] arr = { "623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};
        System.out.println(kthLargestNumber(arr, 3));
    }
}
