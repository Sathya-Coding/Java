import java.util.*;

    public class frameworkmapnaqmeage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<String, Integer> nameAgeMap = new HashMap<>();

            System.out.print("Enter number of entries: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                nameAgeMap.put(name, age);
            }

            System.out.println("Name → Age:");
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }


