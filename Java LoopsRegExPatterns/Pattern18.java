public class Pattern18 {
    public static void main(String[] args) {
        pattern18(5);
    }

    private static void pattern18(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // no space after *.
            }
            int spaces = 2 * (n - row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // no space after *.
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // no space after *.
            }
            int spaces = 2 * (n - row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // no space after *.
            }
            System.out.println();
        }
    }

}
