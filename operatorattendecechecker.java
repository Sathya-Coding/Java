public class operatorattendecechecker {
        public static void main(String[] args) {
            int presentDays = 80;
            int workingDays = 100;
            double Percentage = (presentDays * 100.0) / workingDays;
            System.out.println("Attendance: " + Percentage + "%");
            if (Percentage >= 75) {
                System.out.println("Allowed to write exam");
            } else {
                System.out.println("Not allowed to write exam");
            }
        }
    }


