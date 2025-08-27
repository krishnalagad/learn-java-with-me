public class SwapCorresponding {
    static int[] intechange(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    // public static int[] s(int[] arr) {
    // int[] answer = new int[100];
    // for (int i = 0; i < arr.length - 1; i += 2) {
    // int temp = arr[i];
    // answer[i] = arr[i + 1];
    // answer[i + 1] = temp;
    // }
    // return answer;
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1 };
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
        arr = intechange(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
