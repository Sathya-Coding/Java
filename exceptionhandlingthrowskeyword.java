import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exceptionhandlingthrowskeyword {
    public static void readfile(String filename)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
    public static void main(String[]args){
        try{
           readfile ("example.txt");
        } catch (IOException e) {
            System.out.println("Error:read file error "+e.getMessage());
        }
    }
}
