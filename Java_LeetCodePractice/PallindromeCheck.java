public class PallindromeCheck {
    // public static boolean isPalindrome(int x) {
    //     int num = 0;

    //     if (x < 0)
    //         return false;

    //     while (x != 0) {
    //         int rem = x % 10;
    //         num = num * 10 + rem;
    //         x = x / 10;
    //     }

    //     if (x == num)
    //         return true;
    //     else
    //         return false;
    // }
    
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x > Integer.MAX_VALUE)
            return false;

        int raw = x;
        Integer a = Integer.valueOf(x);
        StringBuffer buffer = new StringBuffer(String.valueOf(raw));
        boolean flag = (a.compareTo(Integer.valueOf(String.valueOf(buffer.reverse()))) == 0) ? true : false;
        return flag;
    }
    public static void main(String[] args) {
            System.out.println("Is number pollindrome: " + isPalindrome(12121));
    }
}
