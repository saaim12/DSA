package Trees.Problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Binary_tree tree = new Binary_tree();

        // Example tree input from array
        Integer[] input = {1, 2, 3, null, 5, 6, 7};
        tree.root = buildTreeFromArray(input);

        System.out.println("In-order traversal:");
        tree.display(tree.root);

        System.out.println("\nHeight of tree: " + height(tree.root));
        System.out.println("Level Order Traversal:");
        System.out.println(bfs(tree.root));

        System.out.println("Zig-Zag Level Order Traversal:");
        System.out.println(bfs_zig_zag(tree.root));

        System.out.println("Bottom-Up Level Order Traversal:");
        System.out.println(bfs_reversed(tree.root));

        System.out.println("Calculated Height: " + height_check(tree.root));
        System.out.println("Diameter of Binary Tree: " + diameter_of_binary_tree(tree.root));

        System.out.println("Pre-order Traversal:");
        preorder(tree.root);

        System.out.println("\nIn-order Traversal:");
        inorder(tree.root);

        System.out.println("\nPost-order Traversal:");
        postorder(tree.root);
    }

    public static List<List<Integer>> bfs(Binary_tree.Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Binary_tree.Node current = queue.poll();
                level.add(current.val);

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            result.add(level);
        }
        return result;
    }

    public static List<List<Integer>> bfs_zig_zag(Binary_tree.Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Binary_tree.Node current = queue.poll();
                if (reverse) level.add(0, current.val);
                else level.add(current.val);

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            reverse = !reverse;
            result.add(level);
        }
        return result;
    }

    public static List<List<Integer>> bfs_reversed(Binary_tree.Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Binary_tree.Node current = queue.poll();
                level.add(current.val);

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            result.add(0, level); // Add to the beginning for reverse order
        }
        return result;
    }

    public static Binary_tree.Node buildTreeFromArray(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        Binary_tree tree = new Binary_tree();
        Binary_tree.Node root = tree.new Node(arr[0]);
        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < arr.length && !queue.isEmpty()) {
            Binary_tree.Node current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = tree.new Node(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = tree.new Node(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static int height_check(Binary_tree.Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight);
    }

    public static int height(Binary_tree.Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameter_of_binary_tree(Binary_tree.Node root) {
        if (root == null) return 0;
        return 1 + height(root.left) + height(root.right);
    }

    public static void preorder(Binary_tree.Node root) {
        if (root == null) {
            System.out.print(" NULL ");
            return;
        }
        System.out.print(" " + root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Binary_tree.Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(" " + root.val + " ");
        inorder(root.right);
    }

    public static void postorder(Binary_tree.Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(" " + root.val + " ");
    }
}
