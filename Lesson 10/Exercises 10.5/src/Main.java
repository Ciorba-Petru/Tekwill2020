public class Main {
    public static void main(String[] args) {
        User petru = new User();
        petru.setFirstName(null);
        petru.setLastName("Ciorba");
        System.out.println(petru.getFullName());
    }
}
