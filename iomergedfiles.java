import java.io.*;

    public class iomergedfiles {
        public static void main(String[] args) {
            try (
                    BufferedReader br1 = new BufferedReader(new FileReader("user.txt"));
                    BufferedReader br2 = new BufferedReader(new FileReader("alphabet.txt"));
                    BufferedWriter writer = new BufferedWriter(new FileWriter("merged.txt"))
            )
             {

                String line;
                while ((line = br1.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                while ((line = br2.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("Files merged successfully into merged.txt");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


