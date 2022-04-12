package Prefix_Kadane;

import java.util.Scanner;

public class PrefixArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // prefix array
        int prefix[] = new int[n + 1];
        prefix[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        int q = sc.nextInt();
        for (int j = 0; j < q; j++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = prefix[r] - prefix[l - 1];
            System.out.println(sum);
        }
    }
}
