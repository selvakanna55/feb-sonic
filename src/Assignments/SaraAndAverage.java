package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SaraAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) { // T: O(N), S:O(1)
            sum += arr[i];
            if (i < k) {
                System.out.print(sum / (i + 1) + " ");
            } else {
                sum -= arr[i - k];
                System.out.print((sum / k) + " ");
            }
        }
    }
}