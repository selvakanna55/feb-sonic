package LinkedList;

class NodeCLL{
    int value;
    String name;
    NodeCLL next;
    NodeCLL(int value, String name){
        this.value = value;
        this.name = name;
    }
}

public class CircularLinkedList {
    NodeCLL head = null;
    NodeCLL tail = null;
    int length = 0;

    void insertAtPos(int pos, int val, String name) {
        int tempPos = pos;
        NodeCLL newNode = new NodeCLL(val, name);
        if(pos==1){
            newNode.next  = head;
            head = newNode;
        }else{
            NodeCLL curr = head;
            while(pos-2!=0){
                curr = curr.next;
                pos--;
            }
            NodeCLL temp = curr.next;
            newNode.next = temp;
            curr.next = newNode;
        }
        length++;
        if(length==tempPos){
            tail = newNode;
            tail.next = head;
        }
    }

    void deletePos(int pos){
        if(pos==1){
            NodeCLL temp = head;
            head = head.next;
            temp.next = null;
            if(tail.next!=null) tail.next = head;
            else{
                head = null;
                tail = null;
            }
        }else{
            NodeCLL curr = head;
            while(pos-2!=0){
                curr = curr.next;
                pos--;
            }
            NodeCLL temp = curr.next;
            curr.next = curr.next.next;
            temp.next = null;

        }
        length--;
    }

    void printCLL(){
        if(head==null){
            System.out.println("Head is null");
            return;
        }
        NodeCLL curr = head;
        while(true){
            System.out.print(curr.value+"-"+ curr.name+"  ");
            curr = curr.next;
            if(curr==head) break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtPos(1, 10, "AB");
        cll.insertAtPos(2, 20, "BC");
        cll.insertAtPos(3, 30, "CD");
        cll.insertAtPos(4, 40, "DE");
        cll.printCLL();
        cll.deletePos(1);
        cll.printCLL();
        cll.deletePos(2);
        cll.printCLL();
        cll.deletePos(2);
        cll.printCLL();
        cll.deletePos(1);
        cll.printCLL();








    }
}
