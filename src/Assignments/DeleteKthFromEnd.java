package Assignments;

class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class DeleteKthFromEnd {
    /*

*/

    public static Node deleteElement(Node head,int k) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        // run loop tillk
        for(int i=0;i<=k;i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
