import java.util.Iterator;
import java.util.Map;


public class ConcurrentHashMap {
     public static void main(String[] args) {
        Map<String, String> map = new java.util.concurrent.ConcurrentHashMap<String, String>() {{
            put("Pune", "Maharastra");
            put("Prayagraj", "Uttar Pradesh");
            put("Belgaon", "Karnataka");
        }};

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            map.remove("Pune");
        }
    }
}
