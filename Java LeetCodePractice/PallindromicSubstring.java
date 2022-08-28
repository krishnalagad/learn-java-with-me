public class PallindromicSubstring {
    public static String longestPalindrome(String s) {
        int maxLength = 0, start = -1;
        for(int i = 0; i < s.length(); i++){
            int lenght = Math.max(getLength(i, i, s), getLength(i, i + 1, s));

            if(maxLength < lenght){
                maxLength = lenght;
                start = i - (lenght - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }

    private static int getLength(int i, int j, String s) {
        if(j >= s.length())
            return 0;
        int length = (i == j) ? -1 : 0;
        while(i >= 0 && j < s.length()){
            if(s.charAt(i) != s.charAt(j))
                break;
            length += 2;
            i--; j++;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
