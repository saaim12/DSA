package OOP.Intro_constructors_Keywords;

// Class definition
class Student {
    // Instance variables (fields)
    String name;
    int age;
    String course;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Undeclared";
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;        // 'this' distinguishes instance variable from parameter
        this.age = age;
        this.course = "General";
        System.out.println("Parameterized constructor with 2 arguments called");
    }

    // Overloaded constructor (Constructor Overloading)
    public Student(String name, int age, String course) {
        this(name, age);         // Calls the constructor above (constructor chaining)
        this.course = course;
        System.out.println("Parameterized constructor with 3 arguments called");
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + this.name);     // 'this' is optional here
        System.out.println("Age: " + this.age);
        System.out.println("Course: " + this.course);
        System.out.println("-------------------------");
    }
}
abstract class Shape {
    private final String name;
    Shape(String name){ this.name = name; }      // constructors are allowed
    public String name(){ return name; }         // concrete method

    public abstract double area();               // must be implemented
}
class Circle extends Shape {
    static final double r;
    static {
        r=2;
    }
    public  void print(){
        System.out.println(this.r);
    }
    Circle(double r){ super("circle"); //this.r = r;
         }
    @Override public double area(){ return Math.PI * r * r; }
}

public class Main {
    public static void main(String[] args) {

        // Dynamic memory allocation using 'new' keyword
        Student student1 = new Student();  // Calls default constructor
        Student student2 = new Student("Alice", 20);  // Constructor with 2 arguments
        Student student3 = new Student("Bob", 22, "Computer Science");  // Constructor with 3 arguments

        // Displaying student information
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        // abstract
        System.out.println(Circle.r);
    }

}
