public class Pattern12 {
    public static void main(String[] args) {
        pattern12(4);
    }

    private static void pattern12(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                if (row == 1 || col == 1 || row == n || col == n) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}