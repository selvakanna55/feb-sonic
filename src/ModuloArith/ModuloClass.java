package ModuloArith;

public class ModuloClass {
    static  void aplusbmodc(){
        int a = 2147483647, b = 2;
        int ans = a+b;
        System.out.println(ans);
        System.out.println(ans%7);

        int ans2 = ((a%7) + (b%7)) %7;
        System.out.println(ans2);

        // take a mod 7
    }


    static int fact(int n, int mod){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = (ans*i)%mod;
        }
        return ans;
    }




    //T: O(b)
    static  int pow(int a, int b, int mod){
        int ans = 1;
        for(int i=1;i<=b;i++){
            ans = (ans*a)%mod;
        }
        return ans;
    }

    static  int powRec(int a, int b, int mod){
        if(b==0) return 1;
        int powBby2 = powRec(a, b/2, mod);
        if(b%2==0) {
            return  (powBby2 * powBby2)%mod;
        }
        else{
            int tempPow = (a * powBby2)%mod;
            return  (tempPow * powBby2)%mod;
        }
    }

    static int rev(int n){
        int res = 0;
        while(n>0){
            int lastDigit = n%10;
            res = (res*10) + lastDigit;
            n = n/10;
        }
        return  res;
    }




    public static void main(String[] args) {
        System.out.println(rev(12345));


    }
}
