import java.util.Scanner;

class BankAccounts {
    private double balance;

    public BankAccounts() {
        balance = 100000;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Successfully");
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public void withdraw(double amount){
        if(amount<=100000){
            balance-=amount;
            System.out.println("Withdrawal Successfully");
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public void checkbalance(){
        System.out.println("Current Balance"+balance);
    }
}public class oopsabstractaccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccounts acc = new BankAccounts();
        int choice;

        do {
            System.out.println("-----Welcome My Bank-----");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Deposit Amount");
                    double dep = scanner.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.println("Enter your Withdrawal Amount");
                    double witdraw = scanner.nextInt();
                    acc.withdraw(witdraw);
                    break;
                case 3:
                    System.out.println("Check Balance");
                    acc.checkbalance();
                    break;
                case 4:
                    System.out.println("Thank you for using My Bank");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
            while (choice != 4) ;
    }
}
