
import java.util.*;

class Cars {
    String model;
    double mileage;

    Cars(String model, double mileage) {
        this.model = model;
        this.mileage = mileage;
    }

    public String toString() {
        return model + " - " + mileage + " km/l";
    }
}

public class frameworkcollectioncarsort {
    public static void main(String[] args) {
        List<Cars> cars = Arrays.asList(
                new Cars("Maruti", 22.5),
                new Cars("Honda", 18.2),
                new Cars("Hyundai", 20.0)
        );

        cars.sort(Comparator.comparingDouble(c -> c.mileage));

        System.out.println("Cars sorted by mileage:");
        for (Cars c : cars) {
            System.out.println(c);
        }
    }
}

