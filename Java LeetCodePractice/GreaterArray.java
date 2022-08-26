import java.util.*;

public class GreaterArray {

    public static List<List<Integer>> checkGreater(int[] arr){

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = null;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    list = new ArrayList<>();
                    System.out.print(arr[j] + " ");
                    list.add(arr[j]);
                }
            }
            result.add(list);
            list.clear();
        }
        System.out.println();
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 1, 6, 7};
        System.out.println(checkGreater(arr));
    }
}

// import java.util.*;

// public class GreaterArray {

//     public static List<Integer> checkGreater(int[] arr) {

//         List<Integer> result = new ArrayList<>();
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[j] < arr[i]) {
//                     // System.out.print(arr[j] + " ");
//                     count++;
//                 }
//             }
//             result.add(count);
//             count = 0;
//         }
//         System.out.println();
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 2, 6, 1 };
//         System.out.println(checkGreater(arr));
//     }
// }
