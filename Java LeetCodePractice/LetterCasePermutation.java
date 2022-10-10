import java.util.*;

public class LetterCasePermutation {
    public static List<String> letterCasePermutation(String s) {
        List<String> answer = new ArrayList<String>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isDigit(charArr[i])) {
                continue;
            } else {
                if (Character.isLowerCase(charArr[i])) {
                    answer.add(String.valueOf(charArr));
                    char ch = Character.toUpperCase(charArr[i]);
                    charArr[i] = ch;
                    answer.add(String.valueOf(charArr));
                    // charArr[i] = Character.toLowerCase(ch);
                } 
                else if (Character.isUpperCase(charArr[i])) {
                    answer.add(String.valueOf(charArr));
                    char ch = Character.toLowerCase(charArr[i]);
                    charArr[i] = ch;
                    answer.add(String.valueOf(charArr));
                    // charArr[i] = Character.toUpperCase(ch);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }
}
