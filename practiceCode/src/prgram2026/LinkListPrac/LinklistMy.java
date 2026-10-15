package prgram2026.LinkListPrac;

public class LinklistMy {
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node add(Node head , int data) {
        if(head == null){
            head = new Node(data);
        }else {
            Node cur = head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data);
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = add(head,1);
        head =add(head,2);
        head=add(head,3);
        head=add(head,4);
        printList(head);
    }

}
