package problems;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        if (arr.length == 0) return;
        
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        if (arr.length == 0) return;

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Before reverse:");
        printArray(arr);

        System.out.println("\nAfter reverse:");
        reverseArray(arr);
        printArray(arr);
    }
}
