import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class frameworksetvotersystem  {
        public static void main(String[] args) {
            Set<String> voters = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter voter name (or type 'exit' to stop): ");
                String name = scanner.nextLine().trim();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }
                if (voters.contains(name)) {
                    System.out.println("❌ " + name + " has already voted. Skipping...");
                } else {
                    voters.add(name);
                    System.out.println("✅ " + name + " is allowed to vote.");
                }
            }
            System.out.println("\n🗳️ Final List of Voters:");
            for (String voter : voters) {
                System.out.println(voter);
            }
        }
    }


