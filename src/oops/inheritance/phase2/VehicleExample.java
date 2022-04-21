package oops.inheritance.phase2;

import java.util.Vector;

class Vehicle {
    int wheels;
    int seats;
    Vehicle(){
        System.out.println("Vehicle is created");
    }
    Vehicle(int seats){
        System.out.println("seats is getting initialized");
        this.seats = seats;
    }

    void start(){
        System.out.println("Starting vehicle");
    }

    void stop(){
        System.out.println("Stopping vehicle");
    }
}

class Cycle extends Vehicle{
    boolean hasGear;
    boolean hasMudguard;

    Cycle(boolean hasGear, boolean hasMudguard){
        //vehicle is creating
//      Vechicle vv =   new Vechicle(2);
        super(2); // calling parent classs constrcutor
        System.out.println("Cycle is Created");
        this.hasGear = hasGear;
        this.hasMudguard = hasMudguard;
    }

    void  start(){
        super.start();
        System.out.println("starting pedel");
    }

}


public  class VehicleExample{
    public static void main(String[] args) {
        Cycle c1 = new Cycle(false, true);
        c1.hasGear = true;
        c1.seats = 2;
        System.out.println(c1.seats);
        System.out.println(c1.hasGear);
        c1.start();
        c1.stop();
    }
}
