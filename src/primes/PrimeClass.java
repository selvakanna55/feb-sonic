package primes;

public class PrimeClass {
    // T: O(n) S:O(1)
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    //T: Sqrt(n) S: O(1)
    static void factorsSqrt(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i) System.out.print(n/i+" ");
            }
        }
        System.out.println();
    }

    // T:O(sqrt(n)) O(1)
    static void primeFactors(int n){
        while(n%2==0){
            n = n/2;
            System.out.print(2+" ");
        }
        // 17
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                n = n/i;
                System.out.print(i+" ");
            }
        }
        if(n>1){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    // O(n) , O(1)
    static boolean isPrime(int n){
        if(n<=1){
            System.out.println("not prime");
            return false;
        }
        if(n==2){
            System.out.println("prime");
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not prime");
                return false;
            }
        }
        System.out.println("prime");
        return true;
    }
    //T:Sqrt(n) //S:O(1)
    static boolean isPrimeSqrtN(int n){
        if(n<=1){
            System.out.println("not prime");
            return false;
        }
        if(n==2){
            System.out.println("prime");
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("not prime");
                return false;
            }
        }
        System.out.println("prime");
        return true;
    }

    // T:O(N*log*logn) S:O(n)
    static  void printPrimeTillN(int n){
        //assume all are prime numbers
        boolean isPrime[] = new boolean[n+1];
        for(int i=0;i<=n;i++){
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime[i]==true){ // 4 //6  false
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=0;i<=n;i++){
            if(isPrime[i]==true){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        printPrimeTillN(100);
    }
}
