package Assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ZeroWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int count[] = new int[2]; //0-> 0s count, 1-> 1s count
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            count[ch1 - '0']++;
            if (i >= k) {
                char ch2 = s.charAt(i - k);
                count[ch2 - '0']--;
            }

            if (i >= k - 1) {
                if (count[0] >= count[1]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
