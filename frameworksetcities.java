import java.util.HashSet;

    public class frameworksetcities  {
        public static void main(String[] args) {
            HashSet<String> visitedCities = new HashSet<>();
            visitedCities.add("Chennai");
            visitedCities.add("Bangalore");
            visitedCities.add("Mumbai");
            visitedCities.add("Delhi");
            visitedCities.add("Mumbai");
            visitedCities.add("Hyderabad");
            System.out.println("Unique cities visited:");
            for (String city : visitedCities) {
                System.out.println(city);
            }
        }
    }


