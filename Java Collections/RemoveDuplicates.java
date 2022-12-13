import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    /**
     * @param arr: input array
     * @return duplicates removed array
     */
    public static int[] removeDuplicatedUsingSet(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        // int i = 0;
        // int[] temp = new int[set.size()];
        // for (int a : set) {
        // temp[i++] = a;
        // }
        // return temp;
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // using set collection
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 7, 8, 8, 9, 1, 3 };
        int[] arr1 = removeDuplicatedUsingSet(arr);
        System.out.println();
        for (int a : arr1) {
            System.out.print(a + " ");
        }
    }
}