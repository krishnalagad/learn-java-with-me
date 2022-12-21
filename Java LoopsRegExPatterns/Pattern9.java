public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    private static void pattern9(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int spaces = 1; spaces <= n - c; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
