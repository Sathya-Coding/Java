import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class frameworkmapphonebook {
        public static void main(String[] args) {
            Map<String, String> phoneBook = new HashMap<>();
            phoneBook.put("Sathya","9876543210");
            phoneBook.put("Manikandan", "9876501234");
            phoneBook.put("Magizhini", "9123456789");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a name to search phone number: ");
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println("" + name + "'s Phone Number: " + phoneBook.get(name));
            } else {
                System.out.println(" Contact not found for name: " + name);
            }
        }
    }


