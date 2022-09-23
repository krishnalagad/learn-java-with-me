public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        for (int i = 0; i < 100; i++)
            if (n == (Math.pow(4, i)))
                return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }
}
