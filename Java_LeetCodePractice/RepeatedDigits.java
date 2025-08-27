public class RepeatedDigits {
    public static int numDupDigitsAtMostN(int n) {
        if (n <= 21)
            return 1;

        int count = 0;
        for (int i = 0; i < n; i++) {
            String strNo = String.valueOf(i);
            // int flag = 0;
            for (int j = 0; j < strNo.length() - 1; j++) {
                for (int k = j + 1; k < strNo.length(); k++) {
                    if (strNo.charAt(j) == strNo.charAt(k)) {
                        count += 1;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numDupDigitsAtMostN(1000));
    }
}
