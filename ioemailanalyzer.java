import java.io.*;

public class ioemailanalyzer {
    public static void main(String[] args) {
        String inputFile = "summary.txt";
        String outputFile = "summarys.txt";

        String[] users = new String[100];
        int[] counts = new int[100];
        int userCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String email = parts[1].trim();

                    boolean found = false;
                    for (int i = 0; i < userCount; i++) {
                        if (users[i].equals(email)) {
                            counts[i]++;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        users[userCount] = email;
                        counts[userCount] = 1;
                        userCount++;
                    }
                }
            }

            br.close();

            // Write summary
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (int i = 0; i < userCount; i++) {
                bw.write(users[i] + " - " + counts[i] + (counts[i] == 1 ? " email" : " emails"));
                bw.newLine();
            }
            bw.close();

            System.out.println("Summary written to summary.txt ✅");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

