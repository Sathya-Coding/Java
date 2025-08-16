import java.io.*;

public class iolibrarysummary {
    public static void main(String[] args) {
        String inputFile = "emaillog.txt";
        String outputFile = "borrowed_summary.txt";

        String[] users = new String[100];
        String[] books = new String[100];
        int userCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String user = parts[0].trim();
                    String book = parts[1].trim();

                    boolean found = false;
                    for (int i = 0; i < userCount; i++) {
                        if (users[i].equals(user)) {
                            books[i] += ", " + book;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        users[userCount] = user;
                        books[userCount] = book;
                        userCount++;
                    }
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (int i = 0; i < userCount; i++) {
                bw.write(users[i] + ": " + books[i]);
                bw.newLine();
            }
            bw.close();

            System.out.println("Summary written to borrowed_summary.txt ✅");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
