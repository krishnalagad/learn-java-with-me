import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.addFirst(')');
            } else if (ch == '{') {
                st.addFirst('}');
            } else if (ch == '[') {
                st.addFirst(']');
            } else if (!st.isEmpty() && st.peek() == ch) {
                st.removeFirst();
            } else {
                return false;
            }
        }
        if (!st.isEmpty()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(" Is it valid: " + isValid("()[]{}"));
    }
}
