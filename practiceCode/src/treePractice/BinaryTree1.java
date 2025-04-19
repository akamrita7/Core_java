package treePractice;

public class BinaryTree1 {
    Node root;
    public  void inorder() {
        inorder1(root);
    }
    public void inorder1(Node root) {
        if(root != null) {
            inorder1(root.left);
            System.out.print(root.data + " ");
            inorder1(root.right);

        }
    }
    public  void preOrder() {
        preOrder1(root);
    }
    public void preOrder1(Node root) {
        if(root != null) {
            inorder1(root.left);
            inorder1(root.right);
            System.out.print(root.data);

        }
    }
    public void insert(int data) {
        root = insert1(root,data);
    }
    public Node insert1(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insert1(root.left, data);
        } else if (data > root.data) {
            {
                root.right = insert1(root.right, data);
            }
        }
        return root;
    }


}
