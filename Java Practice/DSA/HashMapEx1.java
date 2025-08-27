package DSA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Functionality {
    public Map<Character, ?> countOfCharsInWord(String word) {
        if (word.isBlank()) return null;
        Map<Character, Long> map = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        Map.Entry<Character, Long> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most appeared character from string " + word + " is '" + entry.getKey() + "' & " +
                "it has appeared '" + entry.getValue() + "' times.");

        return map;
    }

    public Character getFirstNonRepeatingChar(String word) {
        if (word.isBlank()) return null;
        LinkedHashMap<Character, Long> map = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
        ));
        Optional<Map.Entry<Character, Long>> first = map.entrySet().stream().filter(c -> c.getValue() == 1).findFirst();

        return first.isPresent() ? first.get().getKey() : 0;
    }
}
public class HashMapEx1 {
    public static void main(String[] args) {
        Functionality functionality = new Functionality();

        Map<Character, ?> map = functionality.countOfCharsInWord("badass");
        System.out.println(map);

        Character ch = functionality.getFirstNonRepeatingChar("bbidfcck");
        System.out.println("First non repeating char: " + ch.toString());
    }
}
