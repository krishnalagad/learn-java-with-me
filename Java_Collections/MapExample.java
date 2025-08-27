
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<String, Integer>();
        courses.put("Core Java", 4000);
        courses.put("Advanced Java", 5000);
        courses.put("String Boot", 8000);
        courses.put("Hibernate", 7600);

        System.out.println(courses);

        courses.forEach((key, value) -> {
            System.out.println(key + "\t->\t" + value);
        });

        System.out.println(courses.get("String Boot"));
    }
}
