import java.io.FileOutputStream;
import java.io.IOException;
public class exceptionhandlingasciicode {
        public static void main(String[] args) {
            try (FileOutputStream fos = new FileOutputStream("alphabet.txt")) {
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    fos.write(ch);
                }
                System.out.println("A-Z written to alphabet.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


