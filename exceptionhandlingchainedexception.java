public class exceptionhandlingchainedexception {
    public static void main(String[] args) {
        try {
            Throwable t = new ArithmeticException("Arithmetic Exception");
            t.initCause(new NullPointerException("Cause: Null Pointer"));
            throw (Exception) t;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
