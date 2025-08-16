
    import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class iouppercasetext {
        public static void main(String[] args) {
            FileReader reader = null;
            FileWriter writer = null;
            try {
                reader = new FileReader("user.txt");  //
                writer = new FileWriter("uppercase.txt");
                int ch;
                while ((ch = reader.read()) != -1) {
                    char character = (char) ch;
                    if (Character.isLowerCase(character)) {
                        character = Character.toUpperCase(character);
                    }
                    writer.write(character);
                }
                System.out.println("Conversion completed. Check 'uppercase.txt'.");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                try {
                    if (reader != null) reader.close();
                    if (writer != null) writer.close();
                } catch (IOException e) {
                    System.out.println("Error closing files: " + e.getMessage());
                }
            }
        }
    }


