import java.util.function.IntBinaryOperator;

class Operator {
    public static IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;

    public static void main(String[] args) {
        System.out.println(binaryOperator.applyAsInt(11, 1));
    }// Write your code here
}