
class Vehicle {
    void start() {
        System.out.println("The vehicle is starting");
    }

    void stop() {
        System.out.println("The vehicle is stopping");
    }
}
class Car extends Vehicle {
    void fueltype() {
        System.out.println("Car uses petrol or diesel");
    }
}
        class Bike extends Vehicle{
            void fueltype(){
                System.out.println("bike uses petrol");
            }
        }

public class inheritance {
    public static void main(String[]args){

       Car car=new Car();
       car.start();
       car.fueltype();
       car.stop();
       System.out.println();

       Bike bike=new Bike();
       bike.start();
       bike.fueltype();
       bike.stop();
       System.out.println();
    }
}