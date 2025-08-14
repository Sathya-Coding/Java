
    import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class exceptionhandlingbinaryfileread {
        public static void main(String[] args) {
            FileInputStream input = null;
            FileOutputStream output = null;

            try {
                System.out.println("Working Directory = " + System.getProperty("user.dir"));
                input = new FileInputStream("sample.jpg");
                output = new FileOutputStream("copy.jpg");

                int byteData;
                while ((byteData = input.read()) != -1) {
                    output.write(byteData);
                }

                System.out.println("Binary file copied successfully!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                try {
                    if (input != null) input.close();
                    if (output != null) output.close();
                } catch (IOException e) {
                    System.out.println("Error closing streams: " + e.getMessage());
                }
            }
        }
    }


