package problems;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringProblems {
    // 1. Reverse String without using built-in functions
    private static String reverseString(String str) {
        if (str.isBlank()) return null;
        char[] result = new char[str.length()];
        int counter = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            result[counter] = str.charAt(i);
            counter++;
        }
        return new String(result);
    }

    // 2. Check if String is palindrome
    private static boolean isPalindrome(String str) {
        if (str.isBlank()) return false;
        int start = 0, end = str.length() - 1;
        while (start <= end) {
            if (str.toLowerCase().charAt(start) == str.toLowerCase().charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    // 3. Count of vowels and consonants
    private static Map<String, Integer> getVowelsConsonantsCount(String input) {
        if (input.isBlank()) return new HashMap<>() {{
            put("Vowels", 0);
            put("Consonants", 0);
        }};
        String str = input.replaceAll(" ", "");
        String s = str.replaceAll("(?i)[aeiou]", "");
        int vowelsCount = str.length() - s.length();
        int consonantCount = str.length() - vowelsCount;
        return new HashMap<>() {{
            put("Vowels", vowelsCount);
            put("Consonants", consonantCount);
        }};
    }

    // 4. Find the longest substring without repeating characters.
    static private String getLongestSubString(String str) {
        if (str.isBlank()) return null;

        Map<Integer, String> map = new LinkedHashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

        }
        return null;
    }

    public static String getLongestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, maxLength = 0, maxStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }

            map.put(currentChar, end);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }


    // 5. First non-repeating character from String
    static private Character getFirstNonRepeatingCharacter(String str) {
        if (str.isBlank()) return null;

        LinkedHashMap<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        Map.Entry<Character, Long> entry1 = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElse(new AbstractMap.SimpleImmutableEntry<Character, Long>('#', (long) 0));
        return entry1.getKey();
    }

    // 6. Check is String contains only digits
    private static boolean isOnlyDigitString(String str) {
        if (str.isBlank()) return false;

        try {
            Double value = Double.valueOf(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    // 7. Remove punctuation marks from string
    static private String removePunctuationMarks(String str) {
        if (str.isBlank()) return null;
        List<Character> list = str.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .toList();

        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    // 8. Swap case of each character of a string
    static private String swapCaseOfChars(String str) {
        if (str.isBlank()) return null;
        List<Character> list = str.chars()
                .mapToObj(ch -> (char) ch)
                .map(ch -> {
                    if (Character.isUpperCase(ch)) {
                        return Character.toLowerCase(ch);
                    } else if (Character.isLowerCase(ch)) {
                        return Character.toUpperCase(ch);
                    }
                    return null;
                }).toList();

        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    // 9. Count the number of words in a string using regex
    private static int getWordCountUsingRegex(String str) {
        if (str.isBlank()) return 0;
        return str.split(" ").length;
    }

    private static int getWordCountUsingRegexII(String str) {
        if (str.isBlank()) return 0;
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // 10. Get String compressor using count of repeated characters
    private static String getStringCompressor(String str) {
        if (str.isBlank()) return null;

        LinkedHashMap<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        StringBuilder builder = new StringBuilder();
        String string = map.entrySet()
                .stream()
                .map(entry -> builder.append(String.format("%s%s", entry.getKey(), entry.getValue())))
                .collect(Collectors.joining());

        return builder.toString();
    }

    static private String getSubstringBetweenChars(String str, char start, char end) {
        if (str.isBlank()) return null;
        int startIndex = -1;
        int endIndex = -1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == start) {
                startIndex = i;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == end) {
                endIndex = i;
                break;
            }
        }

        return String.valueOf(chars, startIndex + 1, endIndex - startIndex - 1);
    }

    public static void main(String[] args) {
        String result = reverseString("Cryptography");
        System.out.println("Reversed String: " + result);

        System.out.println("Is palindrome: " + (isPalindrome("Markram") ? "Yes" : "No"));
        System.out.println("Is palindrome: " + (isPalindrome("Dinesh") ? "Yes" : "No"));
        System.out.println("Is palindrome: " + (isPalindrome("   ") ? "Yes" : "No"));

        Map<String, Integer> map = getVowelsConsonantsCount("Dan Vega");
        System.out.println(map);

        Character c = getFirstNonRepeatingCharacter("aabbccee");
        System.out.println("Non-repeating char: " + (c == '#' ? "No non-repeating character found." : c));

        System.out.println("isOnlyDigitString: " + (isOnlyDigitString("2356.34") ? "Yes" : "No"));
        System.out.println("isOnlyDigitString: " + (isOnlyDigitString("23H56.34") ? "Yes" : "No"));

        System.out.println(removePunctuationMarks("kri!shn#a1La&ga7d"));

        System.out.println(swapCaseOfChars("KrIsHna"));

        System.out.println(getWordCountUsingRegex("Krishna lagad is my name "));
        System.out.println(getWordCountUsingRegexII("Krishna lagad is my name "));

        System.out.println(getStringCompressor("aaabbcddddffffffeeeee"));

        System.out.println(getSubstringBetweenChars("krishnalagad", 'i', 'g'));

        System.out.println(getLongestUniqueSubstring("abcabcbb"));
    }
}
