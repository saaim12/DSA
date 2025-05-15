package Trees.Binary_tree;

import java.util.Scanner;

public class Binary_tree {
    int value;
    Binary_tree left;
    Binary_tree right;

    public Binary_tree() {}

    public Binary_tree(int value) {
        this.value = value;
    }

    public Binary_tree root;  // instance-level

    public void populate(Scanner s) {
        System.out.println("Enter root node value:");
        int value = Integer.parseInt(s.nextLine());
        this.root = new Binary_tree(value);
        populate(s, this.root);
    }

    public void populate(Scanner s, Binary_tree root) {
        boolean bool1 = getYesOrNo(s, "Do you want to enter the left value of " + root.value + "?");
        if (bool1) {
            System.out.println("Enter value for left of " + root.value);
            int value = Integer.parseInt(s.nextLine());
            root.left = new Binary_tree(value);
            populate(s, root.left);
        }

        boolean bool2 = getYesOrNo(s, "Do you want to enter the right value of " + root.value + "?");
        if (bool2) {
            System.out.println("Enter value for right of " + root.value);
            int value = Integer.parseInt(s.nextLine());
            root.right = new Binary_tree(value);
            populate(s, root.right);
        }
    }

    public void preOrderDisplay(Binary_tree root) {
        if (root == null){ System.out.println("null"); return;}
        System.out.print(root.value + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);
    }

    public static boolean getYesOrNo(Scanner s, String message) {
        System.out.println(message + " (Press Enter for Yes / type 'no' to skip)");
        String input = s.nextLine().trim().toLowerCase();
        return !(input.equals("no") || input.equals("n") || input.equals("false"));
    }
}
