import java.util.*;

class Vehicle {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate = " + licensePlate + "}";
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{licensePlate =" + licensePlate + ",numberOfSeats=" + numberOfSeats + "}";
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle("ABC123");
        Car c = new Car("ABC123", 4);
        System.out.println(veh.toString());
        System.out.println((c.toString()));
    }
}