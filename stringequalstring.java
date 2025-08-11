import java.util.Scanner;

public class stringequalstring {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String 1");
        String input = scanner.nextLine();
        System.out.println("Enter a String 2");
        String input2 = scanner.nextLine();
        if (input.equals(input2)) {
            System.out.println("The Strings are equal");
        } else {
            System.out.println("The Strings are not equal");
        }
    }
}
