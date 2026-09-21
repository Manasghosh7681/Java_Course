package Oops;
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Singleinherit {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();  // Inherited from Vehicle
        c.stop();   // Inherited from Vehicle
        c.drive();  // Car's own method
    }
}