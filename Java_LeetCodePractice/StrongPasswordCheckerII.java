public class StrongPasswordCheckerII {
    public static boolean checkDuplicateAtAdjecent(String s) {
        char[] chars = s.toCharArray();
        char prev = 0;
        int k = 0;
        for (char c : chars) {
            if (prev != c) {
                chars[k++] = c;
                prev = c;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean strongPasswordCheckerII(String password) {
        boolean digitFlag = false;
        boolean upperFlag = false;
        boolean lowerFlag = false;
        boolean sameFlag = false;
        boolean specFlag = false;
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
            sameFlag = checkDuplicateAtAdjecent(password);
            if (!Character.isDigit(password.charAt(i))
                    && !Character.isLetter(password.charAt(i))
                    && !Character.isWhitespace(password.charAt(i))) {

                specFlag = true;
            }
        }
        return digitFlag && lowerFlag && upperFlag && specFlag && sameFlag;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("Krishna9@"));
    }
}
