import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class BinarySearchMethod {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        int index = Collections.binarySearch(list, 2112);
        System.out.println(index);
    }
}
