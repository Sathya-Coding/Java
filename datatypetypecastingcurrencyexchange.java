public class datatypetypecastingcurrencyexchange {
        public static void main(String[] args) {
            double dollars = 12.75;
            double rupees = dollars * 83.20;
            int roundedRupees = (int) rupees; // Narrowing
            System.out.println("You will receive ₹" + roundedRupees + " after conversion.");
        }
    }


