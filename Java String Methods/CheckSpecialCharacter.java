public class CheckSpecialCharacter {
    public static boolean checkSpecialChar(char ch) {
        if (!Character.isDigit(ch)
                && !Character.isLetter(ch)
                && !Character.isWhitespace(ch)) {

            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String result = checkSpecialChar('*') ? "Yes" : "No";
        System.out.println("Is special character: " + result);
    }
}
