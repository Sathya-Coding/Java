class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
    public class exceptionhandlinbgvalidateexception {
        public static void validateNumber(int number) throws NegativeNumberException {
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers not allowed");
            } else {
                System.out.println("Valid number: " + number);
            }
        }
        public static void main(String[] args) {
            try {
                validateNumber(5);
            } catch (NegativeNumberException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }


