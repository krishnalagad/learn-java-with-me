public class SortSelectionClass {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int raw = arr[i];
                arr[i] = arr[min];
                arr[min] = raw;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 45, 65, 67, 8, 23, 6 };

        System.out.println("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        selectionSort(arr);

        System.out.println("\nAfter Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
