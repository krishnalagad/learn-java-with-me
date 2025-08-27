public class Pattern14 {
    public static void main(String[] args) {
        pattern14(7);
    }

    private static void pattern14(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print("  "); // two spaces here.
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
