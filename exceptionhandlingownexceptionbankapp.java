class bankexception extends Exception {
    public bankexception(String message) {
        super(message);
    }
}

    class bankaccount {
        private int balance;
        public bankaccount(int initialbalance){
            this.balance=initialbalance;
        }

        public void withdraw(int amount) throws bankexception {
            if (amount > balance) {
                throw new bankexception("withdraw fail.Balance is to low");
        }
            else{
                System.out.println("withdraw successfull.Remaining balance"+balance);
            }
        }
    }
    public class exceptionhandlingownexceptionbankapp {
    public static void main(String[]args){
        bankaccount myacc=new bankaccount(2000);
        try {
            myacc.withdraw(1000);
        } catch (bankexception e) {
            System.out.println("Error:"+e.getMessage());
        }
    }
}