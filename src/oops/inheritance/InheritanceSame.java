package oops.inheritance;

class Box{
    int side;
}

class Square extends Box{
    int area(){
        return side*side;
    }
}

class Rectangle extends Box{
    int l;
    int b;

    int area(){
        return l*b;
    }
}

public class InheritanceSame {
    public static void main(String[] args) {
       Animal am = new Animal(1);
//       am.age = 1;
        System.out.println(am.age);
    }
}


class Animal{
    int age;
    Animal(int age){
        this.age = age;
        System.out.println("Creating new animal");
    }
    void sound(){
        System.out.println("this is animal sound");
    }
}
