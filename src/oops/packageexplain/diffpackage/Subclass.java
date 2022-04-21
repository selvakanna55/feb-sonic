package oops.packageexplain.diffpackage;

import oops.packageexplain.sameclass.Test1;

public class Subclass {
    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.a = 10;
//        t3.b = 99;
//        t3.c = 101;
//        t3.d = 99;

        t3.printValues();
    }
}

class Test3 extends Test1{
    void printValues(){
        System.out.println("a "+a);
//        System.out.println("b "+b);//private
        System.out.println("c "+c);
//        System.out.println("d "+d); // default
    }
}