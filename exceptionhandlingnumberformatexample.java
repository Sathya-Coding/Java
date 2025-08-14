import java.util.Scanner;

public class exceptionhandlingnumberformatexample {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("The value is");
            String str=scanner.nextLine();
            int number=Integer.parseInt(str);
            System.out.println("The number is:"+number);
        }
        catch (NumberFormatException e) {
            System.out.println("Number format exception caught"+e.getMessage());
        }
        finally{
            System.out.println("The program executed");
        }
    }
}
