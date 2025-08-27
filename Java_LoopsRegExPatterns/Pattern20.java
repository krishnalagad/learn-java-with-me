public class Pattern20 {
    public static void main(String[] args) {
        pattern20(6);
    }

    private static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n ; col++) {
                if ((row == 1 || row == n) || (col == 1 || col == n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
