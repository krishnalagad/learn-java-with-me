import java.util.*;
import java.util.stream.*;
public class CntAndFreVowels {
    static Map<String, Integer> resp = new HashMap<String, Integer>(); // stores frequency of vowels
    
    public static void checkFrequency(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++)
                if (list.get(i).equals(list.get(j)))
                    count += 1;
            resp.put(list.get(i), count);
        }
    }

    public static void solve(String name) {
        String vowels = name.replaceAll("(?i)[^aeiou]", "");
        String consonents = name.replaceAll("(?i)[aeiou]", "");
        // converting vowels string into string array using split() and then converting it to List<String>
        checkFrequency(Arrays.stream(vowels.split("")).collect(Collectors.toList()));   
        System.out.println("Vowels: " + vowels + "\nConsonents: " + consonents);
    }

    public static void main(String[] args) {
        solve("aakankshaaishwarya");
        System.out.println("Vowel\t\tFrequency");
        resp.forEach((k, v) -> {
            System.out.println(k + "\t->\t" + v);
        });
    }
}

// public static void solve(String name) {
// char[] charArr = name.toCharArray();
// List<Character> list1 = new ArrayList<>(); // stores vowels
// List<Character> list2 = new ArrayList<>(); // stores consonents
// for (char ch : charArr) {
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
// 'A' || ch == 'E' || ch == 'I'
// || ch == 'O' || ch == 'U')
// list1.add(ch);
// else if(ch == ' ')
// continue;
// else
// list2.add(ch);
// }
// checkFrequency(list1);
// System.out.println("Vowels: " + list1);
// System.out.println("Consonent: " + list2);
// }