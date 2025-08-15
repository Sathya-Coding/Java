
import java.util.*;

class StoreProduct {
    String name;
    double price;
    double rating;

    StoreProduct(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " - ₹" + price + " - Rating: " + rating;
    }
}

public class frameworkcollectionproductmultisort{
    public static void main(String[] args) {
        List<StoreProduct> products = Arrays.asList(
                new StoreProduct("Phone", 30000, 4.5),
                new StoreProduct("Laptop", 60000, 4.7),
                new StoreProduct("Tablet", 30000, 4.3),
                new StoreProduct("TV", 60000, 4.7),
                new StoreProduct("Smartwatch", 10000, 4.0)
        );

        products.sort(Comparator
                .comparingDouble((StoreProduct p) -> p.price)
                .thenComparing((StoreProduct p) -> -p.rating)
                .thenComparing(p -> p.name));

        System.out.println("Sorted Products:");
        for (StoreProduct p : products) {
            System.out.println(p);
        }
    }
}

