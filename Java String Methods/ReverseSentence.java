import java.util.*;

public class ReverseSentence {
    public static void reverseSentence(String str){
        String[] raw = str.split(" ");
        String result = "";
        List<String> list = new ArrayList<String>();
        for (int i = raw.length - 1; i >= 0; i--) {
            result = result +  raw[i] + " ";
            list.add(raw[i]);
        }
        System.out.println(result);
        System.out.println(String.join(" ", list));
        System.out.println(result.length() + "  " + String.join(" ", list).length());
    }

    public static void main(String[] args) {
        reverseSentence("Krishna is my name");
    }
}