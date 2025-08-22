import java.util.Arrays;
import java.util.List;

public class Streamexample {
    public static void main(String[]args){
        List<String>student= Arrays.asList("Arun","Bala","Chithra","Anitha");
        student.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
    }
}
