import java.util.*;

public class ComparatorClass {
    static ArrayList<Emp> emps = new ArrayList<>();

    public class Emp {
        private int id;
        private String name;
        private String number;

        public Emp() {
        }

        public Emp(int id, String name, String number) {
            this.id = id;
            this.name = name;
            this.number = number;
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

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Emp [id=" + id + ", name=" + name + ", number=" + number + "]";
        }
    }

    public void addEmp(int id, String name, String number) {
        Emp emp = new Emp(id, name, number);
        emps.add(emp);
    }

    public void printList() {
        System.out.println(emps);
    }

    public static class IdComparator implements Comparator<Emp> {

        @Override
        public int compare(ComparatorClass.Emp o1, ComparatorClass.Emp o2) {
            return o1.getId() - o2.getId();
        }

    }

    public static class NameComparator implements Comparator<Emp> {
        public int compare(ComparatorClass.Emp o1, ComparatorClass.Emp o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    /**
     * @param args
     */
    // main method
    public static void main(String[] args) {
        ComparatorClass c = new ComparatorClass();
        c.addEmp(122, "Krishna Lagad", "9834566763");
        c.addEmp(121, "Honey Singh", "9834566763");
        c.addEmp(120, "Anup Jalota", "9834566763");
        c.printList();

        Collections.sort(emps, new IdComparator());
        c.printList();

        ArrayList<Emp> emps2 = new ArrayList<Emp>(emps);
        Collections.sort(emps2, new NameComparator());
        System.out.println(emps2);
    }
}
