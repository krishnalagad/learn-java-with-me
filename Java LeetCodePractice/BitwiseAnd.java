public class BitwiseAnd{
    public static int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }
        return m << shift;
    }
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 9));
    }
}