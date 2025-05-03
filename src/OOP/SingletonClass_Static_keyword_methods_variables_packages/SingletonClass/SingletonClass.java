package OOP.SingletonClass_Static_keyword_methods_variables_packages.SingletonClass;

// Singleton class to ensure only one object is created
public class SingletonClass {

    // Step 1: Private constructor prevents external instantiation
    private SingletonClass() {
        System.out.println("Constructor called");
    }

    // Step 2: Static variable to hold the single instance
    private static SingletonClass instance;

    // Step 3: Public static method to return the single instance
    public static SingletonClass getInstance() {
        // Create instance only if it doesn't exist
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
