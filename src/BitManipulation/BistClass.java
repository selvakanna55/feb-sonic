package BitManipulation;

public class BistClass {
    static  int findMissingNumber(int arr[], int n){
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = ans ^ i;
        }
        for(int i=0;i<n-1;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5, 4, 1, 3};
        System.out.println(findMissingNumber(arr, n));
    }
}
