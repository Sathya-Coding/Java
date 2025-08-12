import java.util.Scanner;
abstract class vehicle {
    protected String model;
    protected int rentperday;
    public vehicle(String model, int rentperday) {
        this.model = model;
        this.rentperday = rentperday;
    }
    public abstract int calculaterent(int days);
}
class car extends vehicle {
    public car(String model, int rentperday) {
        super(model, rentperday);
    }
    public int calculaterent(int days) {
        return rentperday * days;
    }
}
class bike extends vehicle {
    public bike(String model, int rentperday) {
        super(model, rentperday);
    }
    public int calculaterent(int days) {
        return rentperday * days;
    }
}
public class oopsvehiclerent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Car\n2. Bike");
        System.out.print("Choose vehicle type: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter model name: ");
        String model = sc.nextLine();
        System.out.print("Enter rent per day: ");
        int rentperday = sc.nextInt();
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        vehicle v;
        if (choice == 1) {
            v = new car(model, rentperday);
        } else {
            v = new bike(model, rentperday);
        }
        int total = v.calculaterent(days);
        System.out.println("----- Receipt -----");
        System.out.println("Vehicle: " + model);
        System.out.println("Days: " + days);
        System.out.println("Total Rent: ₹" + total);
    }
}


