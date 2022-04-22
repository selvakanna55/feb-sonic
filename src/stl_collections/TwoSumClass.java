package stl_collections;


import java.util.HashMap;

class TwoSumClass {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int y = target-x;
            if(hm.containsKey(x)){
                arr[0] = i;
                arr[1] = hm.get(nums[i]);
                break;
            }
            else hm.put(y, i);
        }
        return arr;
    }
}