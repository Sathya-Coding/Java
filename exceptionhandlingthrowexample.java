public class exceptionhandlingthrowexample {
        public static void checkAge(int age) {

            if (age <= 18) {
                throw new ArithmeticException("Age must be 18+");
            }
            else {
                System.out.println("Access Granted");
            }
        }
        public static void main(String[]args){
            checkAge(15);
        }
    }


