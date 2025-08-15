import java.util.HashMap;
import java.util.Map;

public class frameworkhashmap {
    public static void main(String[]args){
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Grapes");
        map.put(1,"banana");
        System.out.println("Fruits"+map);
    }
}
