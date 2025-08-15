import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class frameworkcollectiondescendingarray {
    public static void main(String[]args){
        List<String>names=new ArrayList<>(Arrays.asList("sathya","sumi","hema"));
        Collections.sort(names);
        Collections.reverse(names);
        System.out.println("Ascending orders names:"+names);
        System.out.println("Reverse"+names);
    }
}
