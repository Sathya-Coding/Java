import java.io.File;
import java.util.Scanner;

public class iofilecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name or path: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("✅ File exists.");
            System.out.println("🔍 Readable: " + file.canRead());
            System.out.println("📝 Writable: " + file.canWrite());
        } else {
            System.out.println("❌ File does not exist.");
        }
    }
}


