import java.io.*;
import java.util.Scanner;

public class exceptionhandlingwordcounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String target = sc.nextLine();
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("user.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }

            System.out.println("The word '" + target + "' appears " + count + " times.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
