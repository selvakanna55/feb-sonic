package oops.inheritance;

class Mobile{
    int ram;
    int memory;

    void dial(int number){
        System.out.println("calling "+number);
    }

    void printDateTime(){
        System.out.println("14th April 10:49");
    }

}

class KeyPadMobile extends Mobile{
    int noOfKeys;
    String keySound;

    void dial(int number){
//        super.dial(number);
        System.out.println("Dialing in keypad phone"+number);
    }
}

class TouchMobile extends Mobile{
    void videoCall() {
        System.out.println("video calling");
    }
    void dial(int number){
        System.out.println("Dialing in touch phone"+number);
    }
}


public class SImpleInheritance {
    public static void main(String[] args) {
        KeyPadMobile km = new KeyPadMobile();
        km.ram = 25;
        km.memory = 100;
        System.out.println(km.ram);
        System.out.println(km.memory);
        km.dial(100);

        TouchMobile tm = new TouchMobile();
        tm.ram = 4096;
        tm.memory = 10000000;
        System.out.println(tm.ram);
        System.out.println(tm.memory);
        tm.dial(101);
    }
}
