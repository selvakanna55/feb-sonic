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

    static  int powLog(int a, int b, int mod){
        if(b==0) return 1;
        if(b%2==0) return powLog(a, b/2, mod) * powLog(a, b/2, mod);
        else return a*powLog(a, b/2, mod) * powLog(a, b/2, mod);
    }

    public static void main(String[] args) {
        int mod = 47;
        System.out.println(Math.pow(2, 10)%47);
        System.out.println(pow(2, 10, mod));
    }
}
