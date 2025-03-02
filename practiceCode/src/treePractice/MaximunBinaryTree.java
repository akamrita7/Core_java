package treePractice;

public class MaximunBinaryTree {
    public static void main(String args[])
    {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        // Function call
        System.out.println("Maximum element is "
                + findMax(tree.root));
    }

    private static int findMax(Node root) {
        if(root == null) return  -1;
        int res = root.data;
        int lres = findMax(root.left);
        int rres = findMax(root.right);
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;

    }
}
