public class PallindromeCheck {
    public static boolean isPalindrome(int x) {
        int num = 0;

        if (x < 0)
            return false;

        while (x != 0) {
            int rem = x % 10;
            num = num * 10 + rem;
            x = x / 10;
        }

        if (x == num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
