package Assignments;


import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int tc = 0; tc < t; tc++) {
            String temp1[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(temp1[0]);
            int k = Integer.parseInt(temp1[1]);
            String temp2[] = sc.nextLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(temp2[i]);
            }

            HashMap<Integer, Integer> hm = new HashMap<>();
            int sum = 0, maxLen = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];

                if (sum == k) {
                    maxLen = i + 1;
                }
                if (!hm.containsKey(sum)) {
                    hm.put(sum, i);
                }

                int diff = sum - k;
                if (hm.containsKey(diff)) { // if diff is alredey met in some other place
                    int len = i - hm.get(diff);
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }

            System.out.println(maxLen);
        }
    }
}