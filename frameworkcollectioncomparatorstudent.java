import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stu{
    int rollno;
    String name;

Stu(int r, String n){
    rollno=r;
    name=n;
}
}
class Sortbyname implements Comparator<Stu>{
    public  int compare(Stu a,Stu b){
        return a.name.compareTo(b.name);
    }

}
public class frameworkcollectioncomparatorstudent {
    public static void main(String[]args){
        List<Stu>list=new ArrayList<>();
        list.add(new Stu(2,"Sathya"));
        list.add(new Stu(3,"Magizhini"));
        list.add(new Stu(1,"Mani"));
        Collections.sort(list,new Sortbyname());
        for (Stu s:list){
            System.out.println(s.rollno+"."+s.name);
        }
    }
}
