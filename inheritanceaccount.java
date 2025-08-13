class accounts {
    void Savingsaccount() {
        System.out.println("Savings Account Balance:15000");
    }

    void Currentaccount() {
        System.out.println("Current Account Balance:5000");
    }
}
class intrest extends accounts{
    void intrestrate(){
        System.out.println("Intrest Earned:600");
    }
}
class amount extends accounts{
    void amounts(){
        System.out.println("Overdraft within limit : Allowed");
    }
}
public class inheritanceaccount {
    public static void main(String[]args){
        accounts acc1=new intrest();
        acc1.Savingsaccount();
        ((intrest)acc1).intrestrate();
        System.out.println();
        accounts acc2=new amount();
        acc2.Currentaccount();
        ((amount)acc2).amounts();

        System.out.println();
    }

}
