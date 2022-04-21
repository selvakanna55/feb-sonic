package oops.packageexplain.diffpackage;

import oops.packageexplain.sameclass.Test1; // Test1 should be public

public class NonSubclass {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.a = 100;
//        t1.b = 200; // private
//        t1.c = 300; // protected
//        t1.d = 400; // default
        t1.print();
    }
}
