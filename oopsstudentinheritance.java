import java.util.Scanner;
class member{
    String name;
    int id;
    void memberdeatils(){
        System.out.println("Member Details");
    }
}

class student extends member{
    String course;
    void memberdetails(String name,int id,String Course){
        System.out.println("Student Details");
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Course:"+Course);
    }
}
 class professor extends member{
    String department;
    void memberdetails(String name, int id, String department){
        System.out.println("Professor Details");
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Department"+department);
    }
 }
 public class oopsstudentinheritance {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Student Details:");
        System.out.println("Name:");
        String name=sc.nextLine();
        System.out.println("ID");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Course");
        String course=sc.nextLine();
        student s=new student();
        s.memberdetails(name, id, course);
        System.out.println("Professor Details:");
        System.out.println("Name:");
         name=sc.nextLine();
        System.out.println("ID:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Department::");
        String dept=sc.nextLine();
        professor p=new professor();
        p.memberdetails(name,id,dept);


    }
}
