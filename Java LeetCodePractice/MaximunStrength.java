import java.util.*;
import java.util.stream.*;

public class MaximunStrength {
    public static int strongestTeam(int n, int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        
        return list.get(0) + list.get(1);
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 5, 3, 4};
        System.out.println(strongestTeam(n, arr));
    }
}
