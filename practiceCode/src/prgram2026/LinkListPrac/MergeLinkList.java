package prgram2026.LinkListPrac;

import static prgram2026.LinkListPrac.ReverseLinkList.printList;

public class MergeLinkList {
    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);
        Node res = sortedMerge(head1, head2);
        printList(res);
    }

    private static Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node cur = dummy;
        while (head1 != null && head2 != null){
            if(head1.data < head2.data){
                cur.next = head1;
                head1 = head1.next;
            }else{
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        if (head1 != null){
            cur.next = head1;
        }else {
            cur.next = head2;
        }
        return dummy.next; //2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
    }
}
