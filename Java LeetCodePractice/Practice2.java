import java.io.*;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int a = 0;
        for (String s : strArr) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.length() < 8)
                    a++;
                else {
                    if (count >= 3) {
                        a += 1;
                    }
                    if ((Character.isLetter(s.charAt(i))) && (Character.isLetter(s.charAt(i + 1)))
                            && (Character.isLetter(s.charAt(i + 2)))) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if ((i + 2) == s.length() - 3) {
                        break;
                    }
                }
            }
            System.out.println("a: " + a);
        }
        if (a >= (strArr.length / 2))
            System.out.println("Weak");
        else
            System.out.println("Strong");

    }
}
