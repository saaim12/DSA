package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.ploymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 ints: " + calc.add(3, 4));           // 7
        System.out.println("Add 3 ints: " + calc.add(3, 4, 5));        // 12
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.1));    // 5.6
    }
}
