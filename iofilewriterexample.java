import java.io.FileWriter;
import java.io.IOException;

public class iofilewriterexample {
        public static void main(String[]args){
            try {
                FileWriter fw = new FileWriter("output.text");
                fw.write("Hello from FileWriter");
                fw.close();
                System.out.println("Data written successfully");
            } catch (IOException e) {
                System.out.println("An error occures"+e.getMessage());

            }
        }
    }


