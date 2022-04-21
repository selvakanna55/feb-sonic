package hashingclass;

import java.util.ArrayList;

class Student{
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    String name;
    int roll;
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Student> li = new ArrayList<>();
        Student s1= new Student("Newton", 21);
        li.add(s1);
        li.add(new Student("ABCD", 99));
        li.add(new Student("fkjv", 911));
        System.out.println(li);
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i).name+" "+li.get(i).roll);
        }
    }
}
