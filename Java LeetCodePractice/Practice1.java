import java.io.*;
public class Practice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int a = 0;
        for (String s : strArr) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.length() < 8)
                    count++;
                else {
                    if (Character.isLetter(s.charAt(i))) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (count > 2) {
                    a++;
                }
            }
        }
        if (a > (strArr.length / 2)) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }

        System.out.println(str);
    }
}
