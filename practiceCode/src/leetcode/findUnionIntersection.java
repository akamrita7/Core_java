package leetcode;

import java.util.HashSet;
import java.util.Set;

public class findUnionIntersection {
    public static void main(String[] args) {


        // Insert elements into the first linked list
        // 10 -> 15 -> 4 -> 20
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(20);

        // Insert elements into the second linked list
        // 8 -> 4 -> 2 -> 10
        Node head2 = new Node(8);
        head2.next = new Node(4);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(10);

         findUnionNIntersection(head1, head2);
    }

    private static void findUnionNIntersection(Node head1, Node head2) {
        Node intersec = null;
        Node union = head1;
        Set<Integer> inter = new HashSet<>();
        while(head1.next != null){
            int num = head1.data;
            inter.add(num);
            head1 = head1.next;
        }
        inter.add(head1.data);
        while (head2 != null){
            int num = head2.data;
            if(inter.contains(num)){
                if(intersec == null){
                    intersec = new Node(num);
                }else{
                    intersec.next = new Node(num);
                }
            }else {
                head1.next = new Node(num);
                head1 = head1.next;
            }
            head2 = head2.next;
        }
        System.out.println("Intersection");
        printList(intersec);
        System.out.println("Union");
        printList(union);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
