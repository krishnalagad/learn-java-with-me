import java.util.*;
import java.util.stream.Collectors;

public class StockBuySell {

    public static int maxProfit(int[] prices) {
        // List<Integer> list = Arrays.stream(prices)
        //         .boxed()
        //         .collect(Collectors.toList());

        // if((Collections.min(list)) == (list.get(list.size() - 1))){
        //     return -1;
        // }

        // List<Integer> list2 = new ArrayList<Integer>();
        // int minValue = Collections.min(list);
        // int minPos = list.indexOf(minValue);

        // for (int i = minPos + 1; i < list.size(); i++) {
        //     list2.add(list.get(i));
        // }

        // int maxValue = Collections.max(list2);

        // return maxValue - minValue;

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max Profit : " + maxProfit(prices));
    }
}
