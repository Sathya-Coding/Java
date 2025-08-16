import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ioexceptiondiaryapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "diary.txt";

        System.out.println("1. Write new entry");
        System.out.println("2. Read all entries");
        System.out.print("Choose option (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter your diary entry: ");
            String entry = sc.nextLine();
            String today = LocalDate.now().toString();

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
                bw.write("[" + today + "]");
                bw.newLine();
                bw.write(entry);
                bw.newLine();
                bw.newLine();
                bw.close();
                System.out.println("Entry saved! ✅");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else if (choice == 2) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid option ");
        }
    }
}
