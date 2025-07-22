package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.Abstraction_interfaces;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age=age;
    }
    abstract  void career();
   abstract void name();
}
