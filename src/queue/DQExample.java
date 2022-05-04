package queue;

import java.util.ArrayDeque;

public class DQExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> d  = new ArrayDeque<>();
        d.push(10); // insertAtEnd
        d.push(20);
        d.pop(); // deleteFromEnd
        d.peek(); //getLastElement
//        d.addFirst(100); // offerFirst
//        System.out.println(d.toString());
//        d.addFirst(300);
//        System.out.println(d.toString());
//        System.out.println(d.getFirst()); //d.pollFirst()
//        d.addLast(99); //d.offerLast()
//        d.addLast(101);
//        System.out.println(d.toString());
//        System.out.println(d.getLast());
        d.removeLast();// d.pollLast
        d.pollLast();
    }
}
