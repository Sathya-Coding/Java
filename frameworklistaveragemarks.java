import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class frameworklistaveragemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> marks = new ArrayList<>();
        System.out.println("Enter number of Subject:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("marks" + (i + 1) + ":");
            int mark = sc.nextInt();
            marks.add(mark);
        }
        int sum=0;
        for (int m : marks) {
            sum += m;
        }
        double average=(double) sum/marks.size();
        System.out.println("Average Marks:"+average);
    }
}