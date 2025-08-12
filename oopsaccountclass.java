import java.util.Scanner;

public class oopsaccountclass {
    String holdername;
    int accno;
    double amount;

    void details() {
        System.out.println("Holder name:" + holdername);
        System.out.println("Account No:" + accno);
        System.out.println("Balance" + amount);
    }
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Account 1 details:");
            System.out.println("Holder name:");
            String name1 = scanner.nextLine();
            System.out.println("Account No:");
            int accno1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Balance amount:");
            double amount1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter the Account 2 details:");
            System.out.println("Holder name:");
            String name2 = scanner.nextLine();
            System.out.println("Account No:");
            int accno2 = scanner.nextInt();
            System.out.println("Balance amount:");
            double amount2 = scanner.nextDouble();
            oopsaccountclass acc1=new oopsaccountclass();
            oopsaccountclass acc2=new oopsaccountclass();
       }
}


