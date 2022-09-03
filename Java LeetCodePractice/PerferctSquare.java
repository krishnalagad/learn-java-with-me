import java.util.*;

public class PerferctSquare {
    static List<Integer> list1 = new ArrayList<Integer>();
    static int a = 1;

    public static int solve(int n) {
        double root = Math.sqrt(n);
        list1.add(a);
        list1.set(0, a);
        a += 1;
        System.out.println(root);
        int countNeg = 0;

        if (n % root == 0 && !list1.isEmpty())
            return list1.get(0) - 1;

        if (n % root == 0)
            return countNeg;

        String str = String.valueOf(root);
        if (str.indexOf(".") != -1) {
            for (int i = 0; i < Integer.MAX_VALUE - 1;) {
                countNeg++;
                n -= 1;
                solve(n);

                return list1.get(0) - 1;
            }
        }
        return list1.get(0);
    }

    public static void main(String[] args) {
        int no = 54;
        System.out.println("Input: " + no);
        System.out.println("Output: " + solve(no));
    }
}
