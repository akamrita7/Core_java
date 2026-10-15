package prgram2026.LinkListPrac;

public class DeleteNNodeFromLast {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(8);
        head = deleteNthNodeFromEnd(head, 2);
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node deleteNthNodeFromEnd(Node head, int n) {
        Node fast = head , slow = head;
        for (int j = 0; j < n; j++) {
            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
