import java.util.regex.*;

public class RegEx2 {
    public static int findMatches(String[] strArr) {
        Pattern pattern = Pattern.compile(
                "/(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|nop|opq|pqr|qrs|rst|stu|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678|789)+/ig",
                Pattern.CASE_INSENSITIVE);
        int count = 0;
        for (String str : strArr) {
            Matcher matcher = pattern.matcher(str);
            boolean matchFound = matcher.find();
            if (matchFound) {
                count += 1;
            } else {
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strArr = { "aaa", "111", "abc", "123", "ccc" };
        System.out.println(findMatches(strArr));
    }
}
