import java.util.LinkedList;

public class ConvertListToArray {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(40);
        list.add(30);
        list.add(50);
        list.add(80);
        list.add(90);
        list.add(10);
        list.add(70);

        for (Integer i : list) {
            System.out.println("ELements in list : " + i);
        }

        int arr[] = new int[list.size()];
        int arr1[] = new int[list.size()];
        arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Object[] res = list.toArray();
        System.out.println("Printing elements of array");
        for (int value : arr1) {
            System.out.print(value + " ");
        }
    }
}
