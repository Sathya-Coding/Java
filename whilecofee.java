
    import java.util.Scanner;

    public class whilecofee {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of customers waiting: ");
            int customers = sc.nextInt();
            int token = 1;

            while (token <= customers) {
                System.out.println("Serving Token No: " + token);
                token++;
            }
            sc.close();
        }
    }


