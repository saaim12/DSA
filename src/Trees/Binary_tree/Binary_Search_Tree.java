package Trees.Binary_tree;

public class Binary_Search_Tree {

    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node() {}

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }
    }

    public Node root;

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) return new Node(value);

        if (value >= node.value) {
            node.right = insert(value, node.right);
        } else {
            node.left = insert(value, node.left);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    private int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    // Preorder Traversal
    public void preorder(Node node) {
        if (node == null) {
            System.out.println("NULL");
            return;
        }
        System.out.println(node.value + " (h: " + node.height + ")");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.value + " (h: " + node.height + ")");
        inorder(node.right);
    }

    // Postorder Traversal
    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value + " (h: " + node.height + ")");
    }

    // Check if tree is balanced
    public boolean is_balanced(Node root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) <= 1 &&
                is_balanced(root.left) &&
                is_balanced(root.right);
    }

    public void display() {
        System.out.println("Preorder display:");
        preorder(root);

        System.out.println("\nInorder display:");
        inorder(root);

        System.out.println("\nPostorder display:");
        postorder(root);
    }
}
