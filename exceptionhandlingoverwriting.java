
    import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    public class exceptionhandlingoverwriting {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to append: ");
            String input = sc.nextLine();

            try (FileWriter writer = new FileWriter("user.txt", true)) {
                writer.write(input + System.lineSeparator());
                System.out.println("Text appended to file successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


