package oops.polymorphism;

public class Runtime {
    public static void main(String[] args) {
        System.out.println("Hello");
        Shape s;
        s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}

class Vehicle{
    void start(){
        System.out.println("Starting vehicle");
    }
}

class Cycle extends Vehicle{
    void start(){
        System.out.println("Starting cycle");
    }
}
