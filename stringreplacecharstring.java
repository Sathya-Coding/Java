import java.util.Scanner;

public class stringreplacecharstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=scanner.nextLine();
        System.out.println("The old text is");
        String oldtext=scanner.nextLine();
        System.out.println("The new text is");
        String newtext=scanner.nextLine();
        String output=input.replace(oldtext,newtext);
        System.out.println("The replace string is:"+output);
    }
}