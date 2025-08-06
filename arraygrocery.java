import java.util.Scanner;
    public class arraygrocery {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] prices = new int[5];
            for (int i = 0; i < 5; i++) {
                prices[i] = sc.nextInt();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Item " + (i + 1) + ": ₹" + prices[i]);
            }
            sc.close();
        }
    }


