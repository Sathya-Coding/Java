import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName() + " - ₹" + product.getPrice());
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(productName)) {
                System.out.println("Product removed: " + products.get(i).getName());
                products.remove(i);
                return;
            }
        }
        System.out.println("Product not found: " + productName);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("\n--- Final Cart Items ---");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("\nTotal Price: ₹" + calculateTotal());
    }
}

public class oopsshopping {

    public static void main(String[] args) {
        System.out.println("--- Welcome to the Shopping Cart ---");

        Cart myCart = new Cart();

        Product p1 = new Product("Apple", 30.0);
        Product p2 = new Product("Banana", 10.0);
        Product p3 = new Product("Milk", 45.0);

        myCart.addProduct(p1);
        myCart.addProduct(p2);
        myCart.addProduct(p3);

        System.out.println("\nRemoving product: Banana");
        myCart.removeProduct("Banana");

        myCart.displayCart();

        System.out.println("Thank you for shopping!");
    }
}










