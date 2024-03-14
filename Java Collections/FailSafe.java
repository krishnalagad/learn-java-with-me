import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * FailSafe
 */
public class FailSafe {
    public static void main(String[] args) {
        
        List<Integer> numbers = new CopyOnWriteArrayList<Integer>();
        numbers.add(1000);
        numbers.add(2000);
        numbers.add(3000);
        numbers.add(4000);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())  {
            numbers.add(5000);  // this line gives ConcurrentModificationException when use normal ArrayList!!
            System.out.println(iterator.next());
        }
    }
}