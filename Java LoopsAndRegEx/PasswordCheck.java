import java.io.*;

public class PasswordCheck {
    public static void checkPassword(String password) {
        String[] strArr = password.split(" ");
        int a = 0;
        for (String str : strArr) {
            int count = 0;
            if (str.length() < 8) 
                a += 1;
            else {
                for (int i = 2; i < str.length(); i++) {
                    if ((Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(i - 1)) 
                            && Character.isLetter(str.charAt(i - 2)))
                        || (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i - 1))
                            && Character.isDigit(str.charAt(i - 2)))) 
                        count = 1;
                    
                    if (count == 1) {
                        a += 1;
                        break;
                    }
                }
            }
        }
        if (a > Double.valueOf(strArr.length / Double.valueOf(2))) 
            System.out.println("Weak");
        else 
            System.out.println("Strong");
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String str = reader.readLine();
        checkPassword("a 1234ab67cd a23s4d5f6 1q2w3e4r5t abcd1234 e3r4t5y6");
    }
}