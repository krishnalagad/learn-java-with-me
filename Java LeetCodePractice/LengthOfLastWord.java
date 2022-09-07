import java.util.*;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        List<String> list = new ArrayList<String>();
        for(String str: strArr)
            list.add(str.trim());  
        return list.get(list.size() - 1).split("").length;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
