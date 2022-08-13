
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseCollectionList2 {
    private static Iterator<String> iterator;
    private static String next;
    private static ListIterator<String> litr;
    private static String previous;
    private static TreeSet<String> treeSet;
    private static Iterator<String> treeIterator;

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Krishna");
        // arrayList.add(123); ----gives errror because its type safe collection
        arrayList.add("Student 1");
        arrayList.add("Student 2");
        arrayList.add("Krishna");
        arrayList.add("Roshan");
        System.out.println(arrayList);

        // Traversing methods

        // 1. for each loop iteration
        for (String str : arrayList) {
            System.out.print(str + "\t\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse() + "\t");
        }

        System.out.println("___________________________________________\n");

        // 2. traversing using iterator
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            next = iterator.next();
            System.out.println(next);
        }

        System.out.println("___________________________________________\n");

        // 3. backword traversal of collection LISTITERATOR
        litr = arrayList.listIterator(arrayList.size());
        while (litr.hasPrevious()) {
            previous = litr.previous();
            System.out.println(previous);
        }

        System.out.println("___________________________________________\n");

        // 4. foreach method
        arrayList.forEach(str -> {
            System.out.println(str);
        });

        System.out.println("___________________________________________\n");
        System.out.println("Sorting using TREESORT\n");

        treeSet = new TreeSet<>();
        treeSet.addAll(arrayList);
        System.out.println(treeSet);

        treeSet.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("\n");

        for (String str : treeSet) {
            System.out.println(str);
        }

        System.out.println("\n");

        treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.println(treeIterator.next());
        }
    }
}
