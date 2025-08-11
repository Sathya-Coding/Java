import java.util.Scanner;

public class stringlength {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine();
        int length=input.length();
        System.out.println("The string length is:"+length);
    }
}
