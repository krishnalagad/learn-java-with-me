import java.util.LinkedHashMap;
import java.util.Map;

public class CheckLengthWords {
    public static Map<String, Integer> checkLength(String s){
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        String[] strArr = s.split(" ");
        for(String str : strArr){
            result.put(str, str.length());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();

        result = checkLength("Hello guys my name is krishna");
        System.out.println("Word\t\t\tLength");
        result.forEach((k, v) -> {
            System.out.println(k + "\t\t->\t" + v);
        });
    }
}
