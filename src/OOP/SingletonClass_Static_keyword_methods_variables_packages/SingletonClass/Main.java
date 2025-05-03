package OOP.SingletonClass_Static_keyword_methods_variables_packages.SingletonClass;

public class Main {
    public static void main(String[] args) {
        // Correct way: access instance through getInstance()
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        // Both references should point to the same instance
        System.out.println(obj1);  // Same address
        System.out.println(obj2);  // Same address
    }
}
