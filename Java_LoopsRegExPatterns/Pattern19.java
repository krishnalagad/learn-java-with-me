public class Pattern19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    private static void pattern19(int n) {
        for(int row = 1; row <= n; row++) {
            for(int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print("  ");
            }
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
