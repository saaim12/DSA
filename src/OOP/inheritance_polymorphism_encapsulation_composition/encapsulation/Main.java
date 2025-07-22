package OOP.inheritance_polymorphism_encapsulation_composition.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating three Student objects
        Student student1 = new Student("Aliyan", 20, 101);
        Student student2 = new Student("Saaim", 22, 102);
        Student student3 = new Student("Qamar", 21, 103);

        // Printing their data using toString
        System.out.println("student 1 "+ student1);
        System.out.println("student 2 "+student2);
        System.out.println("student 3 "+student3);
    }
}
