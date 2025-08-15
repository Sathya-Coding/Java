import java.util.HashMap;
import java.util.Map;

public class frameworkmapwordfrequency {
    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
