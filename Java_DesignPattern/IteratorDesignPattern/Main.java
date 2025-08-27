class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("1", "Krishna"));
        userManagement.addUser(new User("2", "Aakanksha"));
        userManagement.addUser(new User("3", "Geeta"));
        userManagement.addUser(new User("4", "Varsha"));

        MyIterator userItr = userManagement.getItertor();
        while (userItr.hasNext()) {
            System.out.println(userItr.next());
        }
    }
}