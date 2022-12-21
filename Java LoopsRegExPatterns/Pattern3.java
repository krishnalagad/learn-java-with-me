public class Pattern3 {
    public static void pattern3(int n){
        for(int row = 0; row < n; row++){
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern3(5);
    }
}
