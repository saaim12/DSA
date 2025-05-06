package OOP.inheritance_polymorphism_encapsulation.inheritance;

public class Student extends Person {
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age); // calls Person constructor
        this.rollNo = rollNo;
    }

    public void displayStudentInfo() {
        super.displayPersonInfo(); // shows name and age
        System.out.println("Roll No: " + rollNo);
    }
}