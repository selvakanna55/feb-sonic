package Assignments;

public class FirstTwoo {
    static int firstTwo(int n){
        while(n>99){
            n = n/10;
        }

        int res = 0;
        while(n>0){
            int lastDigit = n%10;
            res = (res*10) + lastDigit;
            n = n/10;
        }
        return res;
    }
}

