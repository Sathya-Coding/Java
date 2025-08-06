import java.util.Scanner;

    public class dowhileatm {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int correctPin = 1234;
            int enteredPin;

            do {
                System.out.print("Enter your 4-digit ATM PIN: ");
                enteredPin = sc.nextInt();
            } while (enteredPin != correctPin);

            System.out.println("PIN Verified. Access Granted.");
            sc.close();
        }
    }


