import java.util.*;
import java.util.stream.Collectors;

public class ConvertListToString {
    public static String convertListToString(List<?> list) {
        String delim = " ";

        return list.stream().map(Object::toString).collect(Collectors.joining(delim));
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(convertListToString(list));
    }
}
