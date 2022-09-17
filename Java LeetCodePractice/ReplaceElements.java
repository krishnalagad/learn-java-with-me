public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ger = arr[n - 1];
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = ger;
            ger = Math.max(temp, ger);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        arr = replaceElements(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
