public class MaxArrayValue{
    
    public static int[] nums = {23, 56, 47, 89, 90, 22, 91, 7};

    public static void maxValue(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        maxValue(nums);
    }
}