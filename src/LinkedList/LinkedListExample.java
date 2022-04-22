package LinkedList;

import java.util.Collections;

class Node{
    int value;
    Node next; // custom datatype
    Node(){}
    Node(int value){
        this.value = value;
    }
}

public class LinkedListExample {
    Node head = null;
    void createNewLL(int val){
        Node newNode = new Node(val);
        head = newNode;
    }

    void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=  temp.next;
        }
        System.out.println();
    }

    void insertValueAtEnd(int val){
        Node temp = head;
        Node newNode = new Node(val);
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.createNewLL(100);
//        ll.head.next = new Node(101);;
        //        ll.head.next.next = new Node(102);
        ll.printLL();
        ll.insertValueAtEnd(101);
        ll.printLL();
        ll.insertValueAtEnd(102);
        ll.printLL();
        ll.insertValueAtEnd(199);
        ll.printLL();
    }
}

