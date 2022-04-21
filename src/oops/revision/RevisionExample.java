package oops.revision;

//class -> blue print
// obj -> real world entity, exists with its own behaviour

// naming
// class -> capital letter
// function -> camel case

// variables and functions


public class RevisionExample {
    // static -> for usage obj creation is not needed
    static int sum(int a, int b){
        System.out.println("2 args sum is called");
        return  a+b;
    }
    static int sum(int a, int b, int c){
        System.out.println("3 args sum is called");
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        Student s1 = new Student("Newton", 'M');
        Student s2 = new Student();
        s1.percentage = 99.5;
//        s1.rollNo = 100;
        s1.setRollNo(100);

        System.out.println(s1.percentage);
        System.out.println(s1.gender);
        System.out.println(s1.name);
//        System.out.println(s1.rollNo);
        System.out.println(s1.getRollNo());
    }
}
