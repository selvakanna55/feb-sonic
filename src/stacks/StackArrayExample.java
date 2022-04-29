package stacks;

import java.util.Stack;

class StackArray {
    int arr[];
    int top = -1;
    int size;

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int val) {
        if (top + 1 < size) {
            top++;
            arr[top] = val;
        } else {
            System.out.println("Stack overflow");
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("deleting " + arr[top]);
            top--;
        }
    }

}

public class StackArrayExample {
    void testCustomStack(){
        StackArray st = new StackArray(3);
        st.peek();
        st.pop();
        st.push(10);
        st.peek();
        st.push(20);
        st.peek();
        st.push(30);
        st.peek();
        st.push(40);
        st.peek();
        st.pop(); // delete 30
        st.peek(); // peek - 20
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        System.out.println(s.pop()); // 10
        s.push(100);
        System.out.println(s.pop()); // 100
        s.push(1);
        s.push(2);
        System.out.println(s.peek()); //2
        System.out.println(s.isEmpty());// false
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
    }
}
