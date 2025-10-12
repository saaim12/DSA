package OOP.Intro_constructors_Keywords.finalize_method;

public final class Student {

    // Instance variables (properties)
    private String name;
    private int age;
    private String course;

    // Constructor to initialize the properties
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getter methods to access the properties
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Overriding the finalize() method from Object class
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup code (e.g., closing resources)
            System.out.println("Cleaning up resources for student: " + name);
        } finally {
            // Always call the superclass finalize method to ensure proper garbage collection
            super.finalize();
        }
    }
}
