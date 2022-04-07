package Assignments;

import java.util.Scanner;


class SimpleColours {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = k;
        for(int i=2;i<=n;i++){
            ans = (ans*(k-1));
            ans = ans%1000000007;
        }
        System.out.println(ans);
    }

}