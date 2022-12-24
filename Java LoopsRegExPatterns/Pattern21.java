public class Pattern21 {
    public static void main(String[] args) {
        pattern21(5);
    }

    private static void pattern21(int n) {
        for(int row = 1; row <= n; row++) {
            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
