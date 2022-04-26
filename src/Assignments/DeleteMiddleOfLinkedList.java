package Assignments;

public class DeleteMiddleOfLinkedList {
    /*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

    public static Node deleteMiddleElement(Node head) {
        if(head.next==null){
            return new Node(-1);
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        slow.next = null;
        return head;
    }
}
