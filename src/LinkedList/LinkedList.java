package LinkedList;

public class LinkedList {
    // Node class
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert(head, 1, 20);
        head = insert(head, 2, 30);
        head = insert(head, 1, 15);
        head = InsertUsingallpossiblecases(head, 8, 44);
        head = InsertUsingallpossiblecases(head, 2, 44);
        // Print list before sorting
        printList(head);
        // Sort the list
        //head = sorting(head);
        head=reverse_iteratively(head);

        printList(head);
    }
    public static Node reverse_recursively(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node reverser=reverse_recursively(head.next);
        head.next.next=head;
        head.next=null;
        head=head.next;
        return reverser;

    }
    public static Node reverse_iteratively(Node head){
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present!=null){
            next = present.next;
            present.next=prev;
            prev=present;
            present=next;

                    }
        return prev;
    }
    // Insert at a specific index
    public static Node insert(Node head, int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }

    // Delete at a specific index
    public static Node delete(Node head, int index) {
        if (head == null) return null;

        if (index == 0) {
            return head.next;
        }

        Node current = head;
        int count = 0;
        while (current.next != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // Traverse and print
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert using all possible cases (handles head, invalid index, etc.)
    public static Node InsertUsingallpossiblecases(Node head, int index, int val) {
        if (head == null && index == 0) {
            // If the list is empty and index is 0, just insert at the head
            return new Node(val);
        }
        if (index == 0) {
            // Insert at head
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            // Means index is out of bounds
            System.out.println("Node index is invalid");
            return head;
        }

        // Insert new node at the given index
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    // Sorting linked list using merge sort
    public static Node middle(Node head) {
        if (head == null || head.next == null) {
            return head; // If there's only one node or none, return the head.
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Sorting linked list using merge sort
    public static Node sorting(Node head) {
        // Base case: if the list is empty or has one element, it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        Node middle = middle(head);
        Node left = head;
        Node right = middle.next;
        middle.next = null; // Split the list into two halves

        // Recursively sort both halves
        left = sorting(left);
        right = sorting(right);

        // Merge the sorted halves
        return merging(left, right);
    }



    // Merging two sorted linked lists
    public static Node merging(Node left, Node right) {
        Node dummy = new Node(0); // Dummy node to simplify merging
        Node temp = dummy;

        // Compare and merge nodes
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;    // Attach left node
                left = left.next;    // Move left pointer
            } else {
                temp.next = right;   // Attach right node
                right = right.next;  // Move right pointer
            }
            temp = temp.next;        // Move temp pointer to next node
        }

        // Attach remaining nodes if any
        if (left == null) {
            temp.next = right;
        } else {
            temp.next = left;
        }

        return dummy.next; // Return the sorted merged list
    }
}
