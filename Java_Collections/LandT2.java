import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LandT2 {

    public static int maxEnergy(int[] ener) {
        List<Integer> list = Arrays.stream(ener).boxed().collect(Collectors.toList());
        Collections.sort(list);

        int answer = list.get(list.size() - 1) + list.get(list.size() - 2);

        return answer;
    }

    public static int[] func(int[] inputList, int num) {
        int[] answer = new int[100];
        List<Integer> list = Arrays.stream(inputList).boxed().collect(Collectors.toList());
        List<Integer> result1 = new ArrayList<Integer>();
        List<Integer> result2 = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            result1.add(list.get(i));
        }
        Collections.sort(result1);

        for (int i = num; i < list.size(); i++) {
            result2.add(list.get(i));
        }
        Collections.sort(result2, Collections.reverseOrder());

        result1.addAll(result2);

        answer = result1.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 9, -3, 8, -6, -7, 10, 2, 3, 5, -8 };

        arr = func(arr, 5);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

}
