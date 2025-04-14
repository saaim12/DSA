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
        head = insertSafely(head, 8, 44); // Invalid index test
        head = insertSafely(head, 2, 44);

        //System.out.println("Original List:");
        //printList(head);

        //head = reverseIteratively(head);
        //System.out.println("Reversed List (Iterative):");
       // printList(head);

       // head = reverseRecursively(head);
        //System.out.println("Reversed Again (Recursive):");
        printList(head);

       // head = sortList(head);
        System.out.println("Sorted List:");

        head= sortList_bubble(head);
        printList(head);
    }
    public static Node sortList_bubble(Node head){
        if (head == null || head.next == null) return head;
        boolean swapped;
        Node current=head;
        do{
            swapped=false;
            while(current!=null && current.next!=null){
                if( current.next !=null && current.val>current.next.val){
                    int temp=current.val;
                    current.val=current.next.val;
                    current.next.val=temp;
                    swapped=true;
                }
                current =current.next;
            }
        }while (swapped);
        return head;
    }


    // Reverse recursively
    public static Node reverseRecursively(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Reverse iteratively
    public static Node reverseIteratively(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // Insert at specific index
    public static Node insert(Node head, int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null) return head; // Invalid index
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    // Safe insert with invalid index check
    public static Node insertSafely(Node head, int index, int val) {
        if (index == 0 || head == null) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid index: " + index);
            return head;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    // Delete at specific index
    public static Node delete(Node head, int index) {
        if (head == null) return null;
        if (index == 0) return head.next;

        Node current = head;
        for (int i = 0; current.next != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // Print linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Sort using merge sort
    public static Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = getMiddle(head);
        Node right = mid.next;
        mid.next = null;

        Node leftSorted = sortList(head);
        Node rightSorted = sortList(right);

        return merge(leftSorted, rightSorted);
    }

    // Find middle for merge sort
    public static Node getMiddle(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    public static Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        current.next = (left != null) ? left : right;
        return dummy.next;
    }
}
