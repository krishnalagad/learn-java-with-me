import java.util.*;
import java.util.Map.Entry;

public class CountUniqueCharacters {
    // public static List<String> getAllSubstrings(List<Character> list, int n) {
    // List<String> result = new ArrayList<String>();
    // for (int len = 1; len <= n; len++) {
    // for (int i = 0; i <= n - len; i++) {
    // int j = i + len - 1;
    // for (int k = i; k <= j; k++) {
    // System.out.print(list.get(k));
    // // result.add(str[k]);
    // }
    // System.out.println();
    // }
    // }
    // return null;
    // }
    // public static List<Character> getList(String s) {
    // List<Character> result = new ArrayList<Character>();
    // char[] arr = s.toCharArray();
    // for (int i = 0; i < arr.length ; i++) {
    // int flag = 0;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // flag = 1;
    // }
    // }
    // if(flag == 0){
    // result.add(arr[i]);
    // }
    // }
    // return result;
    // }

    // public static int uniqueLetterString(String s) {
    // List<Character> list = getList(s);
    // System.out.println(list);
    // getAllSubstrings(list, list.size());

    // return -1;
    // }

    public static List<String> getAllSubstrings(String str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                list.add(str.substring(i, j));
        return list;
    }
    
    public static Map<String, Integer> getOccurances(String s) {
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) 
                    count++;
            }
            result.put(String.valueOf(arr[i]), count);
            count = 0;
        }
        return result;
    }

    public static int uniqueLetterString(String s) {
        Map<String, Integer> map = getOccurances(s);
        List<String> list = new ArrayList<String>();
        int sum = 0;
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        String str = String.join("", list);
        List<String> subStringList = getAllSubstrings(str, str.length());
        for(String strItem: subStringList){
            sum += strItem.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(uniqueLetterString("LEETCODE"));
    }
}
