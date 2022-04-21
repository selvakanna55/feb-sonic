package oops.polymorphism;

public class OverloadingExample {
    static int sum(int a, int b){
        System.out.println("Sum with 2 parameters");
        return  a+b;
    }
    static double sum(double a, int b){
        System.out.println("Sum with 2 parameters - double");
        return  a+b;
    }
    static int sum(int a, int b, int c){
        System.out.println("Sum with 3 parameters");
        return a+b+c;
    }

    static int sum(int a, int b, int c, int d){
        System.out.println("Sum with 4 parameters");
        return a+b+c+d;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int sumOfTwoNumber = sum(a, b);
        System.out.println(sumOfTwoNumber);
        System.out.println(sum(10.0, 21));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

}
