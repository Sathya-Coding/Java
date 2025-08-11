import java.util.Scanner;

public class stringcountstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println("Enter the name to count:");
        String searchName = scanner.nextLine();
        int count = 0;
        for (String name : names) {
            if (name.equalsIgnoreCase(searchName)) {
                count++;
            }
        }
        System.out.println("The name '" + searchName + "' appears " + count + " times.");
    }
}
