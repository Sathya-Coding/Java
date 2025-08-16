import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

     public class iocopyfile {
        public static void main(String[] args) {
            FileReader reader = null;
            FileWriter writer = null;
            try {
                reader = new FileReader("user.txt");
                writer = new FileWriter("destination.txt");
                int ch;
                while ((ch = reader.read()) != -1) {
                    writer.write(ch);
                }
                System.out.println("File copied successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                try {
                    if (reader != null)
                        reader.close();
                    if (writer != null)
                        writer.close();
                } catch (IOException e) {
                    System.out.println("Error while closing files: " + e.getMessage());
                }
            }
        }
    }


