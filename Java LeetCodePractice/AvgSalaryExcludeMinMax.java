import java.util.*;
import java.util.stream.*;

public class AvgSalaryExcludeMinMax {
    public static double average(int[] salary) {
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || i == salary.length - 1)
                continue;
            else
                res.add(list.get(i));
        }
        return res.stream().mapToInt(Integer::intValue).sum() / res.size();
    }

    public static void main(String[] args) {
        int[] arr = { 1000, 2000, 3000 };
        System.out.println(average(arr));
    }
}
