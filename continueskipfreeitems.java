public class continueskipfreeitems {
        public static void main(String[] args) {
            int[] prices = {40, 0, 30, 50, 0, 60}; // 0 means free item
            int total = 0;

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] == 0) {
                    continue;
                }
                total += prices[i];
            }

            System.out.println("Total bill excluding free items: ₹" + total);
        }
    }


