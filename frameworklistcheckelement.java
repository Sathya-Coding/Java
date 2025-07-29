import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class frameworklistcheckelement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        List<Integer>numbers=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements:"+(i+1)+":");
            numbers.add(sc.nextInt());
        }
        System.out.println("Search to the element");
        int target=sc.nextInt();

        if(numbers.contains(target)){
            System.out.println("The contain is exist");
        }
        else{
            System.out.println("The element does not exist");
        }
    }

}
