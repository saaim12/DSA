package OOP.inheritance_polymorphism_encapsulation_composition.polymorphism;

// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Dynamic_polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // upcasting
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
