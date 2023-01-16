public class Pattern24 {
    public static void main(String[] args) {
        pattern24(5);
    }

    private static void pattern24(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n || col == ((row / 2) + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
