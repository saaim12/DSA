package OOP.Intro_constructors_Keywords.WrapperClasses_and_final_keyword;

// Final class: cannot be extended
final class FinalKeyword {

    // Final variable: cannot be reassigned once initialized
    final int fixedValue = 100;

    // Static final variable: constant shared across all instances (like PI)
    public static final double PI = 3.14159;

    // Final method: cannot be overridden
    public final void showMessage() {
        System.out.println("This is a final method in a final class.");
    }

    // Method demonstrating final local variable
    public void demonstrateFinalVariable() {
        final int localVar = 50;
        // localVar = 60; // ❌ Not allowed: cannot reassign a final variable
        System.out.println("Final local variable: " + localVar);
    }

    // Final reference to an object
    public void demonstrateFinalObjectReference() {
        final int[] arr = {1, 2, 3};
        arr[0] = 99; // ✅ Allowed: contents can be changed
        // arr = new int[]{4, 5}; // ❌ Not allowed: cannot reassign the reference

        System.out.println("Modified array first element: " + arr[0]);
    }

    // main method inside the same class (FinalKeyword)
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();

        obj.showMessage();                         // Call final method
        obj.demonstrateFinalVariable();            // Show final local variable
        obj.demonstrateFinalObjectReference();     // Final object reference

        System.out.println("Accessing static final constant PI: " + FinalKeyword.PI);
    }
}
//also imp points
//  1:  final variables should be initialized while declaring them
//  2:Final Instance Variables with Reference Types:
//
//When a final instance variable is a reference (like an array or an object), the reference cannot be changed, but the object's content (if mutable) can be modified.
//
//However, if the final reference is a primitive, the value cannot be changed once initialized.