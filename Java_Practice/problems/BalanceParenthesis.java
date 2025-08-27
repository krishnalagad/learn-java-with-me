package problems;

import java.util.Stack;

public class BalanceParenthesis {
    private static boolean isValid(Character current, Character popped) {
        return ((popped == '(' && current == ')') ||
                (popped == '[' && current == ']') ||
                (popped == '{' && current == '}'));
    }
    public static boolean solution(String str) {
        if (str.isEmpty() || str.length() % 2 != 0) return false;

        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch: chars) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                Character popped = stack.pop();
                boolean valid = isValid(ch, popped);
                if (!valid)
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Result: " + (solution("{([])}") ? "Balanced String" : "Not Balanced String"));
        System.out.println("Result: " + (solution("{([})}") ? "Balanced String" : "Not Balanced String"));
        System.out.println("Result: " + (solution("())") ? "Balanced String" : "Not Balanced String"));
        System.out.println("Result: " + (solution("{{{{{(((([[[[[]]]]]))))}}}}}") ? "Balanced String" : "Not Balanced String"));

    }
}
