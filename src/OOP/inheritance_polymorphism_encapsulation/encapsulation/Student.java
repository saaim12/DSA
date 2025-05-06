// Package declaration - defines the folder structure of your project
package OOP.inheritance_polymorphism_encapsulation.encapsulation;

/**
 * This class demonstrates the concept of Encapsulation in Java.
 * All the data members (variables) are private and accessed through public getter and setter methods.
 */
public class Student {

    // Private fields (encapsulated data) - can't be accessed directly outside this class
    private String name;
    private int age;
    private int roll_no;

    /**
     * Constructor to initialize the Student object with name, age, and roll number.
     * It uses setter methods for initialization which is a good practice for encapsulation.
     */
    public Student(String name, int age, int roll_no) {
        this.setName(name);
        this.setAge(age);
        this.setRoll_no(roll_no);
    }

    // Getter for name - provides read access to the private variable 'name'
    public String getName() {
        return name;
    }

    // Setter for name - provides write access to modify the private variable 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for roll number
    public int getRoll_no() {
        return roll_no;
    }

    // Setter for roll number
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    @Override
    public String toString() {
        return "Data : {" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Roll No=" + roll_no +
                '}';
    }
}
