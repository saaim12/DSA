package Trees.Problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Binary_tree tree = new Binary_tree();
//
//        System.out.println("Enter value for root node:");
//        int value = s.nextInt();
//        tree.root = tree.new Node(value);
//        tree.insert(s, tree.root);
        Integer[] input = {1, 2, 3, null, 5, 6, 7}; // Example tree
        tree.root = buildTreeFromArray(input);
        System.out.println("In-order traversal:");
        tree.display(tree.root);
        System.out.println("\nHeight of tree: " + tree.root.height);
        System.out.println(bfs(tree.root));
        System.out.println(bfs_zig_zag(tree.root));
        System.out.println(bfs_reversed(tree.root));
        System.out.println(height_check(tree.root));
        System.out.println(diameter_of_binary_tree(tree.root));
        preorder(tree.root);
    }
    //simple bfs for level order traversal
    public static List<List<Integer>> bfs(Binary_tree.Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Binary_tree.Node current = queue.poll();
                level.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(level);
        }

        return result;
    }
    // is cousins or not

    //bfs for zig zag manner
    public static List<List<Integer>> bfs_zig_zag(Binary_tree.Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Binary_tree.Node current = queue.poll();


                // Add values in reverse order when required
                if (reverse) {
                    level.add(0, current.val);
                } else {
                    level.add(current.val);
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }

            }
             reverse=!reverse;
            result.add(level);
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
    //level order traversal 2
    public static List<List<Integer>> bfs_reversed(Binary_tree.Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Binary_tree.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Binary_tree.Node current = queue.poll();
                level.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(0,level);
        }

        return result;
    }
    public static int height_check(Binary_tree.Node root){
        if(root==null) return 0;
        int nodelefth=height(root.left);
        int noderighth=height(root.right);
        return Math.max(nodelefth,noderighth);

    }
    public static int height(Binary_tree.Node root){
        if (root==null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static int diameter_of_binary_tree(Binary_tree.Node root){
        return 1+ height(root.left) + height(root.right);
    }
    public static void preorder(Binary_tree.Node root){
        if (root == null) {
            System.out.print(" NULL ");
            return;
        }
        System.out.print(" "+root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
