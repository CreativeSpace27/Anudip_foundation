class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}
class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start(); // Polymorphic call
        System.out.println("Vehicle serviced.\n");
    }
}
public class inherit {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myBike = new Motorcycle();

        Garage myGarage = new Garage();

        System.out.println("Servicing the car:");
        myGarage.serviceVehicle(myCar);

        System.out.println("Servicing the motorcycle:");
        myGarage.serviceVehicle(myBike);
    }
}
