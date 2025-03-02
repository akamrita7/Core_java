package treePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class LevelOrderRec1 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(5);
        ArrayList<ArrayList<Integer>> res = levelOrder1(root);

        for (ArrayList<Integer> level : res){
            for (int data : level){
                System.out.print( data + " ");
            }
        }
        System.out.println();
        for (ArrayList<Integer> level : res){
            int max = 0;
            for (int data : level){
                max = Math.max(max,data);
            }
            System.out.println( max + " at level " + level );
        }

    }

    private static ArrayList<ArrayList<Integer>> levelOrder1(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
          levelOrderRec1(root,0,res);
         return res;
    }

    private static void levelOrderRec1(Node root, int level, ArrayList<ArrayList<Integer>> res) {
        if(root == null) return ;
        if(res.size()<=level)
            res.add(new ArrayList<>());
        res.get(level).add(root.data);
        levelOrderRec1(root.left,level+1,res);
        levelOrderRec1(root.right,level+1,res);
    }
}
