package Stack_and_queue;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Print stack
        System.out.println("Stack: " + stack);

        // Peek at top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // Final stack
        System.out.println("Stack after pop: " + stack);
    }
}
