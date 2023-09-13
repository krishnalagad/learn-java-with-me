import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class BinarySearchMethod {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, 100);
        System.out.println(index);
    }
}
