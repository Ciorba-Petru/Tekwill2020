public class Main {
    public static void main(String[] args) {
        User owner = new User("demo-user", "Alexander", "Schmidt");
        Account first = new Account("123456", 1000, owner);
        User.process(first);
    }
}
