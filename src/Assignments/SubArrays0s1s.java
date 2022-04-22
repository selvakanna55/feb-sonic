package Assignments;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrays0s1s {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num==0) num = -1;
            arr[i] = num;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        long ans = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) ans++;
            if(hm.containsKey(sum)){
                int freq = hm.get(sum);
                ans+=freq;
                hm.put(sum, freq+1);
            }else hm.put(sum,1);
        }
        System.out.println(ans);

    }
}
