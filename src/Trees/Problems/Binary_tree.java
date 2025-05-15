package Trees.Problems;

import java.util.Scanner;

public class Binary_tree {
    public class Node {
        int val;
        Node left;
        Node right;
        int height;
        public Node() {}

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.height=0;
        }
    }

    public Node root;

    public void insert(Scanner s, Node root) {
        System.out.println("Do you want to enter the left value of " + root.val + "?");
        boolean bool1 = s.nextBoolean();
        if (bool1) {
            System.out.println("Enter value for left of " + root.val);
            int value = s.nextInt();
            root.left = new Node(value);

            insert(s, root.left); // recursively insert for the left subtree
        }

        System.out.println("Do you want to enter the right value of " + root.val + "?");
        boolean bool2 = s.nextBoolean();
        if (bool2) {
            System.out.println("Enter value for right of " + root.val);
            int value = s.nextInt();
            root.right = new Node(value);

            insert(s, root.right); // recursively insert for the right subtree
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
    }

    // In-order traversal to display the tree
    public void display(Node node) {
        if (node == null) {
            return;
        }

        display(node.left);
        System.out.print(node.val + " ");
        display(node.right);
    }

    public int height(Node node){
        return node==null? -1:node.height;
    }
}
