public class SwapCorresponding {
    static int[] changePos(int[] arr) {
        for (int i = 0; i < arr.length - 1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1, 7};
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
        arr = changePos(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
