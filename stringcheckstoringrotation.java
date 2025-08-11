import java.util.Scanner;

public class stringcheckstoringrotation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first string:");
            String str1 = scanner.nextLine();
            System.out.println("Enter the second string:");
            String str2 = scanner.nextLine();
            if (str1.length() == str2.length()) {
                String combined = str1 + str2;
                if (combined.contains(str2)) {
                    System.out.println("Yes, " + str2 + " is a rotation of " + str1 + ":");
                } else {
                    System.out.println("No, " + str2 + " is not a rotation of " + str1 + ":");
                }
            } else {
                System.out.println("No, because lengths are different.");
            }
        }
    }

