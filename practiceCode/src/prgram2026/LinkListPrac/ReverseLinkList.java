package prgram2026.LinkListPrac;


public class ReverseLinkList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseList(head);
        printList(head);
    }

     static void printList(Node head) {
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    private static Node reverseList(Node head) {
        Node cur = head, prev = null, next;
        while ( cur != null){
            next = cur.next;
            cur.next = prev ;
            prev = cur ;
            cur = next;
        }
        return  prev;
    }
}
