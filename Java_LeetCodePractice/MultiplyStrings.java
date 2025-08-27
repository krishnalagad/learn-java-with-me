public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        return String.valueOf((Integer.valueOf(num1)) * (Integer.valueOf(num2)));
    }
    public static void main(String[] args) {
        System.out.println(multiply("4", "6"));
    }
}
