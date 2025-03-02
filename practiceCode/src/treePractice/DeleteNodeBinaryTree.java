package treePractice;

import java.util.Arrays;

public class DeleteNodeBinaryTree {
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        int key = 11;
        tree.inorder1(root);
        System.out.println(" ");
        root = deletion(root, key);
        tree.inorder1(root);
    }

    private static Node deletion(Node root, int key) {
        if(root == null) {
            return root;
        }
        if(root.data == key){
            return helper(root);
        }
        Node dummy = root;
        while(root != null){
            if(root.data<key){
                if(root.left!=null && root.left.data == key){
                    root.left = helper(root.left);
                    break;
                }else {
                    root = root.left;
                }
            }else{
                if(root.right!= null && root.right.data == key){
                    root.right = helper(root.right);
                    break;
                }else{
                    root = root.right;
                }
            }
        }
        return dummy;
    }

    private static Node helper(Node root) {
        if(root.left == null){
            return root.right;
        }else if(root.right == null){
            return root.left;
        }
            Node rightChild = root.right;
            Node lastLeftMostRight = findLastRightFromLeft(root.left);
            lastLeftMostRight.right = rightChild;
            return root.left;
    }

    private static Node findLastRightFromLeft(Node root) {
        if(root.right == null){
            return root;
        }
       return findLastRightFromLeft(root.right);
    }
}
