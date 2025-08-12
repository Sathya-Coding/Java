class employee {
    private String name;
    private double baseSalary;
    public employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }
    public void displaySalary() {
        System.out.println(getName() + "'s Salary: ₹" + calculateSalary());
    }
}

class Manager extends employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 10000;
    }
}

class Developer extends employee {
    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary() + 5000;
    }
}
public class oopsemployeesalaryoops {
    public static void main(String[] args) {
        employee emp1 = new Manager("Sathya", 30000);
        employee emp2 = new Developer("Manikandan", 30000);
        emp1.displaySalary();
        emp2.displaySalary();
    }
}

