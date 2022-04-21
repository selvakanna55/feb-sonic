package oops.packageexplain.sameclass;

public class SameClassExample {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.a = 10;
//        obj.b = 20;// private cannot be accessed out side class
        obj.setB(20);
        obj.c = 30;
        obj.d = 40;
        System.out.println(obj.getB());
        obj.print();
    }
}


class Test2 extends Test1{
    void printFromSubclass(){
        System.out.println("a "+a);
//        System.out.println("b "+b); // private cannot accessed
        System.out.println("c "+c);
        System.out.println("d "+d);
    }
}