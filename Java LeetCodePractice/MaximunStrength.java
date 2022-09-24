import java.util.*;
import java.util.stream.*;

public class MaximunStrength {
    public static int strongestTeam(int n, int[] arr) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int[] team = new int[2];
        List<Integer> raw = new ArrayList<Integer>();
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++)
            map.put(arr[i], i);

        Collection<Integer> val = map.values();
        raw.addAll(val);
        team[0] = raw.get(raw.size() - 1) + 1;
        team[1] = raw.get(raw.size() - 2) + 1;
        System.out.println(Arrays.stream(team).boxed().collect(Collectors.toList()));

        return list.get(0) + list.get(1);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = { 1, 5, 3, 4 };
        System.out.println(strongestTeam(n, arr));
    }
}
