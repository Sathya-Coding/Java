import java.util.*;

public class frameworklistremovelist {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        List<Integer>numbers=new ArrayList<>();
        System.out.println("Number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("elements of"+(i+1)+":");
            numbers.add(sc.nextInt());

        }
        Set<Integer>uniqueset=new HashSet<>(numbers);
        List<Integer>uniquelist=new ArrayList<>(uniqueset);
        System.out.println("Removing element of list"+uniquelist);

    }
}
