public class NumberToBinary{
    public static String convertToBinary(int number) {
        return Integer.toBinaryString(number);
    }
    public static void main(String[] args) {
        System.out.println(convertToBinary(45));
    }
}