package oops.basics;

class TwoWheeler{
    int gears;
    int speed;
    String brandName;
    String modelName;

    TwoWheeler(int gears, String brandName){
        this.gears = gears;
        this.brandName = brandName;
    }

    TwoWheeler(String bikeBrandName){
        brandName = bikeBrandName;
    }

    void increaseSpeed(int s){
        System.out.println("Increasing speed by "+s);
    }

    void start(){
        System.out.println("Starting bike....");
    }
}


class Maths{
    static  int mark = 10;
    static int sum(int a, int b){
        return  a+b;
    }
}
public class TwoWheelerExample {
    static int sum(int a, int b){
        return  a+b;
    }
    int minus(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        TwoWheelerExample obj = new TwoWheelerExample();
        System.out.println(obj.minus(10, 20));
    }
}
