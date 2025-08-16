
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class iouserfilewriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the paragraph:\n");
        String data = scanner.nextLine();
        try {
            FileWriter fr = new FileWriter("user.txt");
            fr.write(data);
            fr.close();
            System.out.println("Paragraph saved in user.txt successfully");
        } catch (IOException e) {
            System.out.println("Data didn't find" + e.getMessage());
        }
    }
}