import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Comparator {
    static class User {

        private int id;
        private String name;
        private String address;

        public User() {
        }

        public User(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
        }

    }

    public static void main(String[] args) {
        User user1 = new User(1, "Krishna", "Pune");
        User user2 = new User(2, "Aakanksha", "Pune");
        User user3 = new User(3, "Lagad", "Pune");
        User user4 = new User(4, "Yadav", "Pune");
        User user5 = new User(5, "ABC", "Pune");
        User user6 = new User(6, "PQR", "Pune");

        ConcurrentHashMap<User, Integer> map = new ConcurrentHashMap<>() {
            // {
            //     put(1, user1);
            //     put(2, user2);
            //     put(3, user3);
            //     put(4, user4);
            //     put(5, user5);
            //     put(6, user6);
            // }
            {
                put(user1, 1);
                put(user2, 2);
                put(user3, 3);
                put(user4, 4);
                put(user5, 5);
                put(user6, 6);
            }
        };
        System.out.println(map);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        List<User> list = new ArrayList<User>() {
            {
                add(user1);
                add(user2);
                add(user3);
                add(user4);
                add(user5);
                add(user6);
            }
        };

        System.out.println(list);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        Arrays.sort(arr);
        Collections.sort(list, new java.util.Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                // Add your comparison logic here
                return u1.getName().compareTo(u2.getName());
            }
        });

        System.out.println(list);
    }
}
