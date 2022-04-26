package Assignments;

public class ReverseLinkedList {

    //https://media.geeksforgeeks.org/wp-content/cdn-uploads/RGIF2.gif
    public static Node ReverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
