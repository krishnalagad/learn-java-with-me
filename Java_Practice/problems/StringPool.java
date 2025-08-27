package problems;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "Krishna";
        String str2 = new String("Krishna");
        System.out.println(str1 == str2);

        String intern = str2.intern();
        System.out.println(str1 == intern);
    }
}
