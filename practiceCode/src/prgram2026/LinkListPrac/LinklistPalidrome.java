package prgram2026.LinkListPrac;

import java.util.Stack;

public class LinklistPalidrome {
    public static void main(String[] args) {
        // Linked list : 1->2->3->2->1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        boolean result = isPalindrome(head);
        if (result)
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean isPalindrome(Node head) {
        Node cur = head;
        Stack<Integer> s = new Stack<>();
        while (cur != null){
            s.push(cur.data);
            cur = cur.next;
        }
        int t ;
        while (head != null){
            t = s.pop();
            if(head.data != t){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
