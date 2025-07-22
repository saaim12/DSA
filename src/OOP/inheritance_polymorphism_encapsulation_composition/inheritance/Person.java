package OOP.inheritance_polymorphism_encapsulation_composition.inheritance;


public class Person {
    private String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
