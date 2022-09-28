import java.util.*;

public class KthLargestElementString {
    public static String kthLargestNumber(String[] nums, int k) {
        int[] arr = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        return String.valueOf(arr[arr.length - k]);
    }

    // def kthLargestNumber(self, nums: List[str], k: int) -> str:
    //     heap, res = [], math.inf
    //     for num in nums:
    //         heappush(heap, -int(num))
    //     for i in range(min(len(heap), k)):
    //         res = -heappop(heap)
    //     return str(res)

    static public void main(String[] args) {
        String[] arr = { "623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};
        System.out.println(kthLargestNumber(arr, 3));
    }
}
