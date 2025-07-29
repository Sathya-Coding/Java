import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class frameworksetuniquewords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        for(String word:words){
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Unique words to sentences");
        for(String word:uniqueWords){
            System.out.println(word);
        }
    }
}
