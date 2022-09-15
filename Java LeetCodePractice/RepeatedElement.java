import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RepeatedElement {

    public static String rec(String string) {
        if (string.length() <= 1) {
            return string; //

        }
        String str1 = string.substring(0, 1);
        String str2 = string.substring(1);
        return str1 + rec(str2);

    }

    public void example(Predicate<Integer> func, ArrayList<Integer> items) {
        int i = 0;
        for (int item : items) {
            if (func.test(item)) {
                items.set(i, item);
                i += 1;
            }
        }
        items.subList(i, items.size()).clear();
        ;
    }

    public static void func(int a, List<Integer> b){
        a += 1;
        b.add(1);
    }

    public static boolean foo(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(str1.length() -i - 1 ) == str2.charAt(i) ){
                continue;
            }else{
                return str1.charAt(str1.length() - i - 1) < str2.charAt(i);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(rec("krishna"));

        int a = 0;
        List<Integer> b = new ArrayList<Integer>();
        func(a, b);
        System.out.println(a + b.toString());

        System.out.println(foo("818", "718"));

    }
}
