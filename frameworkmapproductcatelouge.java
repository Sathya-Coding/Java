import java.util.*;

    public class frameworkmapproductcatelouge  {
        public static void main(String[] args) {
            Map<String, Double> productCatalog = new HashMap<>();
            productCatalog.put("Milk", 25.5);
            productCatalog.put("Bread", 15.0);
            productCatalog.put("Butter", 45.75);
            System.out.println("Product Catalog:");
            for (Map.Entry<String, Double> entry : productCatalog.entrySet()) {
                System.out.println(entry.getKey() + " → ₹" + entry.getValue());
            }
        }
    }


