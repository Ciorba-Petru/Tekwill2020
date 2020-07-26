public class Main {
    public static void main(String[] args) {
        Counter box = new Counter();
        box.inc(10);
        System.out.println(box.getCurrent());
    }
}
