import java.util.*;

    class City {
        String name;
        int population;

        City(String name, int population) {
            this.name = name;
            this.population = population;
        }

        public String toString() {
            return name + " - Population: " + population;
        }
    }

    public class frameworkcollectioncitysort {
        public static void main(String[] args) {
            List<City> cities = Arrays.asList(
                    new City("Thanjavur", 222943),
                    new City("Chennai", 7090000),
                    new City("Madurai", 1561129),
                    new City("Coimbatore", 1610000)
            );

            cities.sort(Comparator.comparingInt(c -> c.population));

            System.out.println("Cities sorted by population:");
            for (City city : cities) {
                System.out.println(city);
            }
        }
    }


