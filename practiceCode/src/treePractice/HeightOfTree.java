package treePractice;
// Create binary tree
//      1
//     / \
//    3   2
//          \
//           4
//          /  \
//         6    5
public class HeightOfTree {
    private static int height(Node root) {
        if(root == null) return -1;
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(5);
        System.out.println(height(root));
    }
}
