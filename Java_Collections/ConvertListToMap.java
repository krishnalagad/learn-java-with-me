import java.util.*;
import java.util.stream.*;

public class ConvertListToMap {
    static List<Student> students = new ArrayList<Student>();

    static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }

    }

    public static void addData(int id, String name) {
        // 1.
        // Student student = new Student();
        // student.setId(id);
        // student.setName(name);

        // 2.
        Student student = new Student(id, name);
        students.add(student);
    }

    // main method
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 5, 9, 7, 3, 4, 6 };
        // List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        // int i = 0;
        // Map<?, ?> map = list.stream().collect(Collectors.toMap());

        addData(101, "Aakanksha");
        addData(102, "Krishna");
        addData(103, "Aishwarya");

        System.out.println(students);

        Map<Integer, String> resp = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));
        System.out.println(resp);
    }
} 
