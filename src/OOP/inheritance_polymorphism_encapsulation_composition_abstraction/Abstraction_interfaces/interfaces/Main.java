package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.Abstraction_interfaces.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.steerLeft();
        car.applyBrakes();
        car.steerRight();
        car.stop();
    }
}
