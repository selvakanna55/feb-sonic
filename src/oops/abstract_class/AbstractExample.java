package oops.abstract_class;

abstract class Vehicle{
    int wheels;
    int seats;
    abstract void start();
    void stop(){ // non abstract fn
        System.out.println("Stopping vehicle");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("starting car...");
    }
}
//Abstract class object cannot be created
// if any function is abstract, then it needs to overrided
// abstract class may or may not have non abstract functions
public class AbstractExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start(); // start
    }
}
