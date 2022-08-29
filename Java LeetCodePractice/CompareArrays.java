import java.util.*;
import java.util.stream.Collectors;


public class CompareArrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 5 }; 
        int[] array2 = { 2, 1, 5 };

        Set<Integer> set = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        List<Integer> list = Arrays.stream(array2).boxed().collect(Collectors.toList());

        int i = 0;
        int flag = 0;
        while(i < set.size()) {
            if(set.contains(list.get(i++))){
                flag = 1;
            }
            else{
                flag = 0;
                break;
            }
        }
        System.out.println(flag);
        


        // int[] array1 = { 1, 2, 5 };
        // int[] array2 = { 2, 4, 15 };
        // List<Integer> list = new ArrayList<Integer>();

        // for (int i = 0; i < array1.length; i++) {
        //     int flag = 0;
        //     for (int k = 0; k < array2.length; k++) {
        //         if (array1[i] == array2[k]) {
        //             flag = 1;
        //             list.add(array1[i]);
        //         }
        //     }

        // }

        // if (list.size() == array1.length) {
        //     System.out.println(1);
        // } else {
        //     System.out.println(0);
        // }

    }

}
