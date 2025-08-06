import java.util.Scanner;
    public class arrayproduct {
        public static void main(String[] args) {
            int[] prices = {25, 40, 60, 80, 100};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a key:");
            int key = sc.nextInt();
            boolean found = false;
            for (int price : prices) {
                if (price == key) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Available");
            } else {
                System.out.println("Not Found");
            }
        }
    }


