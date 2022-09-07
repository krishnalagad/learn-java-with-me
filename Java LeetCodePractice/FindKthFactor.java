import java.util.*;

public class FindKthFactor {
    public static int kthFactor(int n, int k) {
        if (getFactors(n).size() < k)
            return -1;
        return getFactors(n).get(k - 1);
    }

    public static List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors.add(i);
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(4, 4));
    }
}
