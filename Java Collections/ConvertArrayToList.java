import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {
    static <T> List<T> convertToList(T[] array) {
        List<T> list = Arrays.stream(array).collect(Collectors.toList());
        return list;
    }

    static List<Integer> convertToList2(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    static List<Character> convertToList3(char[] arr) {
        List<Character> list = new ArrayList<Character>();
        for (char c : arr) {
            list.add(c);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        String[] arr2 = { "krishna", "student", "lagad", "surname" };
        char[] arr3 = { 'a', 'b', 'c', 'd', 'e' };

        List<String> list1 = convertToList(arr2);
        System.out.println(list1);

        List<Integer> list2 = convertToList2(arr1);
        System.out.println(list2);

        List<Character> list3 = convertToList3(arr3);
        System.out.println(list3);
    }
}
