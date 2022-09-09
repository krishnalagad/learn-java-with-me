import java.util.*;
import java.util.stream.*;

public class Convert2DArrayToList {
    /**
     * @param arr
     */
    // public static void convertToList(int[][] arr) {
    //     final List<Integer> list = Arrays.stream(arr) // 'array' is two-dimensional
    //             .flatMap(Arrays::stream)
    //             .collect(Collectors.toList());

    // }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // convertToList(arr);
    }
}
