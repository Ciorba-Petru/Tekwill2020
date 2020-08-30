public class Converter {
    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException exception) {
            // Output expected NumberFormatException.
            return 0;
        } catch (Exception exception) {
            // Output unexpected Exceptions.
            return 0;
        }
    }
}


