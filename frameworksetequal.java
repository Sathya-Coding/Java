import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class frameworksetequal {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        System.out.println("Enter the elements of set1:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            System.out.println("Elements of"+(i+1)+":");
            set1.add(sc.nextInt());
        }
        System.out.println("Enter the elements of set2:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            System.out.println("Elements of"+(i+1)+":");
            set2.add(sc.nextInt());
        }
        if(set1.equals(set2)){
            System.out.println("The elements are equal");
        }
        else{
            System.out.println("The elements is not equal");
        }
    }
}
