import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class frameworklistreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();

        System.out.print("Enter how many elements: ");
        int numbers = sc.nextInt();

        System.out.println("Enter " + numbers + " elements:");
        for (int i = 0; i < numbers; i++) {
            int num = sc.nextInt();
            number.add(num);
        }

        Collections.reverse(number);

        System.out.println("Reversed List: " + number);

    }
}
