package Prefix_Kadane;

public class SubArraySum {
    static void kadane() {
        int arr[] = {10, 8, 1, 6, 1};
        int n = arr.length;
        long maximum = 0, currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum > maximum) {
                maximum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maximum);
    }

    static void bruteForcePrintAllSubArrays() {

        System.out.println("Begin");
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

            }
        }

        System.out.println("End");
    }

    static void bruteForcesubArrayMaximumSum(){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int maximumSum = 0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //i->j
                int  sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>maximumSum){
                    maximumSum = sum;
                }
            }
        }

        System.out.println(maximumSum);
    }



    public static void main(String[] args) {
        bruteForcePrintAllSubArrays();
        bruteForcesubArrayMaximumSum();
        kadane();
    }
}

