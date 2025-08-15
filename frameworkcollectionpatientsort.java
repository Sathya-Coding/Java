
import java.text.SimpleDateFormat;
import java.util.*;

class patient {
    String name;
    Date admissionDate;

    patient(String name, String dateStr) throws Exception {
        this.name = name;
        this.admissionDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
    }

    public String toString() {
        return name + " - Admitted on " + new SimpleDateFormat("dd/MM/yyyy").format(admissionDate);
    }
}

public class frameworkcollectionpatientsort {
    public static void main(String[] args) throws Exception {
        List<patient> patients = Arrays.asList(
                new patient("Ravi", "20/07/2025"),
                new patient("Kumar", "15/07/2025"),
                new patient("Anu", "18/07/2025")
        );

        patients.sort(Comparator.comparing(p -> p.admissionDate));

        System.out.println("Patients sorted by admission date:");
        for (patient p : patients) {
            System.out.println(p);
        }
    }
}
