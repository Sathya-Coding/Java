public class exceptionhandling {
    public static void main(String[]args){
        try{
            int a=10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divided by zero");
        }
        finally {
            System.out.println("This is always runs");
        }
    }
}
