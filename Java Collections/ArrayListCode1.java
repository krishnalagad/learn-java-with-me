
import java.util.ArrayList;

public class ArrayListCode1 {
    private static ArrayList<String> arrayList;

    private static ArrayList arrayList2;

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Creating collection - two ways
         * 
         * 1) Type safe - same type of elements (objects) are added in the collection
         * 
         * 2) Untyped safe - different types of elements (objects) are added in the
         * collection
         */

        // Type safe
        arrayList = new ArrayList<String>();
        arrayList.add("Krishna");
        // arrayList.add(123); ----gives errror because its type safe collection
        arrayList.add("Stud 1");
        arrayList.add("Stud 2");
        arrayList.add("Krishna");
        System.out.println(arrayList);

        // get the size of the array list
        System.out.println(arrayList.size());

        // get object by index
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        // remove object by value
        arrayList.remove("Krishna");
        System.out.println(arrayList);

        // remove object by index
        arrayList.remove(2);
        System.out.println(arrayList);

        // check object exists
        System.out.println(arrayList.contains("Krishna"));

        // check for empty
        System.out.println(arrayList.isEmpty());

        // untyped safe
        // ----------------------------------------------------------------------------------------------------
        arrayList2 = new ArrayList();
        arrayList2.add("Krishna");
        arrayList2.add("Stud 1");
        arrayList2.add("Stud 2");
        arrayList2.add("Krishna");
        arrayList2.add(21.23); // doesnt gives error because of untyped arrayList.
        arrayList2.add(true);
        System.out.println(arrayList2);
    }
}
