public class ReverseArray {

    static int[] reverse(int[] arr){
        
        int len = arr.length;
        int[] raw = new int[len];
        int index = 0;

        for(int i = len - 1; i >= 0; i--){
            if(index >= len){
                break;
            }
            raw[index] = arr[i];
            index++;
        }
        return raw;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 7};
        int[] res = (reverse(arr));
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
