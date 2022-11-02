import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class BinarySearchMethod {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println();
        int index = Arrays.binarySearch(arr, 10001);
        System.out.println(index);
    }
}
