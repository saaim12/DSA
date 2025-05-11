package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Making of tree");
        Binary_tree tree = new Binary_tree();
        tree.populate(s);
        System.out.println("Pre-order traversal:");
        tree.preOrderDisplay(tree.root);
        s.close();
    }
}

