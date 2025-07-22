package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.composition;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Lahore", "Punjab", "54000");
        Employee emp = new Employee("Ali Khan", 101, address);
        emp.displayInfo();
    }
}
