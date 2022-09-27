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

    // public double average(int[] salary) {
    //     int min = 0;
    //     int max = 0;
    //     double sum = salary[0];
    //     for (int i = 1; i < salary.length; i++) {
    //         if (salary[i] > salary[max]) 
    //             max = i;
    //         else if (salary[i] < salary[min]) 
    //             min = i;       
    //         sum += salary[i];
    //     }
    //     sum = sum - salary[min] - salary[max];
    //     return (sum / (salary.length - 2));
    // }

    public static void main(String[] args) {
        int[] arr = { 48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000,
                4000, 54000, 67000, 6000, 1000, 11000};
        System.out.println(average(arr));
    }
}
