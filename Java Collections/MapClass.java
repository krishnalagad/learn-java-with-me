import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

    static Map<Integer, Data> treeMap = new TreeMap<>();
    static Map<Integer, Data> hashMap = new HashMap<>();
    static Map<Integer, Data> linkedHashMap = new LinkedHashMap<>();

    static class Data {
        private int id;
        private String name;
        private String mob;

        public Data() {
        }

        public Data(int id, String name, String mob) {
            this.id = id;
            this.name = name;
            this.mob = mob;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMob() {
            return mob;
        }

        public void setMob(String mob) {
            this.mob = mob;
        }

        @Override
        public String toString() {
            return "Data [id=" + id + ", mob=" + mob + ", name=" + name + "]";
        }
    }

    public static void addData(int id, String name, String mob) {
        treeMap.put(id, new Data(id, name, mob));
        hashMap.put(id, new Data(id, name, mob));
        linkedHashMap.put(id, new Data(id, name, mob));
    }

    public static void printMap() {
        System.out.println(treeMap);
    }

    public static void printSystematicTreeMap() {
        treeMap.forEach((k, v) -> {
            System.out.println(k + "\t->\t" + v);
        });
        System.out.println();
    }

    public static void printSystematicHashMap() {
        hashMap.forEach((k, v) -> {
            System.out.println(k + "\t->\t" + v);
        });
        System.out.println();
    }

    public static void printSystematicLinkedHashMap() {
        linkedHashMap.forEach((k, v) -> {
            System.out.println(k + "\t->\t" + v);
        });
        System.out.println();
    }

    public static void main(String[] args) {
        addData(101, "Krishna", "9098765654");
        addData(103, "Student", "9098765654");
        addData(102, "Lagad", "9098765654");
        addData(104, "Surname", "9098765654");

        printSystematicHashMap();
        printSystematicTreeMap();
        printSystematicLinkedHashMap();

        Collection<Data> coll = treeMap.values();
        System.out.println(coll);

        coll.forEach((v) -> {
            System.out.println(v.getName());
        });

    }
}
