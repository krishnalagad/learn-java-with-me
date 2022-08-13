public class SortInsertionClass {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > temp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 45, 65, 67, 89, 23, 6 };

        System.out.println("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
