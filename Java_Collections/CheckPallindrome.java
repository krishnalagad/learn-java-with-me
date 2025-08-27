import java.util.LinkedHashMap;
import java.util.Map;

public class CheckPallindrome {

    public static Map<String, String> checkPallindrome(String s) {
        Map<String, String> result = new LinkedHashMap<String, String>();
        String[] strArr = s.split(" ");

        for (String str : strArr) {
            String response = (isPallindrome(str) ? "Yes, It is Pallindrome" : "No, It is not Pallindrome");
            result.put(str, response);
        }
        return result;
    }

    public static boolean isPallindrome(String s) {
        boolean result;
        StringBuffer sb = new StringBuffer(s);
        String str = String.valueOf(sb.reverse());

        result = (s.trim().equals(str.trim()) ? true : false);

        return result;
    }

    public static void main(String[] args) {
        Map<String, String> result = new LinkedHashMap<String, String>();
        result = checkPallindrome("Hello madam my name is nayan");
        System.out.println("Word\t\t\tResults");
        result.forEach((k, v) -> {
            System.out.println(k + "\t\t->\t" + v);
        });
    }
}
