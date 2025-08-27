package streams;

import java.util.StringTokenizer;

public class StringTokenizerVsSplit {
    public static void main(String[] args) {
        String str = "John,Sam,Ravi,,Sagar";

        // If no token found between 2 delimiters, does not remove the blank
        String[] splitTokens = str.split(",");
        for (String token: splitTokens) {
            System.out.println(token);
        }
        System.out.println();

        // If no token found between 2 delimiters, removes the blank
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println();

        StringTokenizer stringTokenizer1 = new StringTokenizer(str, ",", true);
        while (stringTokenizer1.hasMoreTokens()) {
            System.out.print(stringTokenizer1.nextToken());
        }
    }
}
