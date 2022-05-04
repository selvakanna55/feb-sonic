package queue;

import java.util.LinkedList;
import java.util.Queue;

class QueueDS{
    int front, rear, capacity, size = 0;
    int arr[];
    QueueDS(int size){
        this.capacity = size;
        this.front = 0;
        this.rear = 0;
        arr = new int[size];
    }

    boolean isFull(){
        return (size == capacity);
    }

    boolean isEmpty(){
        return (size==0);
    }

    void enqueue(int val){
        if(isFull()) System.out.println("full");
        else{
            arr[rear] = val;
            rear++;
            if(rear==capacity) rear = 0;
            size++;
        }
    }

    void dequeue(){
        if(isEmpty()) System.out.println("empty");
        else{
            System.out.println(arr[front]);
            front++;
            if(front==capacity) front=0;
            size--;
        }
    }
}

public class QueueExample {
    public static void main(String[] args) {
        QueueDS q = new QueueDS(1);
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(999);
        q.dequeue();
        Queue<Integer> qq = new LinkedList<>();





    }
}
