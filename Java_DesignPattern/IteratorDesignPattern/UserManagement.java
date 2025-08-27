import java.util.*;

public class UserManagement {

    private List<User> userList = new ArrayList<User>();

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getUser(int index) {
        return this.userList.get(index);
    }

    public MyIterator getItertor() {
        return new MyIteratorImpl(this.userList);
    }
}
