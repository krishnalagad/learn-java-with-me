import java.util.*;
import java.util.stream.*;

public class DoubledArray {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length <= 1)
            return new int[0];
        if (changed.length % 2 != 0)
            return new int[0];

        int[] answer = new int[changed.length / 2];
        int[] arr1 = Arrays.copyOfRange(changed, 0, changed.length / 2);
        Arrays.sort(arr1);
        int[] arr2 = Arrays.copyOfRange(changed, changed.length / 2, changed.length);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            double d1 = Double.valueOf(arr2[i]) / Double.valueOf(2);
            double d2 = Double.valueOf(arr1[i]) / Double.valueOf(2);

            if ((arr1[i] == d1))
                answer[i] = arr1[i];
            else if ((arr2[i] == d2))
                answer[i] = arr2[i];
            else
                return new int[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        arr = findOriginalArray(arr);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
