package Inheritance.Single_Inheritance;

class Vehicle {

    String brand = "Honda";

    void start() {
        System.out.println("Vehicle is starting");
    }
}
// Child class
class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is being ridden");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        Bike b = new Bike();

        b.start();   // inherited method
        b.ride();    // own method

        System.out.println("Brand: " + b.brand);
    }
}
