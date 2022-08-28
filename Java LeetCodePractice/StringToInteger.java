public class StringToInteger {
    public static int myAtoi(String s) {

        s = s.trim(); // trimming white space
        long ans = 0;
        if (s.equals(""))
            return 0; // if string is empty return 0
        int neg = 1;
        if (s.charAt(0) == '+') { // check if first char is + then d nothing

        } else if (s.charAt(0) == '-') { // check if first char is - then number is negative
            neg = -1;
        } else if (Character.isDigit(s.charAt(0))) { // if first vharcter is numeric add to ans
            ans = Character.getNumericValue(s.charAt(0));
            System.out.println(ans);
        } else { // if first charcter is other than (+ , - , or digit) reurn 0
            return 0;
        }

        for (int i = 1; i < s.length(); i++) { // iterate to left of string means from index 1

            if (Character.isDigit(s.charAt(i))) { // if it is numeric then add into ans;
                ans = ans * 10;
                ans = ans + Character.getNumericValue(s.charAt(i));

                if (neg * ans < Integer.MIN_VALUE) { // at any case over ans get out of bound for integer than clamp it
                                                     // and return
                    return Integer.MIN_VALUE;
                }
                if (neg * ans > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                break;
            }

        }

        return neg * (int) ans; // at last return ans

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("        +45678"));
    }
}
