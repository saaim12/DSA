package LinkedList;


import java.util.LinkedList;

public class BuiltInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // insert at index 1

        System.out.println("\nBuilt-in LinkedList:");
        System.out.println(list);

        // Remove element at index
        list.remove(2);
        System.out.println("After removing index 2:");
        System.out.println(list);
    }
}
