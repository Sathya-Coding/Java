import java.util.Scanner;

public class stringlargestword {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();
            String[] words = sentence.split("\\s+");
            String largestWord = "";
            for (String word : words) {
                if (word.length() > largestWord.length()) {
                    largestWord = word;
                }
            }
            System.out.println("The largest word is: " + largestWord);
            System.out.println("Length: " + largestWord.length());
        }
    }



