import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentCollections {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add(new String("Krishna"));
        list.add(new String("Dilip"));
        list.add(new String("Lagad"));

        System.out.println("CopyOnWriteArrayList: " + list);

        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>() {
            {
                add(new String("Krishna"));
                add(new String("Dilip"));
                add(new String("Lagad"));
            }
        };
        System.out.println("CopyOnWriteArraySet: " + set);

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>() {
            {
                put(1, "Krishna");
                put(2, "Dilip");
                put(3, "Lagad");
            }
        };
        System.out.println("ConcurrentHashMap: " + map);
    }
}
