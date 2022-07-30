public class SortBubbleClass {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int raw = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = raw;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 45, 65, 67, 89, 23, 6 };

        System.out.println("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        bubbleSort(arr);

        System.out.println("\nAfter Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
