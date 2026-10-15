package treePractice;

import java.util.Arrays;

public class treeImp {
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.insert(2);
        tree.insert(7);
        tree.insert(5);
        tree.insert(6);
        tree.insert(1);
        tree.insert(11);
        tree.insert(9);
        tree.insert(4);
        System.out.println("inorder");
        tree.inorder();
        System.out.println("\npreOrder");
        tree.preOrder();
        System.out.println("\npostOrder");
        tree.postOrder();
    }

}
