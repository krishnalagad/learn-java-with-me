public class StrongPasswordCheckerII {
    public static boolean strongPasswordCheckerII(String password) {
        boolean digitFlag = false;
        boolean upperFlag = false;
        boolean lowerFlag = false;
        if (password == null || password.length() < 8)
            return false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitFlag = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upperFlag = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerFlag = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("Krishna"));
    }
}
