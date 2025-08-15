import java.util.*;

   public class frameworkmapcharfrequency {
        public static void main(String[] args) {
            String str = "character";
            Map<Character, Integer> charCount = new HashMap<>();

            for (char ch : str.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            System.out.println("Character Frequency:");
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }


