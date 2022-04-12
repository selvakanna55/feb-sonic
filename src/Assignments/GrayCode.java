package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GrayCode {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            int n  = sc.nextInt();
            int ans = n ^ (n>>1);
            System.out.println(ans);
            tc--;
        }
    }
}