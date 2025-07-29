import java.util.ArrayList;
import java.util.List;

public class frameworklistshopping {
    public static void main(String[]args){
        List<String>shopping=new ArrayList<>();
        shopping.add("Milk");
        shopping.add("Biscuit");
        shopping.add("sugar");
        shopping.add("dalta");
        shopping.remove("dalta");
        System.out.println("Groecery Items:"+shopping);
    }
}
