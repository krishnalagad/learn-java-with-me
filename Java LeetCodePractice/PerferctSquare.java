import java.util.*;

public class PerferctSquare {

    public static int solve(int n) {
        double root = Math.sqrt(n);
        System.out.println(root);
        int countPos = 0;
        int countNeg = 0;
        List<Integer> list1 = new ArrayList<Integer>();

        if (n % root == 0 && !list1.isEmpty())
            return list1.get(0);
        
        if (n % root == 0)
            return countNeg;

        String str = String.valueOf(root);
        if (str.indexOf(".") != -1) {
            // System.out.println(str);
            for (int i = 0; i < Integer.MAX_VALUE - 1; i++) {
                countNeg++;
                list1.add(i+1);
                list1.set(0, i+1);
                n -= 1;
                solve(n);
                
                if (n % root == 0)
                    return list1.get(0);
            }
        }
        return list1.get(0);
    }

    public static void main(String[] args) {
        System.out.println(solve(28));
    }
}
