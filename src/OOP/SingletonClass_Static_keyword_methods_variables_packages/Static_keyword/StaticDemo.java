package OOP.SingletonClass_Static_keyword_methods_variables_packages.Static_keyword;

public class StaticDemo {

    // 🔹 Static variable — shared across all objects
    static int staticCounter;

    // 🔹 Non-static variable — unique to each object
    int instanceCounter;

    // 🔹 Static block — runs once when class is loaded
    static {
        System.out.println("Static block executed.");
        staticCounter = 100;
    }

    // 🔹 Constructor
    StaticDemo() {
        instanceCounter++;
        staticCounter++;
        System.out.println("Constructor called.");
    }

    // 🔹 Static method — can access only static members directly
    static void showStaticInfo() {
        System.out.println("Static Counter: " + staticCounter);

        // System.out.println("Instance Counter: " + instanceCounter); ❌ Not allowed
        // System.out.println(this); ❌ 'this' can't be used in static context
    }

    // 🔹 Non-static method — can access both static and instance members
    void showInstanceInfo() {
        System.out.println("Instance Counter: " + instanceCounter);
        System.out.println("Static Counter (from instance method): " + staticCounter);
    }

    // 🔹 Main method (static) — entry point
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Access static method and variable using class name
        StaticDemo.showStaticInfo();
        System.out.println("Static Counter directly: " + StaticDemo.staticCounter);

        // Create first object
        StaticDemo obj1 = new StaticDemo();
        obj1.showInstanceInfo();

        // Create second object
        StaticDemo obj2 = new StaticDemo();
        obj2.showInstanceInfo();

        // Show static info again after changes
        StaticDemo.showStaticInfo();
    }
}

