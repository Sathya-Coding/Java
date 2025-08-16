import java.io.FileOutputStream;
import java.io.IOException;

public class iofileoutputstreamexample {
    public static void main(String[]args){
        try {
            FileOutputStream fos=new FileOutputStream("Output.txt");
            String data="Writing using FileOutputStream";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written sucessfully");
        }
        catch(IOException e){
            System.out.println("Error writing to file");
        }
    }
}
