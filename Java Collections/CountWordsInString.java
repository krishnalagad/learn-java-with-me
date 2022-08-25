import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountWordsInString {
    public static Map<String, Integer> findWordsCount(List<String> strList) {

        Map<String, Integer> resp = new LinkedHashMap<>();
        for (String str : strList) {
            resp.put(str, str.trim().split(" ").length);
        }

        return resp;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> resp = new LinkedHashMap<>();
        list.add("Krishna is my name");
        list.add("I'm studying in AISSMS IOIT");
        list.add("I live in Pune");
        list.add("My native place is Mumbai");

        resp = findWordsCount(list);
        resp.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });

    }
}
