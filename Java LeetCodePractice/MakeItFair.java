public class MakeItFair {
    public static int solve(int n) {

        if (n % 2 != 0) {
            // in some cases it is not possible to distribute chocos equally..give 1 choco to
            // father and remaining distribute equally
            return (n - 1) / 2;
        }

        return n / 2;
    }

    public static void main(String[] args) {
        System.out.println(solve(10));
        System.out.println(solve(13));
    }
}