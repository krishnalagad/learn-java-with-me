public class ConsecutiveOnes {
    public static boolean checkRepeatedOnes(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;
    }
    public static int findIntegers(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String binaryRep = Integer.toBinaryString(i);
            if (checkRepeatedOnes(binaryRep)) {
                count += 1;
            }
        }   
        return count;
    }
    public static void main(String[] args) {
        System.out.println(findIntegers(1));
    }
}
