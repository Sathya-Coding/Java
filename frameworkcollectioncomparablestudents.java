import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    int rollno;
    String name;

    Students(int r, String n) {
        rollno = r;
        name = n;
    }

    public int compareTo(Students s) {
        return this.rollno- s.rollno;
    }
}

public class frameworkcollectioncomparablestudents {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(3, "Sathya"));
        list.add(new Students(1, "Mani"));
        list.add(new Students(2, "Magizhini"));

        Collections.sort(list);
        for (Students s : list)
            System.out.println(s.rollno+ " " + s.name);
    }
}


