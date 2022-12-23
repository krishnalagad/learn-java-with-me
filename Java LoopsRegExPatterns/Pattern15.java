public class Pattern15{
    public static void main(String[] args) {
        pattern15(7);
    }

    private static void pattern15(int n) {
        int i = 1;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++){
                System.out.print(i + " ");
                i += 1;
            }
            System.out.println();
        }
    }
}