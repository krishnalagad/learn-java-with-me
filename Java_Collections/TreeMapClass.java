import java.util.*;
import java.util.stream.Collectors;

public class TreeMapClass {
    public static int solve(Map<Integer, String> map, int key) {
        Set<Integer> keys = map.keySet();
        List<Integer> keysList = keys.stream().collect(Collectors.toList());
        Collections.sort(keysList, Collections.reverseOrder());

        if (keysList.contains(key)) {
            if(key == keysList.get(keysList.size() - 1)) 
                return -1;
            int idx = keysList.indexOf(key);
            return keysList.get(idx + 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        Map<Integer, String> tMap = new TreeMap<Integer, String>();

        tMap.put(20, "Green");
        tMap.put(10, "Red");
        tMap.put(40, "Black");
        tMap.put(50, "White");
        tMap.put(60, "Pink");

        System.out.println(tMap);
        System.out.println(solve(tMap, 10));
    }
}
