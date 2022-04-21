package oops.finalexample;

class A{
    final void print(){
        System.out.println("Hello from A");
    }
}

class B extends A{
//    void print(){
//        System.out.println("Hello from B");
//    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        final int marks = 100;
    }
}
