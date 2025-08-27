package problems;

public class PivotIndex {
    private static int solution(int[] arr) {
        if (arr.length == 0) return 0;

        int total = 0;
        for (int num: arr) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];    // neglect current number
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index: " + solution(arr));
        System.out.println("Element at pivot index: " + arr[solution(arr)]);
    }
}
