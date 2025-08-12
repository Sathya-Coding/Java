class productdetails {
    String name;
    int quantity;
    double price;
    void details(){
        System.out.println("Name: "+name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
    }
}
public class oppsproduct {
    public static void main(String[]args){
        productdetails product1=new productdetails();
        product1.name="laptop";
        product1.quantity=2;
        product1.price=52999.50;
        productdetails product2=new productdetails();
        product2.name="phone";
        product2.quantity=5;
        product2.price=15500.40;
        System.out.println(" Product 1: ");
        product1.details();
        System.out.println("Product 2: ");
        product2.details();

    }

}
