import java.util.HashSet;
import java.util.Set;

    public class frameworksetemployeeid  {
        public static void main(String[] args) {
            Set<Integer> employeeID = new HashSet<>();
            employeeID.add(101);
            employeeID.add(102);
            employeeID.add(103);
            boolean isAdded = employeeID.add(102);
            if (!isAdded) {
                System.out.println("Duplicate ID 102 was not added.");
            }
            System.out.println("All Employee IDs:");
            for (Integer id : employeeID) {
                System.out.println(id);
            }
        }
    }


