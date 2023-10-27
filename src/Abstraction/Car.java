package Abstraction;

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine starting!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopping!");
    }
}
