package OOP.inheritance_polymorphism_encapsulation_composition_abstraction.inheritance;

public class CollegeStudent extends Student {
    private String collegeName;

    public CollegeStudent(String name, int age, int rollNo, String collegeName) {
        super(name, age, rollNo); // calls Student constructor
        this.collegeName = collegeName;
    }

    public void displayCollegeStudentInfo() {
        super.displayStudentInfo(); // shows name, age, and roll no
        System.out.println("College: " + collegeName);
    }
}