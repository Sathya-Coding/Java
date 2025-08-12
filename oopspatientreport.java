
import java.util.Scanner;

class Patient {
    private String name;
    private int id;
    private String disease;
    private String admissionDate;
    public Patient(String name, int id, String disease, String admissionDate) {
        this.name = name;
        this.id = id;
        this.disease = disease;
        this.admissionDate = admissionDate;
    }
    public void displayReport() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Admission Date: " + admissionDate);
    }
}
public class oopspatientreport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of patients: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Patient " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Disease: ");
            String disease = scanner.nextLine();
            System.out.print("Admission Date (dd-mm-yyyy): ");
            String date = scanner.nextLine();
            patients[i] = new Patient(name, id, disease, date);
        }
        System.out.println("\n--- Admitted Patients Report ---");
        for (Patient p : patients) {
            p.displayReport();
        }
    }
}
