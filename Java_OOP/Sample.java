import java.util.*;
public class Sample{

  public static String stringChallenge(String str) {
    String challengeToken = "a7vqyg9f30";
    String compressed = "";
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i-1)) {
            count++;
        } else {
            compressed += count + str.charAt(i-1);
            count = 1;
        }
    }
    compressed += count + str.charAt(str.length()-1);
    for (char c : challengeToken.toCharArray()) {
        compressed = compressed.replace(Character.toString(c), "-" + c + "-");
    }
    return compressed;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); 
        
        System.out.println(stringChallenge(str));
    }
}