package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.Abstraction_interfaces;

public class Main {
    public static void main(String[] args) {
        Parent p=new Son(32);//down casting because we cannot have a abstract class object
        p.career();
        p.name();
    }
}
