import java.util.Scanner;

    public class breakshopping {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int total = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter price of item " + i + ": ₹");
                int price = sc.nextInt();
                total += price;

                if (total > 500) {
                    System.out.println("Bill crossed ₹500! Stopping shopping.");
                    break;
                }
            }

            System.out.println("Total bill: ₹" + total);
            sc.close();
        }
    }


