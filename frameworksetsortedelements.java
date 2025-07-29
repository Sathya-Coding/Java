import java.util.*;

public class frameworksetsortedelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> sorted = new HashSet<>();
        System.out.println("Enter the elements of set:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Elements of" + (i + 1) + ":");
            sorted.add(sc.nextInt());
        }
        List<Integer>Sortlist=new ArrayList<>();
        Collections.sort(Sortlist);
        System.out.println("The Sorted List"+sorted);
    }
}