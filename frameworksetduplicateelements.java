import java.util.*;

public class frameworksetduplicateelements {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        List<String> Items=new ArrayList<>();
        System.out.println("The number of elements:");
        int n=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("The elements of"+(i+1)+":");
            Items.add(scanner.nextLine());
        }
        Set<String>uniqueitems=new HashSet<>(Items);
        System.out.println("The list of duplicates"+Items);
        System.out.println("The unique items of"+uniqueitems);
    }
}
