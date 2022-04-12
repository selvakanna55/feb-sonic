package Prefix_Kadane;


import java.util.*;

class LeftMax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxArray[] = new int[n];
        maxArray[n - 1] = arr[n - 1];
        //find max on right side
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < maxArray[i + 1]) {
                maxArray[i] = arr[i];
            } else {
                maxArray[i] = maxArray[i + 1];
            }
        }
        System.out.println(Arrays.toString(maxArray));
    }
}