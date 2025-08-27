public class StrongPasswordCheckerI {
    public static int strongPasswordChecker(String password) {
        if (password.length() < 6) {
            return 6 - password.length();
        }
        if (password.length() >= 6) {
            boolean upperFlag = false;
            boolean lowerFlag = false;
            boolean digitFlag = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)))
                    upperFlag = true;
                if (Character.isLowerCase(password.charAt(i)))
                    lowerFlag = true;
                if (Character.isDigit(password.charAt(i))) 
                    digitFlag = true;    
            }
            if (upperFlag && lowerFlag && digitFlag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("aaa123"));
    }
}
