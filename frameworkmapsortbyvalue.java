import java.util.*;

    public class frameworkmapsortbyvalue {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<String, Integer> map = new HashMap<>();
            System.out.print("Enter number of entries: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter value: ");
                int value = sc.nextInt();
                map.put(name, value);
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());
            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            System.out.println("Sorted Map by Values:");
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
