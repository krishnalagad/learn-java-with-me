public class Constructor1 {
    public Constructor1() {
        System.out.println("Default public constructor");
    }

    protected Constructor1(int a) {
        System.out.println("Parameterized protected constructor");
    }

    public static void main(String[] args) {
        Constructor1 o1 = new Constructor1(3);
    }
}