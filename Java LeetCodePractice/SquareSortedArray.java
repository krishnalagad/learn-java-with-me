import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class SquareSortedArray {
    public static int[] sortedSquares(int[] nums) {
        Function<Integer, Integer> square = x -> x * x;
        List<Integer> list = Arrays.stream(nums).boxed().map(square).collect(Collectors.toList());
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = { -7, -3, 2, 3, 11 };
        arr = sortedSquares(arr);
        for(int i: arr)
            System.out.print(i + " ");
    }
}
