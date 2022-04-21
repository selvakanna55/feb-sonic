package oops.revision;
import oops.revision.packageExampleee.TestPackage;

import java.util.Scanner;


class Shape{
    int ab = 99;
    void draw(){
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape{
    Circle(){
        super();
        System.out.println("Hi");
    }
    void draw(){
        System.out.println(super.ab);
        System.out.println("Drawing Circle");
        super.draw();

    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}

public class RuntimeExample {
    public static void main(String[] args) {
        TestPackage t1 = new TestPackage();
        t1.callMe();
        Shape s1;
        s1 = new Circle();
        s1.draw();
        s1 = new Square();
        s1.draw();
    }
}
