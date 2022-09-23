import java.util.*;
public class CntAndFreVowels {
    static Map<Character, Integer> resp = new HashMap<Character, Integer>(); // stores frequency of vowels

    public static void checkFrequency(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++)
                if (list.get(i).equals(list.get(j)))
                    count += 1;
            resp.put(list.get(i), count);
        }
    }

    public static void solve(String name) {
        char[] charArr = name.toCharArray();
        List<Character> list1 = new ArrayList<>(); // stores vowels
        List<Character> list2 = new ArrayList<>(); // stores consonents
        for (char ch : charArr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                list1.add(ch);
            else if(ch == ' ')
                continue;
            else
                list2.add(ch);
        }
        checkFrequency(list1);
        System.out.println("Vowels: " + list1);
        System.out.println("Consonent: " + list2);
    }

    public static void main(String[] args) {
        solve("aakanksha aishwarya");
        System.out.println("Vowel\t\tFrequency");
        resp.forEach((k, v) -> {
            System.out.println(k + "\t->\t" + v);
        });
    }
}
