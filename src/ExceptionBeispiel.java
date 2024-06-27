public class ExceptionBeispiel {
    public static int divide(
            int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return numerator / denominator;
    }

    public static int safeDivide(int numerator, int denominator) {
        if (denominator == 0) {
            return Integer.MIN_VALUE;
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            int result = safeDivide(10, 0);
            System.out.println("Das Ergebnis ist: "
                    + result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: " +
                    e.getMessage());
        }
    }
}