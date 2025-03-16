package Strings;

public class String_and_string_Builder {
    public static void main(String[] args) {
        // ********* CONCEPT 1: STRING COMPARISON *********
        String str1 = "a";
        String str2 = "a";
        System.out.println(str2 == str1); // true

        // Explanation:
        // Both refer to the same object in the string pool.

        //-------------------------------------------

        String name1 = new String("saaim");
        String name2 = new String("saaim");
        System.out.println(name1 == name2); // false

        // Explanation:
        // Different memory locations because of `new` keyword.

        // ********* CONCEPT 2: STRING IMMUTABILITY *********
        // In Java, Strings are **immutable**, meaning their value cannot be changed once created.

        // Accessing a character using `charAt()`
        System.out.println(name1.charAt(0)); // Output: 's'

        // ERROR: Cannot modify a string directly
        // name1[0] = 'S';  ❌ Not allowed

        //-------------------------------------------

        // ********* CONCEPT 3: STRINGBUILDER (MUTABLE STRING) *********
        // `StringBuilder` allows modification without creating new objects.

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original: " + sb);

        // Append operation (modifies original string)
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: "Hello World"

        // Insert at a specific position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: "Hello Java World"

        // Replace a substring
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb); // Output: "Hello Python World"

        // Delete characters
        sb.delete(6, 12);
        System.out.println("After delete: " + sb); // Output: "Hello World"

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: "dlroW olleH"

        // Convert StringBuilder back to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);

        //-------------------------------------------

        // ********* PERFORMANCE COMPARISON: STRING VS. STRINGBUILDER *********
        int n = 10000;

        // Using String (Inefficient)
        String result = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            result += i; // Creates a new object in each iteration (BAD!)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Final String Length: " + result.length());
        System.out.println("Time taken with String: " + (endTime - startTime) + "ms");

        //-------------------------------------------

        // Using StringBuilder (Efficient)
        StringBuilder sb2 = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb2.append(i); // Modifies existing object (FAST!)
        }
        endTime = System.currentTimeMillis();
        System.out.println("Final String Length: " + sb2.length());
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + "ms");
    }
}
