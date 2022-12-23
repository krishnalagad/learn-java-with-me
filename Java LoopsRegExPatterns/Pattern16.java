public class Pattern16 {
    public static void main(String[] args) {
        pattern16(7);
    }

    private static void pattern16(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int noToBePrinted = (row + col) % 2 == 0 ? 1 : 0;
                System.out.print(noToBePrinted + " ");
            }
            System.out.println();
        }
    }
}
