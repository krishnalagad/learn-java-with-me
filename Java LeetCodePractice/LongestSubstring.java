import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, max = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            while (set.contains(c)) {
                set.remove(s.charAt(i));
            }

            set.add(c);
            max = Math.max(max, j - i - 1);
        }
        return max;
    }
}
