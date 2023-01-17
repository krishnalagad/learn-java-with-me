public class Pattern24 {
    public static void main(String[] args) {
        pattern24(7);
    }

    private static void pattern24(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == ((n / 2) + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }
    }
}
