package LinkedList;


import java.util.ArrayList;

class NodeDLL{
    int value;
    NodeDLL next;
    NodeDLL prev;
    NodeDLL(int value){
        this.value = value;
    }
}
public class DoubleDLL {
    NodeDLL head = null;
    NodeDLL tail = null;
    int length = 0;

    void insertAtPos(int pos, int value){
        if(pos<1 || pos>length+1) return;

        int tempPos = pos;
        NodeDLL newNode = new NodeDLL(value);
        if(pos==1){
            newNode.next = head;
            if(head!=null) head.prev = newNode;
            head = newNode;
        }else {
            NodeDLL curr = head;
            while (pos - 2 != 0) {
                curr = curr.next;
                pos--;
            }
            NodeDLL temp = curr.next;
            newNode.next = temp;
            curr.next = newNode;
            if (temp != null) temp.prev = newNode;
            newNode.prev = curr;
        }
        length++;
        if(length==tempPos) tail = newNode;
    }
    void printSLL(){
        NodeDLL curr = head;
        while(curr!=null){
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printRev(){
        NodeDLL  curr = tail;
        while (curr!=null){
            System.out.print(curr.value+" ");
            curr = curr.prev;
        }
        System.out.println();
    }

//    void deleteAtPos(int pos
    void insertAtEnd(int val){
        NodeDLL newNode = new NodeDLL(val);
        NodeDLL curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        tail = newNode;
    }

    void deleteAtPos(int pos){
        if(pos<1 || pos>length){
            System.out.println("Invalid index to delete");
            return;
        }
        if(pos==length) tail = tail.prev;
        if(pos==1){
            NodeDLL temp = head;
            head = head.next;
            head.prev = null; // extra
            temp.next = null;
        }else{
            NodeDLL curr = head;
            while (pos-2!=0){
                curr = curr.next;
                pos--;
            }
            NodeDLL temp = curr.next;
            curr.next = curr.next.next;
            if(temp.next!=null) temp.next.prev = curr; //extra
            temp.next = null;
            temp.prev = null;//extra
        }
        length--;
    }

    public static void main(String[] args) {
        DoubleDLL dll= new DoubleDLL();
        dll.insertAtPos(1, 10);
        dll.insertAtPos(2, 20);
        dll.insertAtPos(3, 30);
        dll.insertAtPos(3, 999);
        dll.insertAtPos(3, 88);
        dll.insertAtPos(3, 8745);
        dll.printSLL();
        dll.printRev();
        dll.deleteAtPos(1);
        dll.printSLL();
        dll.deleteAtPos(5);
        dll.printSLL();
        dll.printRev();
        ArrayList<String> li = new ArrayList<>();
        li.add("abc");
        li.add("fr");
        System.out.println(li);


    }
}
