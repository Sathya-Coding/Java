import java.util.Scanner;

class TemperatureConverter {
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double toFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

    public double toCelsius() {
        return (temperature - 32) * 5 / 9;
    }
}

public class oopstempreatureconversionoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            converter.setTemperature(celsius);
            System.out.printf("Fahrenheit: %.2f°F\n", converter.toFahrenheit());
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            converter.setTemperature(fahrenheit);
            System.out.printf("Celsius: %.2f°C\n", converter.toCelsius());
        } else {
            System.out.println("Invalid choice.");
        }
    }
}


