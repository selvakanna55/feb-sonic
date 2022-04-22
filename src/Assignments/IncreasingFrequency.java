package Assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class IncreasingFrequency {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        // System.out.println(hm);
        ArrayList<Integer> li = new ArrayList<>();
        for(int num:hm.keySet()){
            li.add(num);
            // System.out.print(num+" ");
        }
        // System.out.println(li);
        Collections.sort(li, (a, b)->{
            if(hm.get(a)==hm.get(b)){ // if both a and b count is same
                return b-a;
            }else{
                return hm.get(a)-hm.get(b);
            }
        });
        for(int num:li){
            for(int i=0;i<hm.get(num);i++){
                System.out.print(num+" ");
            }
        }

    }
}