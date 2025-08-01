public class datatypevariabledeclaration {
        public static void main(String[] args) {
            byte age=28;
            short customerId=1234;
            int accountBalance=15000;
            long mobileNumber=9876543210L;
            float milkLitres=1.5f;
            double groceryBill=894.75;
            char gender='F';
            boolean isMember=true;
            String customerName="Sathya";
            System.out.println("------ Customer Details ------");
            System.out.println("Name           : "+customerName);
            System.out.println("Age            : "+age);
            System.out.println("Customer ID    : "+customerId);
            System.out.println("Gender         : "+gender);
            System.out.println("Mobile Number  : "+mobileNumber);
            System.out.println("Account Balance: ₹"+accountBalance);
            System.out.println("Milk Ordered   : "+milkLitres+" Litres");
            System.out.println("Grocery Bill   : ₹"+groceryBill);
            System.out.println("Membership     : "+(isMember?"Active Member":"Not a Member"));
        }
    }


