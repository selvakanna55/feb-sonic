package queue;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class QueueArray {
    int rear = 0, front = 0, size;
    int arr[];

    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int val) {
        if (rear == size) System.out.println("Queue is full");
        else {
            arr[rear] = val;
            rear++;
        }
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
            front++;
        }
    }

    void peek() {
        if (front == rear) System.out.println("Queue is empty");
        else System.out.println(arr[front]);
    }
}


class CircularQueueArray {
    int front = 0, rear = 0, size = 0, capacity = 0;
    int arr[];

    CircularQueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }


    void enqueue(int val){
        if (size==capacity) System.out.println("Queue is full");
        else {
            arr[rear] = val;
            rear++;
            if(rear==capacity){
                rear = 0; // TODO: explain
            }
            size++;
        }
    }

    void dequeue(){
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
            front++;
            if(front==capacity){
                front=0; // TODO: explain
            }
            size--;
        }
    }
}

public class QueueArrayExample {
    static void customImpl(){
        CircularQueueArray qa = new CircularQueueArray(3);
        qa.dequeue();
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.enqueue(40);
        qa.dequeue();
        qa.dequeue();
        qa.dequeue();
        qa.dequeue();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // claas LinkedList implements q

        q.add(10);
        System.out.println(q.isEmpty());

        System.out.println(q.peek());
//        q.poll();
        System.out.println(q.remove());
    }
}
