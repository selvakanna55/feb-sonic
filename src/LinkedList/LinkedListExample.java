package LinkedList;

class Node{
    int value;
    Node  next;
    Node(int value){
        this.value = value;
    }
}

public class LinkedListExample{
    Node head = null;
    int length = 0;


    void insertAtPos(int pos, int val){
        if(pos<1) return;
        Node newNode = new Node(val);
        if(pos==1){
            newNode.next = head;
            head = newNode;
        }else{
            Node curr = head;
            while (pos-2!=0){
                curr = curr.next;
                pos--;
            }
            Node nextNode = curr.next;
            newNode.next = nextNode;
            curr.next = newNode;
        }
        length++;
    }

    void deleteAtPos(int pos){
        if(pos<1) return;
        if(pos==1) head = head.next;
        else{
            Node curr = head;
            while (pos-2!=0){
                curr = curr.next;
                pos--;
            }
            Node temp = curr.next;
            curr.next = curr.next.next;
            temp.next = null;
        }
        length--;
    }


    void printLL(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.insertAtPos(1, 10);
        ll.insertAtPos(2, 20);
        ll.printLL();
        ll.insertAtPos(3, 30);
        ll.printLL();
        ll.insertAtPos(4, 40);
        ll.insertAtPos(1, 999);
        ll.printLL();
        ll.deleteAtPos(2);
        ll.printLL();
        ll.deleteAtPos(1);
        ll.printLL();
        ll.deleteAtPos(ll.length);
        ll.printLL();
    }
}