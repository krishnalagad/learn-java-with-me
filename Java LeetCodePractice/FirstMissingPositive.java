public class FirstMissingPositive {
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                flag = true;
            }
            if (arr[i] < 1 || n < arr[i]) {
                arr[i] = 1;
            }
        }
        if (flag == false) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]);
            arr[idx - 1] = -Math.abs(arr[idx - 1]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
    
    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(nums));
    }
}
