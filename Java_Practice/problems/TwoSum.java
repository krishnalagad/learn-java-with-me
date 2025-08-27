package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TwoSum {
    private static int[] solution(int[] arr, int target) {
        if (arr.length == 0) return new int[] {0, 0};
        Map<Integer, Integer> map = new HashMap<>();    // Stores arr element and its index.

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp), i};    // returns index of element & current i value.
            }
            map.put(arr[i], i);     // add current array element & its index.
        }
        return new int[] {};    // no solution found.
    }

    public static void main(String[] args) {
        int[] arr = {91, 56, 2, 4, 6, 88};
        int target = 90;

        try (Stream<Integer> res = Arrays.stream(solution(arr, target)).boxed()) {
            res.forEach(System.out::println);
        } catch (RuntimeException ex) {
            throw new RuntimeException("Solution function returned an empty array");
        }
    }
}
