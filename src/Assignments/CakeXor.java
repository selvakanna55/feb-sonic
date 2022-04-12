package Assignments;

import java.util.Scanner;

public class CakeXor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int xor = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            xor = xor^arr[i];
        }
        for(int i:arr){
            System.out.print((xor^i)+" ");
        }
    }

}
