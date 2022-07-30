public class SortQuickClass {
    static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }
    private static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 45, 65, 67, 8, 23, 6 };
        int l = 0;
        int h = arr.length - 1;

        System.out.println("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        quickSort(arr, l, h);

        System.out.println("\nAfter Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
