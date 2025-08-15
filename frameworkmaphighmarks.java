import java.util.*;

    public class frameworkmaphighmarks{
        public static void main(String[] args) {
            Map<String, Integer> studentMarks = new HashMap<>();
            studentMarks.put("Sathya", 85);
            studentMarks.put("Priya", 92);
            studentMarks.put("Mani", 78);

            String topStudent = "";
            int maxMarks = -1;

            for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
                if (entry.getValue() > maxMarks) {
                    maxMarks = entry.getValue();
                    topStudent = entry.getKey();
                }
            }

            System.out.println("Top Student: " + topStudent + " → " + maxMarks);
        }
    }

