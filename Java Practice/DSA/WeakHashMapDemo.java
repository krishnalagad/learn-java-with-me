package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class WeakHashMapDemo {
    public static void main(String[] args) {
        Map<Person, Integer> map = new WeakHashMap<>();
        Person key1 = new Person("Aakanksha", 24);
        Person key2 = new Person("Krishna", 24);

        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println("WeakHashMap");
        // Call garbage collector
        System.gc();

        System.out.println(map);

        key1 = null;

        // Calla garbage collector
        System.gc();

        System.out.println(map);


    }
}
