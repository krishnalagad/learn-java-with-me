package problems;

public class ArrayAndZero {
    static private int[] solution(int[] arr){
        if (arr.length == 0) return new int[] {0};
        int fix = 0;
        for (int moving = 0; moving < arr.length; moving++) {
            if (arr[moving] != 0) {
                arr[fix] = arr[moving];
                ++fix;
            }
        }
        for (int i = fix; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 0, 0, 9, 2, 0};
        for (int num: solution(arr)) {
            System.out.print(num + " ");
        }
    }
}
