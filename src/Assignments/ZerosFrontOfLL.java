package Assignments;

import java.util.ArrayList;



public class ZerosFrontOfLL {

    static public Node moveZeroes(Node head)
    {

        int count =0;
        ArrayList<Integer> li = new ArrayList<>();
        Node curr = head;
        while (curr!=null){
            // uncomment bellow while submitting in the assignment
//            if(curr.data==0) count++;
//            else li.add(curr.data);
            curr = curr.next;
        }
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (count>0){
            temp.next = new Node(0);
            temp = temp.next;
            count--;
        }
        for(int num:li){
            temp.next = new Node(num);
            temp = temp.next;
        }
        return dummy.next;

    }
}

