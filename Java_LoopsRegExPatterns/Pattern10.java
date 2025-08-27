public class Pattern10 {
    public static void main(String[] args) {
        pattern10(4);
    }

    private static void pattern10(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEachColValue = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEachColValue + " ");
            }
            System.out.println();
        }
    }
}
