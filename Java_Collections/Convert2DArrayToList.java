import java.util.*;
import java.util.stream.*;

public class Convert2DArrayToList {
    public static int[] removeDuplicate(int[] arr){

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.addAll(list);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 1, 2};

       arr = removeDuplicate(arr);
       for(int i: arr){
        System.out.print(i + " ");
       }
    }
}
