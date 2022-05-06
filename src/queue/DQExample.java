package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

class DQ {
    int arr[];
    int f = -1, r = -1, size = 0;

    DQ(int size) {
        this.size = size;
        arr = new int[size];
    }

    void insertAtEnd(int val) {
        if (f == 0 && r == size - 1 || (r + 1 == f)) {
            System.out.println("DQ is full");
            return;
        } else if (f == -1 && r == -1) {
            f = 0;
            r = 0;
        } else { // TODO: delete reset
            r++;
        }
        arr[r] = val;

    }


    void insertAtBeg(int val) {
        if (f == 0 && r == size - 1 || (r + 1 == f)) {
            System.out.println("DQ is full");
            return;
        } else if (f == -1 && r == -1) {
            f = 0;
            r = 0;
        } else if (f == 0) {
            f = size - 1;
        } else {
            f--;
        }
        arr[f] = val;
    }

    void printFirst(){
        if (f == 0 && r == size - 1 || (r + 1 == f)) {
            System.out.println("DQ is full");
            return;
        }
        System.out.println(arr[f]);
    }
    void printLast(){
        if (f == 0 && r == size - 1 || (r + 1 == f)) {
            System.out.println("DQ is full");
            return;
        }
        System.out.println(arr[r]);
    }
}

public class DQExample {
    public static void main(String[] args) {
       DQ d = new DQ(5);
       d.insertAtEnd(10);
       System.out.println(Arrays.toString(d.arr)); // coverts array to string
       d.insertAtBeg(20);
        System.out.println(Arrays.toString(d.arr)); // coverts array to string
        d.insertAtBeg(40);
        System.out.println(Arrays.toString(d.arr)); // coverts array to string
        d.insertAtBeg(899);
        d.printFirst();
        d.printLast();
    }
}
