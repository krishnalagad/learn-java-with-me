import java.util.*;

public class LandT1 {

    public static int func(char[] productId) {

        int answer = 0;
        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < productId.length; i++) {
            if (productId[i] == 'a' || productId[i] == 'e' || productId[i] == 'i' ||
                    productId[i] == 'o' || productId[i] == 'u' || productId[i] == 'A' ||
                    productId[i] == 'E' || productId[i] == 'I' || productId[i] == 'O' ||
                    productId[i] == 'U') {

            } else {
                list.add(productId[i]);
            }
        }
        answer = list.size();
        return answer;
    }

    public static int func1(char[] productId) {
        int answer = 0;
        String str = String.valueOf(productId);
        String replaceAll = str.replaceAll("[aeiouAEIOU]", "");
        answer = replaceAll.length();
        return answer;
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count++;
                index += str.length();
            } else {
                break;
            }
        }

        return count;
    }

    // main method.
    public static void main(String[] args) {
        char[] arr = { 'a', 'e', 'k', 'v', 'A', 'i', 'c', 'x', 'X', 'I' };
        System.out.println(func1(arr));

        System.out.println(countMatches("AABCCAAADCBBAADBBC", "AA"));
    }
}
