package oops.basics;

class Student{
    int rollNo;
    String name;
    int age;
    char gender;
    double percentage;
    String address;

    void sayHello(){
        System.out.println("Hello!!");
    }
}


public class StudentMarksExample {
    public static void main(String[] args) {
        Student newton = new Student();
        newton.rollNo = 140;
        newton.name = "Newton";
        newton.age = 40;
        newton.gender = 'M';
        newton.percentage = 99.5;
        newton.address = "No.5, abcd st, xyz";

        System.out.println(newton.rollNo);
        System.out.println(newton.name);
        System.out.println(newton.age);
        System.out.println(newton.gender);
        System.out.println(newton.percentage);
        System.out.println(newton.address);
        newton.sayHello();
    }
}
