import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class StreamApi {
    static class User{
        private Integer id;
        private String username;
        private String password;
        private String email;
        
        public User() {
        }
        public User(Integer id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        @Override
        public String toString() {
            return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
        }
        
    }
    public static void main(String[] args) {
        List<User> users = IntStream.rangeClosed(1, 20)
				.mapToObj(index -> new User(index, "User" + index, UUID.randomUUID().toString(), 
                UUID.randomUUID().toString() + "@stream.com")).toList();
        System.out.println(users);
    }
}