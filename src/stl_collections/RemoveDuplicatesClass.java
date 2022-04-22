package stl_collections;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class RemoveDuplicatesClass {
    public int removeDuplicates(int[] nums) {
        // LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     hs.add(nums[i]);
        // }
        // int i = 0;
        // for(int num:hs){
        //     nums[i] = num;
        //     i++;
        // }
        // return hs.size();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int freq = hm.get(nums[i]);
                hm.put(nums[i], freq+1);
            }
            else{
                hm.put(nums[i], 1);
            }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(hm);
        ArrayList<Integer> li = new ArrayList<>();

        for(int num:hm.keySet()){
            if(hm.get(num)==1){
                li.add(num);
            }
        }
        System.out.println(li);

        return 0;
    }
}