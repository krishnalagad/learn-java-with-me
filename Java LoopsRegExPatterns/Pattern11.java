public class Pattern11 {
    public static void main(String[] args) {
        pattern11(4);
    }

    private static void pattern11(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEachColValue = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEachColValue + " ");
            }
            System.out.println();
        }
    }
}
