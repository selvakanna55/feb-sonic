package oops.revision;

class Animal{
    int age;
    String name;
    void eat(String food){
        // weight = getWeight(food);
        System.out.println("Eating food "+food);
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.age =3;
        c1.sound();
        System.out.println(c1.age);
    }
}
