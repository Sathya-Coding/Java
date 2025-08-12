class Employee {
            String name;
            int age;
            double salary;

            void displaydetails() {
                System.out.println("Name:" + name);
                System.out.println("Age" + age);
                System.out.println("Salary" + salary);
            }
        }
        public class oopsdefaultconstructor {
            public static void main(String[] args) {
                Employee emp1 = new Employee();
                emp1.name = "Sathya";
                emp1.age = 22;
                emp1.salary = 75000;
                Employee emp2 = new Employee();
                emp2.name = "Sumithra";
                emp2.age = 21;
                emp2.salary = 65000;
                System.out.println("Employee1:");
                emp1.displaydetails();
                System.out.println("\nEmployee2:");
                emp2.displaydetails();


            }

        }

