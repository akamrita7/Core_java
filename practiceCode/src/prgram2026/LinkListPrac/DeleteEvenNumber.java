package prgram2026.LinkListPrac;

public class DeleteEvenNumber {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head = deleteEvenNumber( head);
        LinklistMy.printList(head);

    }

    private static Node deleteEvenNumber(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node cur = dummy;
        while (cur.next != null){
            if(cur.next.data % 2 == 0){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;

    }


}
