public class StringToInteger {
    public static int myAtoi(String s) {

        s = s.trim(); 
        long ans = 0;
        if (s.equals(""))
            return 0; 
        int neg = 1;
        if (s.charAt(0) == '+') { 

        } else if (s.charAt(0) == '-') { 
            neg = -1;
        } else if (Character.isDigit(s.charAt(0))) { 
            ans = Character.getNumericValue(s.charAt(0));
            System.out.println(ans);
        } else { 
            return 0;
        }

        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { 
                ans = ans * 10;
                ans = ans + Character.getNumericValue(s.charAt(i));

                if (neg * ans < Integer.MIN_VALUE) { 
                    return Integer.MIN_VALUE;
                }
                if (neg * ans > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                break;
            }

        }

        return neg * (int) ans; 

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("        +45678"));
    }
}
