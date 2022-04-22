package stl_collections;

class Student{
    int roll;
    String name;
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}

public class BubblePairArray {
    static int comparator(int a, int b){
        //arr[j]<arr[j+1] return
//        if(a<b) return 1; //
//        else return 0;
        return a-b;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // desc
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
//                if(arr[j]<arr[j+1]==true){
                // 5 -4
                if(arr[j+1]-arr[j]>0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr) System.out.print(i+" ");

//
//        int arrr[] = new int[5];
//        Student arr3[] = new Student[5];
//
//        arrr[0] = 1;
//        Student obj = new Student(10, "Newton");
//        arr3[0] = obj;
//
//        System.out.println(arrr[0]);
//        System.out.println(arr3[0]);
//        System.out.println(arr3[0].roll);
//        System.out.println(arr3[0].name);


    }
}
