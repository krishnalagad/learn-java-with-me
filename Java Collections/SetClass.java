import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {

    static Set<Data> dataHashSet = new HashSet<Data>();
    static Set<Data> dataLinkedHashSet = new LinkedHashSet<Data>();
    static Set<Integer> data = new HashSet<Integer>();
    static Set<Integer> data1 = new LinkedHashSet<Integer>();

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

    static void addDataToHashSet(int id, String name, String mob) {
        dataHashSet.add(new Data(id, name, mob));
    }

    static void addDataToLinkedHashSet(int id, String name, String mob) {
        dataLinkedHashSet.add(new Data(id, name, mob));
    }

    static void printHashSet() {
        System.out.println(dataHashSet);
    }

    static void printLinkedHashSet() {
        System.out.println(dataLinkedHashSet);
    }

    public static void main(String[] args) {
        addDataToHashSet(101, "Krishna", "0987653456");
        addDataToHashSet(102, "Student", "5678092345");
        addDataToHashSet(103, "Lagad", "8745673456");
        addDataToHashSet(104, "Surname", "9876567890");
        printHashSet();

        addDataToLinkedHashSet(101, "Krishna", "0987653456");
        addDataToLinkedHashSet(102, "Aakanksha", "5678092345");
        addDataToLinkedHashSet(103, "Lagad", "8745673456");
        addDataToLinkedHashSet(104, "Yadav", "9876567890");
        printLinkedHashSet();

        // converting set to array
        for (Object data : dataHashSet.toArray()) {
            System.out.println(data);
        }

        data.add(10);
        data.add(20);
        data.add(10);
        data.add(40);
        System.out.println(data);

        data1.add(10);
        data1.add(20);
        data1.add(10);
        data1.add(40);
        System.out.println(data1);
    }
}
