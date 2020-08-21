
import java.util.function.UnaryOperator;
class PrefixSuffixOperator {
    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";
    public static UnaryOperator<String> operator = (word)-> PREFIX + word.trim() + SUFFIX;// write your code here

    public static void main(String[] args) {
        System.out.println(operator.apply("Petru"));
    }
}