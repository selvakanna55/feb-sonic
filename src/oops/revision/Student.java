package oops.revision;

public class Student {
    Student(){
        System.out.println("Student created without any arguments");
    }
    Student(String name, char gender){
        System.out.println("Constructor is called");
        this.name = name;
        this.gender = gender;
    }
    String name;
    private int rollNo;
    char gender;
    double percentage;
    final String school = "ABCD school";

    // getter function
    int getRollNo(){
        return rollNo;
    }

    // setter function
    void setRollNo(int roll){
        rollNo = roll;
    }
}
