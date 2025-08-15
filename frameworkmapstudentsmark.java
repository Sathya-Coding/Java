import java.util.HashMap;
import java.util.Map;
public class frameworkmapstudentsmark {
        public static void main(String[] args) {
            Map<String, Integer> studentMarks = new HashMap<>();
            studentMarks.put("Sathya", 85);
            studentMarks.put("Manikandan", 92);
            studentMarks.put("Magizhini", 78);
            studentMarks.put("Magizhan", 88);
            studentMarks.put("Priya", 91);
            System.out.println("Student Marks:");
            for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue() + " marks");
            }
        }
    }


