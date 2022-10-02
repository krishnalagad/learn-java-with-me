import java.util.*;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        // int total = 0;
        // for (List<Integer> tr : triangle) {
        //     Collections.sort(tr);
        //     System.out.println(tr.get(0));
        //     total += tr.get(0);
        // }
        // return total;

        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(
                        triangle.get(i + 1).get(j),
                        triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(-1)));
        triangle.add(new ArrayList<>(Arrays.asList(2, 3)));
        triangle.add(new ArrayList<>(Arrays.asList(1, -1, -3)));
        // triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        System.out.println(minimumTotal(triangle));
    }
}
