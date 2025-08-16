import java.io.*;

public class iostudentreport {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("alphabet.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("report_cards.txt"))
        ) {
            String currentStudent = "";
            int totalMarks = 0;
            int subjectCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue; // skip empty lines

                String[] parts = line.split(",");
                if (parts.length < 3) {
                    System.out.println("Invalid line (missing fields): " + line);
                    continue;
                }
                String name = parts[0].trim();
                String subject = parts[1].trim();
                String markStr = parts[2].trim();
                int marks;
                try {
                    marks = Integer.parseInt(markStr);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid marks for student '" + name + "' in subject '" + subject + "': " + markStr);
                    continue;
                }
                if (!name.equals(currentStudent) && !currentStudent.equals("")) {
                    double avg = (double) totalMarks / subjectCount;
                    String grade = avg >= 85 ? "A" : avg >= 70 ? "B" : "C";

                    writer.write(currentStudent + " - Avg: " + avg + ", Grade: " + grade);
                    writer.newLine();
                    totalMarks = 0;
                    subjectCount = 0;
                }
                currentStudent = name;
                totalMarks += marks;
                subjectCount++;
            }
            if (!currentStudent.equals("")) {
                double avg = (double) totalMarks / subjectCount;
                String grade = avg >= 85 ? "A" : avg >= 70 ? "B" : "C";
                writer.write(currentStudent + " - Avg: " + avg + ", Grade: " + grade);
                writer.newLine();
            }

            System.out.println("✅ Report cards saved to report_cards.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
