import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exceptionhandlingthrowsexample {
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }

    }