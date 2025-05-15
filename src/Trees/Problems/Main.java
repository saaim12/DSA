package Trees.Problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Binary_tree tree = new Binary_tree();

        System.out.println("Enter value for root node:");
        int value = s.nextInt();
        tree.root = tree.new Node(value);

        tree.insert(s, tree.root);

        System.out.println("In-order traversal:");
        tree.display(tree.root);

        System.out.println("\nHeight of tree: " + tree.root.height);
    }

}
