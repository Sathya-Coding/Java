import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streammapexample {
    public static void main(String[]args){
        List<String>names= Arrays.asList("Arun","Bala","Chithra","Anitha");
        List<String>Uppercase=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(Uppercase);
    }
}
