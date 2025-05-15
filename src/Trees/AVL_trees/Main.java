package Trees.AVL_trees;
public class Main {
    public static void main(String[] args) {
        Tree avlTree = new Tree();

        // Insert elements that will require rotations to balance
        int[] values = {10, 5, 2, 8, 15, 20, 25, 30};

        for (int value : values) {
            avlTree.insert(value);
            System.out.println("Inserted: " + value);
        }

        // Optional: print the tree in-order to verify it's sorted
        System.out.println("\nIn-order traversal of AVL Tree:");
        printInOrder(avlTree.root);
    }

    public static void printInOrder(Tree.Node node) {
        if (node == null) return;

        printInOrder(node.left);
        System.out.println("Node: " + node.value + " | Height: " + node.height);
        printInOrder(node.right);
    }
}
