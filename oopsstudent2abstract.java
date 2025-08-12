abstract class schoolmember{
    abstract void details();
}
class Student extends schoolmember{
    private String name;
    private  int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String getName() {

        return name;
    }
    public int getRollno(){

        return rollno;
    }
    public void setName(String name){

        this.name=name;
    }
    public void setRollno(int rollno){

        this.rollno=rollno;
    }
    public void details(){

        System.out.println("Student Details:"+name+rollno);
        System.out.println("Name:"+getName());
        System.out.println("Roll No:"+getRollno());
    }
}
public class oopsstudent2abstract {
    public static  void main(String[]args){
        Student s=new Student(" Riya ",101);
        s.details();

        s.setRollno(103);
    }
}














