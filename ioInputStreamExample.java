import java.io.FileInputStream;
import java.io.IOException;

public class ioInputStreamExample {
    public static void main(String[]args){
        try{
            FileInputStream fis=new FileInputStream("input.txt");
            int i;
            while((i= fis.read())!=-1);
            System.out.println((char)i);
            fis.close();
        }
        catch(IOException e)

        {
            System.out.println("File not found or error reading file:" + e.getMessage());
        }
    }
}




