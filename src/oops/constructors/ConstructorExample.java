package oops.constructors;


import java.util.Scanner;

class Student{

    Student(String studName, double studPercentage, char studGender){
        System.out.println("3 args provided");
        name = studName;
        percentage = studPercentage;
        gender = studGender;
    }

    Student(){
        System.out.println("No args provided");
    }

    Student(String studName){
        System.out.println("1 arg provided");
        name = studName;
    }

    String name;
    int rollNo;
    double percentage;
    char gender;

}
public class ConstructorExample {
    static  int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int x = sum(10, 20);
        Student s1 = new Student("Newton", 99.1, 'M');
        Student s2 = new Student();
        Student s3 = new Student("ABcd");
        Scanner sc = new Scanner(System.in);
        System.out.println(s1.name);
        System.out.println(s1.percentage);
    }
}
