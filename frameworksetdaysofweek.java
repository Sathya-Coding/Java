import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class frameworksetdaysofweek {
    public static void main(String[]args){
        Set<String>weekdays=new LinkedHashSet<>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        System.out.println("Days of week");
        for(String day:weekdays){
            System.out.println(day);
        }
    }
}
