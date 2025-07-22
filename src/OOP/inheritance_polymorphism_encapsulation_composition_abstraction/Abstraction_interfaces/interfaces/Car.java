package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.Abstraction_interfaces.interfaces;

public class Car implements Engine, BrakeSystem, SteeringSystem {

        @Override
        public void start() {
            System.out.println("Car engine started.");
        }

        @Override
        public void stop() {
            System.out.println("Car engine stopped.");
        }

        @Override
        public void applyBrakes() {
            System.out.println("Brakes applied.");
        }

        @Override
        public void steerLeft() {
            System.out.println("Steering left.");
        }

        @Override
        public void steerRight() {
            System.out.println("Steering right.");
        }


}
