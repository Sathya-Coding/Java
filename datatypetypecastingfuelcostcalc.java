public class datatypetypecastingfuelcostcalc {
        public static void main(String[] args) {
            float litres = 5.5f;
            int pricePerLitre = 102;
            double total = litres * pricePerLitre; // Widening
            int finalBill = (int) total; // Narrowing
            System.out.println("Petrol filled: " + litres + " L");
            System.out.println("Total bill: ₹" + finalBill);
        }
    }


