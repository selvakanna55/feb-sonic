package oops.basics;

import java.util.Scanner;

class Car{
    int wheels;
    int speed;
    int gear;
    void increaseSpeed(){
        System.out.println("Increasing Speed by 20kmph");
    }
    void applyBreak(){
        System.out.println("Applying break, car stopped");
    }
}

public class CarExample {
    static void printHello(){
        System.out.println("Help");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car    xuv      =   new Car();
     // Class obj name  =  new Class
        xuv.speed  = 100;
        xuv.wheels = 4;
        xuv.gear = 5;
        System.out.println(xuv.speed);
        System.out.println(xuv.gear);
        System.out.println(xuv.wheels);
        xuv.increaseSpeed();
        xuv.applyBreak();
    }
}
