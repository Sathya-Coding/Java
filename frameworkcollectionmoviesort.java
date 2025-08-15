import java.util.*;

class Movie {
    String title;
    int year;

    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String toString() {
        return title + " (" + year + ")";
    }
}

public class frameworkcollectionmoviesort  {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Jilla", 2016),
                new Movie("Leo", 2024),
                new Movie("Ghilli", 2002)
        );

        movies.sort((m1, m2) -> Integer.compare(m2.year, m1.year));

        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}


