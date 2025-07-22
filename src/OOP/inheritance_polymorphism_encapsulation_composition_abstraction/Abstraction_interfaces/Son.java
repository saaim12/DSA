package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.Abstraction_interfaces;

public class Son extends Parent {
    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i have a career");
    }

    @Override
    void name() {
        System.out.println("i have a name");
    }
}
