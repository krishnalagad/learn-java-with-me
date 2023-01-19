import java.util.LinkedHashMap;
import java.util.*;

public class WordParityCheck {

    public static int checkParity(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int seq = 0;
        List<String> bin = new ArrayList<>();
        String binaryString = "";

        for (int i = 'a'; i <= 'z'; i++)
            map.put((char) i, ++seq);

        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            map.forEach((k, v) -> {
                if (c == k) {
                    int val = map.get(k);
                    bin.add(Integer.toBinaryString(val));
                }
            });
        }
        for (String b : bin)
            binaryString += b;

        String result = binaryString.replaceAll("0", "");
        return result.length();
    }

    // main method
    public static void main(String[] args) {
        System.out.println(checkParity("krishna"));
    }
}
