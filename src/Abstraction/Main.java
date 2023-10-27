package Abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        car.startEngine();
        car.stopEngine();

        truck.startEngine();
        truck.stopEngine();
    }
}
