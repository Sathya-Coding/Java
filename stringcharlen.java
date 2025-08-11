import java.util.Scanner;

public class stringcharlen {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + ": " + count);
            }
        }
    }
