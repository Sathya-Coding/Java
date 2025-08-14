class invalidageexception extends Exception{
    public invalidageexception(String message){
        super(message);
    }
}
public class exceptioncustomexceptionexample {
    public static void validateage(int age)throws invalidageexception{
        if(age<18){
            throw new invalidageexception("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[]args){
        try{
            validateage(25);
        }
        catch (invalidageexception e){
            System.out.println("Exception caught:"+e.getMessage());
        }
    }
}
