import java.util.*;

public class Sample2 {
    public static int func(char[] productId){

        int answer = 0;
        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < productId.length; i++) {
            if (productId[i] == 'a' || productId[i] == 'e' || productId[i] == 'i' || 
                productId[i] == 'o' || productId[i] == 'u' || productId[i] == 'A' || 
                productId[i] == 'E' || productId[i] == 'I' || productId[i] == 'O' ||
                productId[i] == 'U' ) {
                
            }
            else{
                list.add(productId[i]);
            }
        }
        answer = list.size();
        return answer;
    }












    

    public static int func1(char[] productId) {

        int answer = 0;
        List<Character> list = new ArrayList<>();

        
        return answer;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'k', 'v', 'A'};
        System.out.println(func(arr));
    }
}
