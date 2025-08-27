import java.util.*;

public class ComparableClass {
    static List<Emp> emps = new ArrayList<>();

    public class Emp implements Comparable<Emp> {
        private int empId;
        private String name;
        private String phone;

        public Emp() {
        }

        public Emp(int empId, String name, String phone) {
            this.empId = empId;
            this.name = name;
            this.phone = phone;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Emp [empId=" + empId + ", name=" + name + ", phone=" + phone + "]";
        }

        @Override
        public int compareTo(ComparableClass.Emp o) {
            return this.empId - o.empId;
        }

    }

    public void addEpm(int id, String name, String no) {
        Emp emp = new Emp(id, name, no);
        emps.add(emp);
    }

    public void printList() {
        System.out.println(emps);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ComparableClass c = new ComparableClass();
        c.addEpm(122, "Krishna Lagad", "9834566763");
        c.addEpm(121, "Honey Singh", "9834566763");
        c.addEpm(120, "Anup Jalota", "9834566763");
        c.printList();

        Collections.sort(emps);

        // Comparable
        c.printList();
    }
}