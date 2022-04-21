package oops.revision;

class Tester{
    int number1 = 10;
    static int number2 = 20;
    void nonStaticFn(){
        System.out.println("Hi Non static");
    }
    static void staticFn(){
        System.out.println("Hi Static");
    }
}

public class StaticExmple {
    public static void main(String[] args){
//        Tester.nonStaticFn(); not allowed
        Tester.staticFn();
//        System.out.println(Tester.number1);
        System.out.println(Tester.number2);
    }
}
