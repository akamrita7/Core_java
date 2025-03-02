package treePractice;

public class InsertionTree {
    public static void main(String[] args) {
        BinaryTree1 tree1 = new BinaryTree1();
        // Constructing the binary tree
        //          10
        //        /    \
        //       11     9
        //      /      / \
        //     7      15   8
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        int key = 12;
        root = tree1.insert1(root, key);

        // After insertion 12 in binary tree
        //          10
        //        /    \
        //       11     9
        //      /  \   / \
        //     7   12 15  8
        tree1.inorder1(root);
    }
}
