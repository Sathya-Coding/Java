public class exceptionhandliingfinallywithreturn {
    public static int testMethod() {
        try {
            System.out.println("Inside try block");
            return 1;
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return 2;
        } finally {
            System.out.println("Inside finally block");
        }
    }

        public static void main(String[] args) {
            int result = testMethod();
            System.out.println("Returned value: " + result);
        }
   }

