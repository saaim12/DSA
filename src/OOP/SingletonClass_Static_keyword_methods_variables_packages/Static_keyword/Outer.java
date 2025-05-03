package OOP.SingletonClass_Static_keyword_methods_variables_packages.Static_keyword;
//this is for inner outer class concept
public class Outer {
    public static class inner{
        int age;
        public inner(int age){
            this.age=age;
        }
        public void display() {
            System.out.println("Age is: " + age);
        }
    }
    public static void main(String[] args) {
        // ✅ Create static inner class object without creating Outer object
        Outer.inner obj = new Outer.inner(25);
        obj.display(); // ➜ Output: Age is: 25
    }
}
