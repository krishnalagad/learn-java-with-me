import java.util.LinkedHashMap;
import java.util.Map;

public class CheckOccurance {
    public static Map<Integer, Integer> checkOccurance(int[] arr) {
        Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j])
                    count++;

            result.put(arr[i], count);
            count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();

        int[] arr = { 12, 23, 12, 23, 12, 23, 12, 23, 12, 23, 32, 32 };
        result = checkOccurance(arr);
        System.out.println("Number\t\tOccurance");
        result.forEach((k, v) -> {
            System.out.println(k + "\t->\t" + v);
        });

    }
}
