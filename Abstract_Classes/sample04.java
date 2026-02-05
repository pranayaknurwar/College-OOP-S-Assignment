package Abstract_Classes;

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with self");
    }
}

public class sample04 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
