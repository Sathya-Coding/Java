import java.util.Scanner;

class Bankaccount {
    double balance;
    void inputbalance(double amount){
        balance=amount;
    }
    void displaybalance(){
        System.out.println("Account Balance:"+balance);
    }
}class Intrest extends Bankaccount {
    void intrestrate() {
        double intrest = balance * 0.05;
        System.out.println("Intrest Earned:" + intrest);
    }

    void displaybalance() {
        System.out.println("Savings Account Balance:" + balance);
    }

    static class Current extends Bankaccount {
        void overdraft() {
            if (balance >= 0) {
                System.out.println("Overdraft within limit:Allowed");
            } else {
                System.out.println("Overdraft exceed!");
            }
        }

        void displaydetails() {
            System.out.println("Current Account:" + balance);
        }
    }
}
public class inheritanceinputaccount {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose Account Type: 1.Savings Account 2.Current Account");
        int choice=scanner.nextInt();
        System.out.println("Enter the account Balance:");
        double userbalance=scanner.nextDouble();
        Bankaccount ba;
        if(choice==1){
            ba=new Intrest();
            ba.inputbalance(userbalance);
            ba.displaybalance();
            ((Intrest)ba).intrestrate();
        } else if (choice==2) {
            ba=new Intrest.Current();
            ba.inputbalance(userbalance);
            ba.displaybalance();
            ((Intrest.Current)ba).overdraft();
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
