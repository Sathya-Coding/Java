import java.util.Scanner;

public class stringreversestring {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=scanner.nextLine();
        String reverse=new StringBuilder(input).reverse().toString();
        System.out.println("Reverse String are:"+reverse);
    }
}
