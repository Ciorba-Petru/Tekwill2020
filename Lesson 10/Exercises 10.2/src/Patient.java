public class Patient {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("Hello, My name is " + name + ", I need a doctor.");
    }
}
