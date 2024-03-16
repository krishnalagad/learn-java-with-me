package Lamdba;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        FnInterface fnInterface = (list) -> {
            return list.stream()
                    .mapToInt(Integer::intValue)
                    .filter(num -> num % 2 == 0)
                    .distinct()
                    .map(num -> num * num)
                    .sum();
        };

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 34, 67);
        int sumOfSquares = fnInterface.getSumOfSquaresOfEvenAndDistinctNumbers(list);
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}