import java.io.*;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int a = 0;
        for (String s : strArr) {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.length() < 8)
                    count1++;
                else {

                    if (Character.isLetter(s.charAt(i))) {
                        count1++;
                    } else {
                        count1 = 0;
                    }
                    if (Character.isDigit(s.charAt(i))) {
                        count2++;
                    } else {
                        count2 = 0;
                    }
                }
                if (count1 >= 3 || count2 >= 3)
                    a++;
            }
            System.out.println("a: " + a);
        }
        if (a >= (strArr.length / 2))
            System.out.println("Weak");
        else
            System.out.println("Strong");

        System.out.println(str);
    }
}
