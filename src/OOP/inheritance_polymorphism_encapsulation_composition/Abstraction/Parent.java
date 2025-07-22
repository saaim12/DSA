package OOP.inheritance_polymorphism_encapsulation_composition.Abstraction;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age=age;
    }
    abstract  void career();
   abstract void name();
}
