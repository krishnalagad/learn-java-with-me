import java.util.*;

public class ValidPallindromeII {
    public static boolean isValid(String str) {
        StringBuffer buffer = new StringBuffer(str.trim());
        if (str.trim().equals(String.valueOf(buffer.reverse()))) 
            return true;
        return false;
    }

    public static boolean validPalindrome(String s) {
        String[] strArr = s.split("");
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < s.length(); i++) {
            strArr[i] = "";
            result.add(isValid(String.join("", strArr)));
            strArr = s.split("");
        }
        if (result.contains(true)) 
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }
}
