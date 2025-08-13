class Order {
    void processorder() {
        System.out.println("Order generating");
    }
}
    class Onlineorder extends Order {
        void processorder() {
            System.out.println("Process Order:");
            System.out.println("1.Verify orders");
            System.out.println("2.Pack items");
            System.out.println("Ready to shipping items");
        }
    }
    class Instoreorder extends Order {
        void processorder() {
            System.out.println("In Store Order");
            System.out.println("1.Verify item availability");
            System.out.println("2.Generate bill");
            System.out.println("3.Deliver to shipping address");
        }
    }

public class inheritanceorder {
    public static void main(String[]args){
        Order order;
        order = new Onlineorder();
        order.processorder();
        System.out.println();
        order = new Instoreorder();
        order.processorder();
    }
}
