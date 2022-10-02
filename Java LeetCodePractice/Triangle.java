import java.util.*;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int total = 0;
        for (List<Integer> tr : triangle) {
            Collections.sort(tr);
            total += tr.get(0);
        }
        return total;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        System.out.println(minimumTotal(triangle));
    }
}
