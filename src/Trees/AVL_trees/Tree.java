package Trees.AVL_trees;



public class Tree {
    public class Node{
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
    Node root;
    //base case when there is no node
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
        //for avl tree we are going to send it to rotate
        return rotate(node);
    }

    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        // Left heavy
        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                // Left-Left Case
                return rotateRight(node);
            } else {
                // Left-Right Case
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
        }

        // Right heavy
        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                // Right-Right Case
                return rotateLeft(node);
            } else {
                // Right-Left Case
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
        }

        // Balanced
        return node;
    }
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights (if you're maintaining heights)
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }


    private int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }


}
