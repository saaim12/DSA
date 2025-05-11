package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Making of tree");
//        Binary_tree tree = new Binary_tree();
//        tree.populate(s);
//        System.out.println("Pre-order traversal:");
//        tree.preOrderDisplay(tree.root);
//        s.close();

        Binary_Search_Tree bst = new Binary_Search_Tree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(8);
        bst.insert(23);
        bst.insert(24);

        bst.display();
        System.out.println(bst.is_balanced(bst.root));
    }
}

