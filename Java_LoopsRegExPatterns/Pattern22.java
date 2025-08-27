public class Pattern22 {
    public static void main(String[] args) {
        pattern22(5);
    }

    private static void pattern22(int n) {
        int row, col, temp = n * 2 - 1;
        int num = 1;
        for (row = 1; row <= temp; row++) {

            for (col = 1; col <= temp; col++) {
                if (col == row || col == temp - row + 1) {
                    System.out.print(num);
                }
                System.out.print(" ");
            }
            System.out.println();
            num = (row <= temp / 2) ? ++num : --num;
        }
    }
}
