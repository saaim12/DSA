package Stack_and_queue;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Red");
        queue.add("Green");
        queue.add("Blue");

        // Print queue
        System.out.println("Queue: " + queue);

        // Peek at front
        System.out.println("Front element: " + queue.peek());

        // Remove element
        System.out.println("Removed: " + queue.poll());

        // Final queue
        System.out.println("Queue after poll: " + queue);
        System.out.println("Queue other removing methods " + queue.remove());
    }
}
