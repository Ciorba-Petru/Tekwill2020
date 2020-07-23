public class Employee {
    String name = "unknown";
    int salary = 0;
    String address = "unknown";

    public Employee() {
        this("unknown", 0);
    }

    public Employee(String name, int salary) {
        this.address = "unknown";
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
