import java.util.*;

public class PokerWheel {
    public static int[] solve(String[] strArr) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (String str : strArr) {
            String[] charArr = str.split("");
            List<Integer> list2 = new ArrayList<>();
            for (String ch : charArr)
                list2.add(Integer.parseInt(ch));
            Collections.sort(list2, Collections.reverseOrder());
            list1.add(list2);
        }
        for (List<Integer> temp : list1)
            answer.add(temp.get(0));

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        String[] strArr = { "123", "234", "432", "235", "908", "789" };
        int[] arr = new int[strArr.length];
        arr = solve(strArr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
