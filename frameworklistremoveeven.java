import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class frameworklistremoveeven {
    public static void main(String[]args){
        List<Integer>evenremove= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        evenremove.removeIf(n->n%2==0);
        System.out.println("Remove even numbers"+evenremove);

    }
}
