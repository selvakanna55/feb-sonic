package queue;

public class SlideWindow {
    void brute(int arr[], int k){
        int ans = 0;
        for(int i=0;i<=arr.length-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum +=arr[j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-7, 6, 13, 9,14, 2};
        int k = 2;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i>=k){
                sum -=arr[i-k];
            }
            if(i>=k-1 && ans<sum) {
                ans = sum;
            }
        }
        System.out.println(ans);

        //HashMap<>
        //Map
        //recursion

    }
}
