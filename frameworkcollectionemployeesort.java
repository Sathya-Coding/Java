
import java.util.*;

class Employees {
    String name;
    double salary;

    Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - ₹" + salary;
    }
}

public class frameworkcollectionemployeesort {
    public static void main(String[] args) {
        Employees[] employees = {
                new Employees("Sathya", 300000),
                new Employees("Manikandan", 45000),
                new Employees("Magizhini", 40000)
        };

        Arrays.sort(employees, Comparator.comparingDouble(e -> e.salary));

        System.out.println("Sorted by Salary:");
        for (Employees e : employees) {
            System.out.println(e);
        }
    }
}
