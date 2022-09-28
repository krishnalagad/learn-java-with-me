import java.util.*;
import java.util.stream.Collectors;

public class ArrayConcatination {
    public static int[] getConcatenation(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        answer.addAll(list);
        answer.addAll(list);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
        arr = getConcatenation(arr);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
