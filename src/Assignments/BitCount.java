package Assignments;

import java.util.Scanner;

public class BitCount {
    static int countSetBits(long n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countSetBits(sc.nextLong()));
    }
}
