import java.util.*;
import java.util.stream.*;

public class AvgSalaryExcludeMinMax {
    public static double average(int[] salary) {
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());
        Collections.sort(list);
        for (int i = 0; i < salary.length; i++) {
            if (i == 0 || i == salary.length - 1)
                continue;
            else
                res.add(list.get(i));
        }
        return res.stream().mapToInt(Integer::intValue).sum() / 2;
    }

    public static void main(String[] args) {
        int[] arr = { 4000, 3000, 1000, 2000 };
        System.out.println(average(arr));
    }
}
