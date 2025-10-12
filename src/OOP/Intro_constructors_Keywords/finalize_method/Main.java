package OOP.Intro_constructors_Keywords.finalize_method;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("saaim",23,"DSA");
        for (int i = 0; i <100000000 ; i++) {
            s1=new Student("Random",11,"Random");
        }
        //the main idea behind this is that we cannot tell java when to collect garbage but we can do one thing and that is we
        // can tell the gc to do something before doing it
    }
}
