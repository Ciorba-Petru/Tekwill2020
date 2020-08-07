public class Main {
    public static void main(String[] args) {
        IntBinaryOperation ibo = new Addition(5, 6);
        IntBinaryOperation ibo2 = new Multiplication(5, 6);
        System.out.println(ibo.perform());
        System.out.println(ibo2.perform());
    }
}
