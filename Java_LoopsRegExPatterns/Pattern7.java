public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    private static void pattern7(int n) {
        for (int row = 1; row < 2 * n + 1; row++) {
            int colAtEachRow = row > n ? 2 * n - row : row; // if loops starts from 0 then (2*n-row-1)
            int noOfSpaces = n - colAtEachRow;
            
            for (int i = 1; i <= noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colAtEachRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
