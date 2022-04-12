package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaximumContiguousSubarraySum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long maximum = 0, currSum = 0;
            for(int i=0;i<n;i++){
                currSum+=arr[i];
                if(currSum>maximum){
                    maximum = currSum;
                }
                if(currSum<0){
                    currSum = 0;
                }
            }
            System.out.println(maximum);
            t--;
        }
    }
}