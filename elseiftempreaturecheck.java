public class elseiftempreaturecheck {
        public static void main(String[] args) {
            int temp = 38;

            if (temp < 30) {
                System.out.println("Weather is Cool.");
            } else if (temp >= 30 && temp <= 37) {
                System.out.println("Weather is Normal.");
            } else if (temp > 37 && temp <= 40) {
                System.out.println("Feeling Hot.");
            } else {
                System.out.println("Too Hot! Stay hydrated.");
            }
        }
    }


