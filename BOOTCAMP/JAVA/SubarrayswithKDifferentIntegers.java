

import java.util.HashMap;
import java.util.Map;

public class SubarrayswithKDifferentIntegers {
    class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int most1=atmost(nums,k);
        int most2=atmost(nums,k-1);
        return most1-most2;
    }
    private  int atmost(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int left =0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left ++;

            }
            count+=right-left+1;
        }
        return count;
    }
}
}
