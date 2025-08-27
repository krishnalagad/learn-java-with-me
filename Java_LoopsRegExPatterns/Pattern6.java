public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    private static void pattern6(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int colAtEachRow = row > n ? 2 * n - row : row;     // if loops starts from 0 then (2*n-row-1)
            for (int col = 1; col <= colAtEachRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
