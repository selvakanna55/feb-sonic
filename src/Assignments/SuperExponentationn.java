package Assignments;

import java.util.Scanner;

public class SuperExponentationn {
    static  long powRec(long a, long b, long mod){
        if(b==0) return 1;
        long powBby2 = powRec(a, b/2, mod);
        if(b%2==0) {
            return  (powBby2 * powBby2)%mod;
        }
        else{
            long tempPow = (a * powBby2)%mod;
            return  (tempPow * powBby2)%mod;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        long mod = 1000000007;
        while(testcase>0){
            long a, b, c;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            long pow1 = powRec(b, c, mod-1);
            long pow2 = powRec(a, pow1, mod);
            System.out.println(pow2);
            testcase--;
        }

    }
}