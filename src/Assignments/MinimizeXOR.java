package Assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MinimizeXOR {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int currXor = arr[i] ^ arr[i+1];
            if(minimum>currXor){
                minimum = currXor;
            }
        }
        System.out.println(minimum);
    }
}