package oops.interfaces;

public class InterfacesExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
        System.out.println(c1.x);
    }
}

interface Vehicle{
    String engine = "BS6";
    void start();
    void stop();
}

abstract class Vehicle1{
    int x;
    abstract  void start();
    abstract void stop();
}

//class Car extends Vehicle1{
    class Car implements Vehicle{
    int x = 10;
    public void start(){
        System.out.println("Starting Car");
    }

    public void stop(){
        System.out.println("Stopping the car");
    }
}

class Cycle implements Vehicle{
    public void start(){
        System.out.println("hello");
    }
    public void stop(){
        System.out.println("Hello");
    }
}