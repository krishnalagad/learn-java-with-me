import java.util.Scanner;

public class Pattern1 {
    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // i-1 spaces in each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            // Loop to iterate over each column
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Printing Lower Half of n-1 rows
        // Loop to iterate over each row in reverse order
        for (int i = n - 1; i >= 1; i--) {
            // i-1 spaces in each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Loop to iterate over each column
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        printPattern(no);
    }

}
