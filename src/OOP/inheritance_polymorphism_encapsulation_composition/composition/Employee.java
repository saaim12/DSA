package OOP.inheritance_polymorphism_encapsulation_composition.composition;

public class Employee {
    private String name;
    private int id;
    private Address address; // Composition: Employee "has an" Address

    public Employee(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}
