import java.util.regex.*;

public class RegEx1 {
    public static int findMatches(String[] strArr) {
        Pattern pattern = Pattern.compile("([a-z\\d])\\1\\1", Pattern.CASE_INSENSITIVE);
        // Pattern pattern = Pattern.compile("\\b([a-zA-Z0-9])\\1\\1+\\b",
        // Pattern.CASE_INSENSITIVE);
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
        String[] strArr = { "aaa", "111", "abc", "222", "ccc" };
        System.out.println(findMatches(strArr));
    }
}