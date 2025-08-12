import java.util.Scanner;

abstract class Sclstudent {
    abstract void markdetails();
}
class Person extends Sclstudent {
    private String name;
    private  int rollno;
    private  int marks1,marks2,marks3;
    public Person(String name,int rollno,int m1,int m2,int m3) {
    this.name = name;
    this.rollno = rollno;
    this.marks1 = m1;
    this.marks2 = m2;
    this.marks3 = m3;
}
public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setMarks(int m1,int m2,int m3) {
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
    }
    public int getTotal(){
        return marks1+marks3+marks3;
    }
    public double getAverage(){
        return getTotal()/3.0;
    }
    public String getGrade(){
        double avg=getAverage();
        if(avg<=270)
            return "A";
        else if(avg<=240)
            return "B";
        else if (avg<=200)
            return "C";
        else if(avg<=170)
            return "D";
        else if(avg<=140)
            return "E";
        else
            return "Fail";
    }
    public void markdetails(){
    System.out.println("Student Result");
    System.out.println("Name:"+name);
    System.out.println("Roll No:"+rollno);
    System.out.println("Total marks:"+getTotal());
    System.out.println("Average:"+getAverage());
    System.out.println("Grade:"+getGrade());
    }
}
public class oopsabstractstugrade {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Sclstudent scl=new Person("Sathya",567,79,90,80);
        scl.markdetails();
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        ((Person)scl).setName(name);
        System.out.println("Rollno:");
        int rollno = scanner.nextInt();
        ((Person)scl).setRollno(rollno);
        System.out.println("Enter marks in subject 1:");
        int m1 = scanner.nextInt();
        System.out.println("Enter marks in subject 2:");
        int m2 = scanner.nextInt();
        System.out.println("Enter marks in subject 3:");
        int m3 = scanner.nextInt();
        ((Person) scl).setMarks(m1,m2,m3);
        scl.markdetails();
    }
            }


