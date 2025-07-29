import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class frameworklistmaxminnumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        List<Integer>numbers=new ArrayList<>();
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("The elements"+(i+1)+":");
            numbers.add(sc.nextInt());
        }
            int max=Collections.max(numbers);
            int min=Collections.min(numbers);
            System.out.println("The maximum number of:"+max);
            System.out.println("The minimum number of:"+min);


    }
}
