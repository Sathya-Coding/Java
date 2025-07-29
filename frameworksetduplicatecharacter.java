import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class  frameworksetduplicatecharacter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            Set<Character> seen = new HashSet<>();
            boolean hasDuplicate = false;
            for (char ch : input.toCharArray()) {
                if (!seen.add(ch)) {
                    hasDuplicate = true;
                    System.out.println("Duplicate character found: " + ch);
                }
            }
            if (!hasDuplicate) {
                System.out.println("No duplicate characters found.");
            }
        }
    }


