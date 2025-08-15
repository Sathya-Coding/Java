import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    public class frameworkmapdictionary  {
        public static void main(String[] args){
            Map<String, String> dictionary = new HashMap<>();
            dictionary.put("hello", "A greeting or expression of goodwill.");
            dictionary.put("java", "A high-level programming language.");
            dictionary.put("apple", "A sweet fruit that grows on trees.");
            dictionary.put("book", "A set of written or printed pages.");
            dictionary.put("computer", "An electronic device for processing data.");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word to search its meaning: ");
            String word = scanner.nextLine().toLowerCase();
            if (dictionary.containsKey(word)) {
                System.out.println("Meaning of '" + word + "': " + dictionary.get(word));
            } else {
                System.out.println("Sorry, word not found in dictionary.");
            }
        }
    }


